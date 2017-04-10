package br.sienna.rafael.productcatalogtest.task2.cms;

import br.sienna.rafael.productcatalogtest.task2.wms.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

/**
 * Created by rafael on 09/04/17.
 */
public class Cms {

    @Id
    @JsonIgnore
    public String id;

    public Product product;
    public String content;
    public String region;

    @Override
    public String toString() {
        return "Cms{" +
                "id='" + id + '\'' +
                ", product=" + product +
                ", content='" + content + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
