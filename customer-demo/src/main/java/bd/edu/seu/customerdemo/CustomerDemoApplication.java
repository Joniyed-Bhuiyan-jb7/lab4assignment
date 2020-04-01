package bd.edu.seu.customerdemo;

import bd.edu.seu.customerdemo.service.DummyDataService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CustomerDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(CustomerDemoApplication.class, args);
//        DummyDataService dummyDataService = run.getBean(DummyDataService.class);
//        dummyDataService.addDummyData();
    }

}
