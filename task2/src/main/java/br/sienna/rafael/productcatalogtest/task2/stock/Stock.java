package br.sienna.rafael.productcatalogtest.task2.stock;

import br.sienna.rafael.productcatalogtest.task2.wms.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

/**
 * Created by rafael on 09/04/17.
 */
public class Stock {

    @Id
    @JsonIgnore
    public String id;

    public Product product;
    public String size;
    public Integer quantity;
    public String warehouse;

    @Override
    public String toString() {
        return "Stock{" +
                "id='" + id + '\'' +
                ", product=" + product +
                ", size='" + size + '\'' +
                ", quantity=" + quantity +
                ", warehouse='" + warehouse + '\'' +
                '}';
    }
}
