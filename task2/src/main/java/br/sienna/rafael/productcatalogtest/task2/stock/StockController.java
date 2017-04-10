package br.sienna.rafael.productcatalogtest.task2.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by rafael on 09/04/17.
 */
@RestController
public class StockController {

    @Autowired
    private StockRepository stockRepository;

    @RequestMapping(path = "/stock", produces = "application/json")
    public List<Stock> getStock(@RequestParam("sku") final String sku, @RequestParam("size") final String size) {
        return stockRepository.findByProductSkuAndSize(sku, size);
    }

    @ExceptionHandler({IllegalArgumentException.class, MissingServletRequestParameterException.class})
    @ResponseBody
    ResponseEntity<Object> handleControllerException(HttpServletRequest req, Throwable ex) {

        return new ResponseEntity<>(new ResponseError("001", ex.getMessage()),HttpStatus.BAD_REQUEST);

    }

}
