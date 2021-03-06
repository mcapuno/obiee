package com.oracle.xmlns.oxp.service.v2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.7
 * 2019-01-05T23:42:13.768+05:30
 * Generated source version: 3.0.7
 * 
 */
@WebServiceClient(name = "ReportService", 
                  wsdlLocation = "file:/home/dinesh/Documents/devlopment/soap/obiee/src/main/resources/obiee.wsdl",
                  targetNamespace = "http://xmlns.oracle.com/oxp/service/v2") 
public class ReportService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://xmlns.oracle.com/oxp/service/v2", "ReportService");
    public final static QName ReportService = new QName("http://xmlns.oracle.com/oxp/service/v2", "ReportService");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/dinesh/Documents/devlopment/soap/obiee/src/main/resources/obiee.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ReportService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/dinesh/Documents/devlopment/soap/obiee/src/main/resources/obiee.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ReportService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReportService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReportService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReportService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReportService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReportService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns ReportService
     */
    @WebEndpoint(name = "ReportService")
    public ReportService getReportService() {
        return super.getPort(ReportService, ReportService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportService
     */
    @WebEndpoint(name = "ReportService")
    public ReportService getReportService(WebServiceFeature... features) {
        return super.getPort(ReportService, ReportService.class, features);
    }

}
