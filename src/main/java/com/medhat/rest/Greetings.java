package com.medhat.rest;


import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path( "/")
public class Greetings {


    @GET
    @Path("/employee")
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed(value = { "employee" })
    public String sayHelloToEmployee(){
        return "Hello Em POH! LEE!!HHH >:c";
    }

    @GET
    @Path("/manager")
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed(value = { "Manager" })
    public String sayHelloToManager(){
        return "Hello Mana gar :D";
    }
}
