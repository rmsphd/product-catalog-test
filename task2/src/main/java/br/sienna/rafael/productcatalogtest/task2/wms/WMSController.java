package br.sienna.rafael.productcatalogtest.task2.wms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rafael on 08/04/17.
 */
@RestController
public class WMSController {

    @Autowired
    private ProductRepository repository;

    @RequestMapping("/wms")
    public List<Product> getList() {

        return repository.findAll();

    }
}
