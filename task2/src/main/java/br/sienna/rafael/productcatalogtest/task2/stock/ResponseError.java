package br.sienna.rafael.productcatalogtest.task2.stock;

/**
 * Created by rafael on 09/04/17.
 */
public class ResponseError {
    public String code;
    public String message;

    public ResponseError(final String code, final String message) {
        this.code = code;
        this.message = message;
    }
}
