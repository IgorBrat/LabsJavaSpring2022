package ua.lviv.iot.java.labs.forth.controller;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import ua.lviv.iot.java.labs.forth.logic.ChildShopService;
import ua.lviv.iot.java.labs.forth.models.Clothes;
import ua.lviv.iot.java.labs.forth.models.Good;

@Path("/")
public class RestController {
  
  @Autowired
  private ChildShopService childShopService; 
  
  @GET
  @Path("clothes")
  @Consumes("application/json")
  @Produces("application/json")
  public List<Good> getAllGoods(){
    return childShopService.findAll();
  }
  
  @GET
  @Path("clothes/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Clothes getById(@PathParam("id") Integer id) {
    return childShopService.findById(id);
  }
  
}
