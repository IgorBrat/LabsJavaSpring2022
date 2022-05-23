package ua.lviv.iot.java.labs.forth.application;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import ua.lviv.iot.java.labs.forth.controller.RestController;

@Component
public class JerseyConfig extends ResourceConfig{
  public JerseyConfig() {
    register(RestController.class);
    System.out.println("registered Jersey");
  }
}
