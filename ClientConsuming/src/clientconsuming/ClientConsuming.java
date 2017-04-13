/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientconsuming;

import java.net.MalformedURLException;
import javax.xml.soap.*;
import javax.xml.namespace.QName;
import java.util.Iterator;
import java.net.URL;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

/**
 *
 * @author shibo
 */
public class ClientConsuming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, Exception {
     try{ SOAPConnectionFactory scf = SOAPConnectionFactory.newInstance();
            SOAPConnection con = scf.createConnection();
            
            SOAPFactory soapFactory = SOAPFactory.newInstance();
            MessageFactory mf = MessageFactory.newInstance();
            SOAPMessage msg = mf.createMessage();

            SOAPBody body = msg.getSOAPBody();

            QName bodyName = new QName("person");
            SOAPBodyElement requestPrices
                    = body.addBodyElement(bodyName);
            SOAPElement name = requestPrices.addChildElement(new QName("name"));
            name.addTextNode("shibo");
            SOAPElement pass = requestPrices.addChildElement(new QName("password"));
            //second element
            pass.addTextNode("1254789");

//            QName bodyName2 = new QName("hi");
//            SOAPBodyElement requestPrices2
//                    = body.addBodyElement(bodyName2);
            msg.saveChanges();
            URL endpoint = new URL("http://localhost:8084/ServiceProvider/test");
            SOAPMessage response = con.call(msg, endpoint);
            SOAPBody soapBody = response.getSOAPBody();
            ///System.out.println("**" + soapBody.toString());
            Iterator childElements = soapBody.getChildElements();
            SOAPBodyElement next = (SOAPBodyElement) childElements.next();
            String value = next.getValue();
            System.out.println("" + value);
            printSOAPResponse(response);
            con.close();

     }  catch (SOAPException | UnsupportedOperationException ex) {
        } catch (MalformedURLException ex) {
          
        }
    }
    


    private static void printSOAPResponse(SOAPMessage soapResponse) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        Source sourceContent = soapResponse.getSOAPPart().getContent();
        System.out.println("\nResponse SOAP Message = ");
        StreamResult result = new StreamResult(System.out);
        transformer.transform(sourceContent, result);
    }
}
