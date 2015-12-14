//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:39:00 AM EDT 
//


package edu.harvard.i2b2.crcxmljaxb.datavo.pdo.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetObservationFactByPrimaryKey_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetObservationFactByPrimaryKey_requestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}requestType">
 *       &lt;sequence>
 *         &lt;element name="fact_primary_key" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}fact_primary_key_Type"/>
 *         &lt;element name="fact_output_option" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetObservationFactByPrimaryKey_requestType", propOrder = {
    "factPrimaryKey",
    "factOutputOption"
})
public class GetObservationFactByPrimaryKeyRequestType
    extends RequestType
{

    @XmlElement(name = "fact_primary_key", required = true)
    protected FactPrimaryKeyType factPrimaryKey;
    @XmlElement(name = "fact_output_option", required = true)
    protected OutputOptionType factOutputOption;

    /**
     * Gets the value of the factPrimaryKey property.
     * 
     * @return
     *     possible object is
     *     {@link FactPrimaryKeyType }
     *     
     */
    public FactPrimaryKeyType getFactPrimaryKey() {
        return factPrimaryKey;
    }

    /**
     * Sets the value of the factPrimaryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactPrimaryKeyType }
     *     
     */
    public void setFactPrimaryKey(FactPrimaryKeyType value) {
        this.factPrimaryKey = value;
    }

    /**
     * Gets the value of the factOutputOption property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getFactOutputOption() {
        return factOutputOption;
    }

    /**
     * Sets the value of the factOutputOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setFactOutputOption(OutputOptionType value) {
        this.factOutputOption = value;
    }

}
