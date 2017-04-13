
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertNewResponse_QNAME = new QName("http://hibernatewebservice/", "insertNewResponse");
    private final static QName _Delete_QNAME = new QName("http://hibernatewebservice/", "delete");
    private final static QName _GetResponse_QNAME = new QName("http://hibernatewebservice/", "getResponse");
    private final static QName _Get_QNAME = new QName("http://hibernatewebservice/", "get");
    private final static QName _DeleteResponse_QNAME = new QName("http://hibernatewebservice/", "deleteResponse");
    private final static QName _InsertNew_QNAME = new QName("http://hibernatewebservice/", "insertNew");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link InsertNew }
     * 
     */
    public InsertNew createInsertNew() {
        return new InsertNew();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link InsertNewResponse }
     * 
     */
    public InsertNewResponse createInsertNewResponse() {
        return new InsertNewResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertNewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hibernatewebservice/", name = "insertNewResponse")
    public JAXBElement<InsertNewResponse> createInsertNewResponse(InsertNewResponse value) {
        return new JAXBElement<InsertNewResponse>(_InsertNewResponse_QNAME, InsertNewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hibernatewebservice/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hibernatewebservice/", name = "getResponse")
    public JAXBElement<GetResponse> createGetResponse(GetResponse value) {
        return new JAXBElement<GetResponse>(_GetResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Get }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hibernatewebservice/", name = "get")
    public JAXBElement<Get> createGet(Get value) {
        return new JAXBElement<Get>(_Get_QNAME, Get.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hibernatewebservice/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertNew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hibernatewebservice/", name = "insertNew")
    public JAXBElement<InsertNew> createInsertNew(InsertNew value) {
        return new JAXBElement<InsertNew>(_InsertNew_QNAME, InsertNew.class, null, value);
    }

}
