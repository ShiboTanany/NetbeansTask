/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author shibo
 */
@Path("object")
public class testObject {
   private static Map<Integer, Customer> customers = new HashMap<Integer, Customer>();

    @POST
    @Path("save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String save(Customer c) {

//        customers.put(c.getId(), c);
//
//        SaveResult sr = new SaveResult();
//        sr.sucess = true;
        return c.getName();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Customer getCustomer(@PathParam("id") int id) {
        Customer c = customers.get(id);
        if (c == null) {
            c = new Customer();
            c.setId(id * 3);
            c.setName("unknow " + id);
        }
        return c;
    }

}