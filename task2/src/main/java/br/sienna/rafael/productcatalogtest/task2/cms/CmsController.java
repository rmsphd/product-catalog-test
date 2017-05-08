package br.sienna.rafael.productcatalogtest.task2.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rafael on 09/04/17.
 */
@RestController
public class CmsController {

    @Autowired
    private CmsService cmsService;

    @RequestMapping("/cms")
    public List<Cms> getCms(
            @RequestParam(name="sku", required = false) final String sku,
            @RequestParam(name="category", required = false) final String category) {

        return cmsService.findBySkuAndCategory(sku, category);
    }
}
