package ua.lviv.iot.java.labs.forth.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan
public class RestApplication extends SpringBootServletInitializer {

  
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(RestApplication.class);
  }

  public static void main(String[] args) {

    new RestApplication().configure(
        new SpringApplicationBuilder(RestApplication.class)).run(args);

  }
}
