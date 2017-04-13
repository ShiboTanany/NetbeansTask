/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwebservice1;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author shibo
 */
@WebService
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,
parameterStyle=SOAPBinding.ParameterStyle.BARE)

public class TestWebService1 {

    String welcomeMessage = "hello ya ";

    public String pritnHello(String x) {

        return welcomeMessage + x;
    }

}
