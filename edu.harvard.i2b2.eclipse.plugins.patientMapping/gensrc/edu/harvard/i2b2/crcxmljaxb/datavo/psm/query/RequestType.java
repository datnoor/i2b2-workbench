//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:39:22 AM EDT 
//


package edu.harvard.i2b2.crcxmljaxb.datavo.psm.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * requestType is abstract so a concrete type must be declared in the
 *                 instance document using the xsi:type attribute.
 * 
 * <p>Java class for requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestType")
@XmlSeeAlso({
    MasterRenameRequestType.class,
    InstanceRequestType.class,
    ResultTypeRequestType.class,
    UserRequestType.class,
    ResultRequestType.class,
    QueryDefinitionRequestType.class,
    AnalysisDefinitionRequestType.class,
    AnalysisPluginMetadataRequestType.class,
    MasterDeleteRequestType.class,
    MasterRequestType.class
})
public abstract class RequestType {


}
