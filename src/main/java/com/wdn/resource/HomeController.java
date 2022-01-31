package com.wdn.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HomeController {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "Start page";
    }
}
