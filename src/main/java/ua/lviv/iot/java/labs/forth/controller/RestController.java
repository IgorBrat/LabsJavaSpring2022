package ua.lviv.iot.java.labs.forth.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Component;

@Path("/")
@Component
public class RestController {

  @GET
  @Path("/ping")
  @Produces
  public Response ping() {
    return Response.ok().entity("Service online").build();
  }
}
