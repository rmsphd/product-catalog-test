package br.sienna.rafael.productcatalogtest.task2.catalog;

/**
 * Created by rafael on 07/05/17.
 */
public class DoubleNumberRule {

    public void validate(String name, String value) {
        try {
            if (value != null && !value.trim().isEmpty()) {
                Double.parseDouble(value);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(name + " is not a valid double");
        }
    }
}
