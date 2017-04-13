/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jersey;

import javax.ws.rs.*;

/**
 *
 * @author shibo
 */
@Path("/test")
public class Test {

    @GET
    @Path("/t")
    public String get() {

        return "dsds";
    }

}
