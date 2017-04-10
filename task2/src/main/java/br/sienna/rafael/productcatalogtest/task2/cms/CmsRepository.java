package br.sienna.rafael.productcatalogtest.task2.cms;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rafael on 09/04/17.
 */
public interface CmsRepository extends MongoRepository<Cms, String> {

}
