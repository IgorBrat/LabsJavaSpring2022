package ua.lviv.iot.java.labs.forth.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.springframework.beans.factory.annotation.Autowired;
import ua.lviv.iot.java.labs.forth.logic.ChildShopService;
import ua.lviv.iot.java.labs.forth.models.Clothes;


@Path("/")
public class RestController {

  @Autowired
  private ChildShopService childShopService;

  @GET
  @Path("clothes")
  @Produces(MediaType.APPLICATION_JSON)
  public Response getAllClothes() {
    return Response.ok(childShopService.findAll()).build();
  }

  @GET
  @Path("clothes/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public Response getById(@PathParam("id") Integer id) {
    var item = childShopService.findById(id);
    if (item.isEmpty()) {
      return Response.status(Status.BAD_REQUEST).entity("Object with that id doesn`t exist.")
          .build();
    }
    return Response.ok(childShopService.findById(id)).build();
  }

  @POST
  @Path("{id}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.TEXT_PLAIN)
  public Response saveItem(Clothes item) {
    childShopService.saveItem(item);
    return Response.status(Status.OK).entity("Saved object in db.").build();
  }

  @PUT
  @Path("{id}")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public Response resaveItem(@PathParam("id") Integer id, Clothes item) {
    boolean isResaved = childShopService.resaveItem(id, item);
    if (isResaved) {
      return Response.status(Status.OK).entity("Resaved object with that id.").build();
    }
    return Response.status(Status.BAD_REQUEST)
        .entity("There was no object with that id. Saved as a new object.").build();
  }

  @DELETE
  @Path("{id}")
  @Produces(MediaType.TEXT_PLAIN)
  public Response deleteItem(@PathParam("id") Integer id) {
    boolean isDeleted = childShopService.deleteItem(id);
    if (isDeleted) {
      return Response.status(Status.OK).entity("Deleted object with that id.").build();
    }
    return Response.status(Status.BAD_REQUEST).entity("There was no object with that id.").build();
  }

}
