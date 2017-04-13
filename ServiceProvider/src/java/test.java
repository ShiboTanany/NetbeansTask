/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeader;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;

/**
 *
 * @author shibo
 */
public class test extends HttpServlet {

    static final Logger logger
            = Logger.getLogger("com.sun.cb.saaj.PriceListServlet");
    static MessageFactory messageFactory = null;

    static {
        try {
            messageFactory = MessageFactory.newInstance();
        } catch (Exception ex) {
            logger.severe("Exception: " + ex.toString());
        }
    }

    ;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SOAPException {
        try {
            MimeHeaders headers = getHeaders(request);

            // Get the body of the HTTP request
            InputStream is = request.getInputStream();

            // Now internalize the contents of the HTTP request
            // and create a SOAPMessage
            SOAPMessage msg = messageFactory.createMessage(headers, is);
            SOAPMessage reply = null;
            reply = onMessage(msg);

            if (reply != null) {

                /*
             * Need to call saveChanges because we’re
             * going to use the MimeHeaders to set HTTP
             * response information. These MimeHeaders
             * are generated as part of the save.
                 */
                if (reply.saveRequired()) {
                    reply.saveChanges();
                }

                response.setStatus(HttpServletResponse.SC_OK);
                putHeaders(reply.getMimeHeaders(), response);

                // Write out the message on the response stream
                logger.info("Reply message:");
                OutputStream os = response.getOutputStream();
                reply.writeTo(os);
                os.flush();
            } else {
                response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            }
        } catch (Exception ex) {
            throw new ServletException("SAAJ POST failed: " + ex.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SOAPException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SOAPException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    static MimeHeaders getHeaders(HttpServletRequest req) {

        Enumeration headerNames = req.getHeaderNames();
        MimeHeaders headers = new MimeHeaders();

        while (headerNames.hasMoreElements()) {
            String headerName = (String) headerNames.nextElement();
            String headerValue = req.getHeader(headerName);

            StringTokenizer values = new StringTokenizer(headerValue, ",");
            while (values.hasMoreTokens()) {
                headers.addHeader(headerName, values.nextToken().trim());
            }
        }
        return headers;
    }

    static void putHeaders(MimeHeaders headers, HttpServletResponse res) {

        Iterator it = headers.getAllHeaders();
        while (it.hasNext()) {
            MimeHeader header = (MimeHeader) it.next();

            String[] values = headers.getHeader(header.getName());
            if (values.length == 1) {
                res.setHeader(header.getName(), header.getValue());
            } else {
                StringBuffer concat = new StringBuffer();
                int i = 0;
                while (i < values.length) {
                    if (i != 0) {
                        concat.append(',');
                    }
                    concat.append(values[i++]);
                }
                res.setHeader(header.getName(), concat.toString());
            }
        }
    }

    public SOAPMessage onMessage(SOAPMessage msg) throws SOAPException {
        SOAPMessage message = null;

    try {
        SOAPBody soapBody = msg.getSOAPBody();
        Iterator childElements = soapBody.getChildElements();
        SOAPBodyElement next = (SOAPBodyElement) childElements.next();
        Iterator childElements1 = next.getChildElements();
        SOAPElement name = (SOAPElement) childElements1.next();
        String Uname = name.getValue();
        SOAPElement password = (SOAPElement) childElements1.next();
        String pass=password.getValue();
        message = messageFactory.createMessage();

        SOAPBody body = message.getSOAPBody();

         QName bodyName = new QName("responce");
            SOAPBodyElement requestPrices
                    = body.addBodyElement(bodyName);
            requestPrices.addTextNode("username : " +Uname +" &&  Password :"+pass );
       
        
        message.saveChanges();

    } catch(Exception e) {
        logger.severe("onMessage: Exception: " + e.toString());
    }
    return message;
}


    
}
