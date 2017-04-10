package br.sienna.rafael.productcatalogtest.task2.wms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by rafael on 09/04/17.
 */
public class Product {

    @Id
    @JsonIgnore
    public String id;

    public String sku;
    public String price;
    public String name;
    public String description;
    public String size;
    public String brand;
    public List<String> categories;
    public String product_image_url;
    public String special_price;

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", sku='" + sku + '\'' +
                ", price='" + price + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", categories=" + categories +
                ", product_image_url='" + product_image_url + '\'' +
                ", special_price='" + special_price + '\'' +
                '}';
    }
}
