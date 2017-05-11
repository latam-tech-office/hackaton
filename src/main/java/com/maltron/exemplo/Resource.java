package com.maltron.exemplo;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Mauricio "Maltron" Leal <maltron at gmail dot com> */
@Path("/exemplo")
public class Resource implements Serializable {

    private static final Logger LOG = Logger.getLogger(Resource.class.getName());
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response myName() {
        return Response.ok("Maltron").build();
    }
}
