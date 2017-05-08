package br.sienna.rafael.productcatalogtest.task2.catalog;

/**
 * Created by rafael on 07/05/17.
 */
public class ImageUrlRule {

    public void validate(String name, String value) {
        if (!value.matches("^(http(s?))?://(?:[a-z0-9-]+.)+[a-z]{2,6}(?:/[^/#?]+)+.(?:jpg|jpeg|gif|png)$")) {
            throw new IllegalArgumentException(name + " is not a valid image url");
        }
    }
}
