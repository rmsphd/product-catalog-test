package br.sienna.rafael.productcatalogtest.task2;

import br.sienna.rafael.productcatalogtest.task2.catalog.Catalog;
import br.sienna.rafael.productcatalogtest.task2.catalog.CatalogRepository;
import br.sienna.rafael.productcatalogtest.task2.catalog.CatalogService;
import br.sienna.rafael.productcatalogtest.task2.cms.Cms;
import br.sienna.rafael.productcatalogtest.task2.cms.CmsRepository;
import br.sienna.rafael.productcatalogtest.task2.stock.Stock;
import br.sienna.rafael.productcatalogtest.task2.stock.StockRepository;
import br.sienna.rafael.productcatalogtest.task2.wms.Product;
import br.sienna.rafael.productcatalogtest.task2.wms.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by rafael on 08/04/17.
 */
@SpringBootApplication
public class Task2Application implements CommandLineRunner{

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CmsRepository cmsRepository;

    @Autowired
    private CatalogService catalogService;

    @Autowired
    private CatalogRepository catalogRepository;

    public static void main(String[] args) {
        SpringApplication.run(Task2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        initDataBase();
        catalogService.processCatalog();

        for (Catalog catalog : catalogRepository.findAll()) {
            System.out.println("############# CATALOG #############");
            System.out.println(catalog);
        }
    }

    private void initDataBase() {
        stockRepository.deleteAll();
        cmsRepository.deleteAll();
        catalogRepository.deleteAll();

        for (Product product : productRepository.findAll()) {

            for (String size : product.size) {
                Stock stock = new Stock();
                stock.sku = product.sku;
                stock.quantity = 10;
                stock.size = size;
                stock.warehouse = "centro";
                stockRepository.save(stock);
            }

            for (String category : product.categories) {
                Cms cms = new Cms();
                cms.sku = product.sku;
                cms.category = category;
                cms.content = "Teste conteudo CMS";
                cms.region = "sudeste";
                cmsRepository.save(cms);
            }

        }
    }

}
