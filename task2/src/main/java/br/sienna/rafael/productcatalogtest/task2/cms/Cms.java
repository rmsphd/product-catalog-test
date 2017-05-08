package br.sienna.rafael.productcatalogtest.task2.cms;

import br.sienna.rafael.productcatalogtest.task2.wms.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by rafael on 09/04/17.
 */
public class Cms {

    @Id
    @JsonIgnore
    public String id;

    public String sku;
    public String category;
    public String content;
    public String region;

    @Override
    public String toString() {
        return "Cms{" +
                "id='" + id + '\'' +
                ", sku='" + sku + '\'' +
                ", category='" + category + '\'' +
                ", content='" + content + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
