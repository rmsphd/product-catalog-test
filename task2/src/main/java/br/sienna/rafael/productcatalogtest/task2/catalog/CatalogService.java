package br.sienna.rafael.productcatalogtest.task2.catalog;

import br.sienna.rafael.productcatalogtest.task2.cms.Cms;
import br.sienna.rafael.productcatalogtest.task2.cms.CmsService;
import br.sienna.rafael.productcatalogtest.task2.stock.StockRepository;
import br.sienna.rafael.productcatalogtest.task2.wms.Product;
import br.sienna.rafael.productcatalogtest.task2.wms.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rafael on 07/05/17.
 */
@Service
public class CatalogService {

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CmsService cmsService;

    @Autowired
    private CatalogRepository catalogRepository;

    public void processCatalog() {

        for (Product product : productRepository.findAll()) {

            try {

                validateProduct(product);

                final Catalog catalog = new Catalog();
                catalog.product = product;

                for (String size : product.size) {
                    catalog.stocks.addAll(stockRepository.findBySkuAndSize(product.sku, size));
                }

                for (String category : product.categories) {
                    catalog.cms.addAll(cmsService.findBySkuAndCategory(product.sku, category));
                }

                if (catalog.cms.isEmpty()) {
                    Cms defaultPlaceholder = new Cms();
                    defaultPlaceholder.content = "DEFAULT PLACEHOLDER CONTENT";
                    defaultPlaceholder.region = "ALL";
                    catalog.cms.add(defaultPlaceholder);
                }

                validateCatalog(catalog);

                catalogRepository.save(catalog);

            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
            }

        }

    }

    private void validateProduct(Product product) {
        RequiredRule requiredRule = new RequiredRule();
        RequiredListRule requiredListRule = new RequiredListRule();
        DoubleNumberRule doubleNumberRule = new DoubleNumberRule();
        ImageUrlRule imageUrlRule = new ImageUrlRule();

        requiredRule.validate("sku", product.sku);
        requiredRule.validate("price", product.price);
        requiredRule.validate("name", product.name);
        requiredRule.validate("description", product.description);
        requiredRule.validate("brand", product.brand);
        requiredRule.validate("product_image_url", product.product_image_url);

        requiredListRule.validate("size", product.size);
        requiredListRule.validate("categories", product.categories);

        doubleNumberRule.validate("price", product.price);
        doubleNumberRule.validate("special_price", product.special_price);

        imageUrlRule.validate("product_image_url", product.product_image_url );
    }

    private void validateCatalog(Catalog catalog) {
        RequiredListRule requiredListRule = new RequiredListRule();

        requiredListRule.validate("stocks", catalog.stocks);
    }
}
