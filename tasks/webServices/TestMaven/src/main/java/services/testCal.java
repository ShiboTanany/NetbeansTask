package services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shibo
 */
@Path("/hello")
public class testCal {
    
    
      @GET
    @Path("/{num1}/{op}/{num2}")
    public String cal(@PathParam("num1") String num1, @PathParam("op") String  op, @PathParam("num2") String num2) {
        String msg = "";
        
         System.out.println(""+num1+num2);
        try {
            double numFirst = Double.parseDouble(num1);
            double numSecond = Double.parseDouble(num2);

            switch (op) {
                case "add":
                    msg = numFirst + numSecond + "";
                    break;
                case "-":
                    msg = numFirst - numSecond + "";
                    break;
                case "*":
                    msg = numFirst * numSecond + "";
                    break;
                case "%":
                    msg = numFirst % numSecond + "";
                    break;
                case "/":

                    //try{
                    msg = numFirst / numSecond + "";//}
                    /*catch(Exception ex){
			System.out.println("u can not divide on zero number");			
			}*/
                    break;
                default:
                    msg = "please make sure that u eneter a operation";

            }

        } catch (Exception ex) {
            ;
            msg = "error";
        }

        return msg;
    }


}