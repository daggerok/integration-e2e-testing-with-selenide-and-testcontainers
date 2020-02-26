package daggerok;

import javax.enterprise.context.RequestScoped;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("api")
@RequestScoped
public class ApiResource {

  @GET
  @Path("names")
  @Produces(MediaType.APPLICATION_JSON)
  public JsonObject getNames() {
    return Json.createObjectBuilder()
               .add("ololo", "trololo")
               .build();
  }
}
