//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:39:03 AM EDT 
//


package edu.harvard.i2b2.crcxmljaxb.datavo.psm.query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instance_result_responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instance_result_responseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}responseType">
 *       &lt;sequence>
 *         &lt;element name="query_instance" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_instanceType"/>
 *         &lt;element name="query_result_instance" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}query_result_instanceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instance_result_responseType", propOrder = {
    "queryInstance",
    "queryResultInstance"
})
public class InstanceResultResponseType
    extends ResponseType
{

    @XmlElement(name = "query_instance", required = true)
    protected QueryInstanceType queryInstance;
    @XmlElement(name = "query_result_instance")
    protected List<QueryResultInstanceType> queryResultInstance;

    /**
     * Gets the value of the queryInstance property.
     * 
     * @return
     *     possible object is
     *     {@link QueryInstanceType }
     *     
     */
    public QueryInstanceType getQueryInstance() {
        return queryInstance;
    }

    /**
     * Sets the value of the queryInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryInstanceType }
     *     
     */
    public void setQueryInstance(QueryInstanceType value) {
        this.queryInstance = value;
    }

    /**
     * Gets the value of the queryResultInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryResultInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryResultInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryResultInstanceType }
     * 
     * 
     */
    public List<QueryResultInstanceType> getQueryResultInstance() {
        if (queryResultInstance == null) {
            queryResultInstance = new ArrayList<QueryResultInstanceType>();
        }
        return this.queryResultInstance;
    }

}
