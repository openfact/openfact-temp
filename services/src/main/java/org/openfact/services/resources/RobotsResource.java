package org.openfact.services.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author carlosthe19916@sistcoop.com
 */
@Path("/robots.txt")
public class RobotsResource {

    private static final String robots = "User-agent: *\n" + "Disallow: /";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getRobots() {
        return robots;
    }

}
