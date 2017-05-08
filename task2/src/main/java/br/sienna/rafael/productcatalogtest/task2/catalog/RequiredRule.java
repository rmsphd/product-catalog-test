package br.sienna.rafael.productcatalogtest.task2.catalog;

/**
 * Created by rafael on 07/05/17.
 */
public class RequiredRule {

    public void validate(String name, String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(name + " is required");
        }
    }
}
