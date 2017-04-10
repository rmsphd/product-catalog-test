package br.sienna.rafael.productcatalogtest.task2.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

/**
 * Created by rafael on 09/04/17.
 */
@Service
public class CmsService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Cms> findByProductSkuAndCategory(final String sku, final String category) {
        Query query = new Query();
        if (!StringUtils.isEmpty(sku)) {
            query.addCriteria(where("product.sku").is(sku));
        }
        if (!StringUtils.isEmpty(category)) {
            query.addCriteria(where("product.categories").is(category));
        }
        return mongoTemplate.find(query, Cms.class);
    }
}
