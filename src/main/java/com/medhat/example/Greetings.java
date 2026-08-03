package com.medhat.example;


import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.SecurityContext;

@Path( "/")
public class Greetings {


    @GET
    @Path("/employee")
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed(value = { "Employee" })
    public String sayHelloToEmployee(){
        return "Hello Em POH! LEE!!HHH >:c";
    }

    @GET
    @Path("/manager")
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed(value = { "Manager" })
    public String sayHelloToManager(){
        return "Hello Manaaaaaaaaaaaaaaaa gaaaaaaaaaaaar :D";
    }

    //Something better c:
    @GET
    @Path("/dashboard")
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed(value = { "Employee", "Manager" })
    public String sayHelloToDashboard(@Context SecurityContext SecurityContext){
        if(SecurityContext.isUserInRole("Employee")){
            return "Welcome to your dashboard MR EM POOOH LEEEH >:C";
        }
        else if(SecurityContext.isUserInRole("Manager")){
            return "Welcome to your dashboard MANAGER :D <3";
        }
        else{
            return "You are not authorized to access this page";
        }

    }
}
