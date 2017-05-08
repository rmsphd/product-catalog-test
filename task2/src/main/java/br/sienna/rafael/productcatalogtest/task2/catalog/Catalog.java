package br.sienna.rafael.productcatalogtest.task2.catalog;

import br.sienna.rafael.productcatalogtest.task2.cms.Cms;
import br.sienna.rafael.productcatalogtest.task2.stock.Stock;
import br.sienna.rafael.productcatalogtest.task2.wms.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 07/05/17.
 */
public class Catalog {

    @Id
    @JsonIgnore
    public String id;

    public Product product;

    public List<Stock> stocks;

    public List<Cms> cms;

    public Catalog() {
        cms = new ArrayList<>();
        stocks = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id='" + id + '\'' +
                ", product=" + product +
                ", stocks=" + stocks +
                ", cms=" + cms +
                '}';
    }
}
