package services;


import javax.ws.rs.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shibo
 */
@Path("test")
public class test {
    
    
    @GET
    @Path("/g")
    public String getName(){
    
    return "dsds";}
}
