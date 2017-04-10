package br.sienna.rafael.productcatalogtest.task2.wms;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rafael on 09/04/17.
 */
public interface ProductRepository extends MongoRepository<Product, String> {

}
