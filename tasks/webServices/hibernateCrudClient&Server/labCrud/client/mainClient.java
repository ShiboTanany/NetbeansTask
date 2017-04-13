import javax.xml.ws.WebServiceRef;
import service.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
public class mainClient {

public static void main(String []args) throws Exception{
 HibernateWebServiceService client = new HibernateWebServiceService();
        HibernateWebService service = client.getHibernateWebServicePort();
         
        Account account=new Account();
       account.setUserName("hshibdskldkslيسكميكسمh");
        account.setPhone("01142803256");
       account.setPassword("root");
        account.setAddress("Damanhour");


GregorianCalendar c = new GregorianCalendar();
c.setTime(new Date());
XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);


        account.setBirthday(date2);
        account.setFullName("shaaban ebrahim altanany");
       String photoFilePathToRead ="/home/shibo/Desktop/16976206_2010784699144581_88839650_n.jpg";
       File inputFile = new File(photoFilePathToRead);
       FileInputStream inputStream = new FileInputStream(inputFile);

        byte[] fileBytes = new byte[(int) inputFile.length()];
       inputStream.read(fileBytes);
       inputStream.close();
       
        
         account.setImage(fileBytes);
    
     System.out.println(account);

     service.insertNew(account);
 System.out.println("inserted");
    List<Account> x=service.get();
	for (Account accoun : x) {
             System.out.println(""+accoun.getAddress());
         }



}

}
