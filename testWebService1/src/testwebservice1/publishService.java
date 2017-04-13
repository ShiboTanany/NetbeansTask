/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwebservice1;

import javax.xml.ws.Endpoint;

/**
 *
 * @author shibo
 */
public class publishService {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8780/test",new TestWebService1());
        System.out.println("publishing");
    }
}
