package br.sienna.rafael.productcatalogtest.task2.stock;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by rafael on 09/04/17.
 */
public interface StockRepository extends MongoRepository<Stock, String> {

    @Query(value="{ 'sku' : ?0, 'size': ?1 }", fields="{'quantity':1, 'warehouse':1}")
    public List<Stock> findBySkuAndSize(final String sku, final String size);
}
