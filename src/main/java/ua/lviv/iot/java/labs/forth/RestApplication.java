package ua.lviv.iot.java.labs.forth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("ua.lviv.iot")
public class RestApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {

    SpringApplication.run(RestApplication.class, args);

  }
  
}
