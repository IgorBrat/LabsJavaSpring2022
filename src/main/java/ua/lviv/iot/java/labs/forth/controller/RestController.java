package ua.lviv.iot.java.labs.forth.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import ua.lviv.iot.java.labs.forth.models.Clothes;
import ua.lviv.iot.java.labs.forth.models.ClothesSize;
import ua.lviv.iot.java.labs.forth.models.ClothesType;
import ua.lviv.iot.java.labs.forth.models.Gender;
import ua.lviv.iot.java.labs.forth.models.Season;

@Path("/")
public class RestController {

  @GET
  @Path("clothes")
  public String testGetGood() {
    return new Clothes("Red leather jacket for boy", 600, Gender.FEMALE, true, 17645219,
        "Turkey", ClothesType.JACKET, ClothesSize.L, "leather", Season.AUTUMN, "still bloody red").toString();
  }
}
