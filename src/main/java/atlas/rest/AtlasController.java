package atlas.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import atlas.api.Atlas;
import atlas.api.Country;
import atlas.biz.BasicAtlas;

@Path("/atlas")
public class AtlasController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/country/{cname}")
	public Response read(@PathParam("cname") String cname){
		Atlas atlas = new BasicAtlas();
		Country country = atlas.getCountry(cname);
		return Response.ok().entity(country).build();
	}
}
