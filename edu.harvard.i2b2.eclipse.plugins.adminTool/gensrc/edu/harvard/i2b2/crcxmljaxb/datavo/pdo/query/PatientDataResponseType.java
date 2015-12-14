//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:39:19 AM EDT 
//


package edu.harvard.i2b2.crcxmljaxb.datavo.pdo.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import edu.harvard.i2b2.common.datavo.pdo.PatientDataType;


/**
 * <p>Java class for patient_data_responseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="patient_data_responseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}responseType">
 *       &lt;sequence>
 *         &lt;element name="page" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}pageType"/>
 *         &lt;element ref="{http://www.i2b2.org/xsd/hive/pdo/1.1/}patient_data"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "patient_data_responseType", propOrder = {
    "page",
    "patientData"
})
public class PatientDataResponseType
    extends ResponseType
{

    @XmlElement(required = true)
    protected PageType page;
    @XmlElement(name = "patient_data", namespace = "http://www.i2b2.org/xsd/hive/pdo/1.1/", required = true)
    protected PatientDataType patientData;

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link PageType }
     *     
     */
    public PageType getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageType }
     *     
     */
    public void setPage(PageType value) {
        this.page = value;
    }

    /**
     * Gets the value of the patientData property.
     * 
     * @return
     *     possible object is
     *     {@link PatientDataType }
     *     
     */
    public PatientDataType getPatientData() {
        return patientData;
    }

    /**
     * Sets the value of the patientData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientDataType }
     *     
     */
    public void setPatientData(PatientDataType value) {
        this.patientData = value;
    }

}
