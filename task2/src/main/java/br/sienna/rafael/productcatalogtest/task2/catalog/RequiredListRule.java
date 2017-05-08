package br.sienna.rafael.productcatalogtest.task2.catalog;

import java.util.List;

/**
 * Created by rafael on 07/05/17.
 */
public class RequiredListRule {

    public void validate(String name, List value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(name + " is required");
        }
    }
}
