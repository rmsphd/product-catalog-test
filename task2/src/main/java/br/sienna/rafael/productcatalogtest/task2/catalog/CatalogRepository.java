package br.sienna.rafael.productcatalogtest.task2.catalog;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rafael on 07/05/17.
 */
public interface CatalogRepository extends MongoRepository<Catalog, String> {
}
