/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatewebservice;

import javax.xml.ws.Endpoint;

/**
 *
 * @author shibo
 */
public class publish {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8980/test", new HibernateWebService());
        System.out.println("publishing");
    }
}
