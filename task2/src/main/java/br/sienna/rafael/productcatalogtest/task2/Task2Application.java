package br.sienna.rafael.productcatalogtest.task2;

import br.sienna.rafael.productcatalogtest.task2.cms.CmsRepository;
import br.sienna.rafael.productcatalogtest.task2.stock.StockRepository;
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

    public static void main(String[] args) {
        SpringApplication.run(Task2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        stockRepository.deleteAll();
//        cmsRepository.deleteAll();
//
//        for (Product product : productRepository.findAll()) {
//            Stock stock = new Stock();
//            stock.product = product;
//            stock.quantity = 10;
//            stock.size = "unico";
//            stock.warehouse = "centro";
//            stockRepository.save(stock);
//
//            Cms cms = new Cms();
//            cms.product = product;
//            cms.content = "Teste conteudo CMS";
//            cms.region = "sudeste";
//            cmsRepository.save(cms);
//        }

    }
}
