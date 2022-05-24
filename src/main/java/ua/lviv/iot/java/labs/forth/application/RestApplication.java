package ua.lviv.iot.java.labs.forth.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import ua.lviv.iot.java.labs.forth.logic.ChildShopService;


@SpringBootApplication(
    scanBasePackageClasses = {ChildShopService.class, JerseyConfig.class})
public class RestApplication extends SpringBootServletInitializer{

  public static void main(String[] args) {

    SpringApplication.run(RestApplication.class, args);

  }
}
