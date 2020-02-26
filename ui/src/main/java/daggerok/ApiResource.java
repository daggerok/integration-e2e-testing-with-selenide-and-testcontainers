package daggerok;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.Map;

@Path("api")
@RequestScoped
public class ApiResource {

  @GET
  @Path("names")
  @Produces(MediaType.APPLICATION_JSON)
  public Map<String, String> getNames() {
    return Collections.singletonMap("ololo", "trololo");
  }
}
