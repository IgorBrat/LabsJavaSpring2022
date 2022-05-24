package ua.lviv.iot.java.labs.forth.controller;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import ua.lviv.iot.java.labs.forth.logic.ChildShopService;
import ua.lviv.iot.java.labs.forth.models.Clothes;
import ua.lviv.iot.java.labs.forth.models.ClothesSize;
import ua.lviv.iot.java.labs.forth.models.ClothesType;
import ua.lviv.iot.java.labs.forth.models.Gender;
import ua.lviv.iot.java.labs.forth.models.Good;
import ua.lviv.iot.java.labs.forth.models.Season;

@Path("/")
public class RestController {
  
  @Autowired
  private ChildShopService childShopService; 

  @GET
  @Path("clothes")
  public String testGetGood() {
    return new Clothes("Red leather jacket for boy", 600, Gender.FEMALE, true, 17645219,
        "Turkey", ClothesType.JACKET, ClothesSize.L, "leather", Season.AUTUMN, "still bloody red").toString();
  }
  
  @GET
  @Path("all")
  public List<Good> getGoods(){
    return childShopService.findAll();
  }
}
