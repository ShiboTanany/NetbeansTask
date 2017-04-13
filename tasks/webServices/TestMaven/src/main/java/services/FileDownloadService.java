/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.File;  
import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.Response;  
import javax.ws.rs.core.Response.ResponseBuilder;  
@Path("/files")  
public class FileDownloadService {  
    private static final String FILE_PATH = "/media/shibo/Shibo/sTudY/upload/16976206_2010784699144581_88839650_n.jpg";  
    @GET  
    @Path("/jpg")  
    @Produces("text/plain")  
    public Response getFile() {  
        File file = new File(FILE_PATH);  
   
        ResponseBuilder response = Response.ok((Object) file);  
        response.header("Content-Disposition","attachment; filename=\"shibo.jpg\"");  
        return response.build();  
   
    }  
 }  