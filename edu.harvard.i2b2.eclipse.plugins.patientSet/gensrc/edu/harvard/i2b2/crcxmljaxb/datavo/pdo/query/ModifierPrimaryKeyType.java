//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:39:25 AM EDT 
//


package edu.harvard.i2b2.crcxmljaxb.datavo.pdo.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifier_primary_key_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifier_primary_key_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifier_path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifier_primary_key_Type", propOrder = {
    "modifierPath"
})
public class ModifierPrimaryKeyType {

    @XmlElement(name = "modifier_path", required = true)
    protected String modifierPath;

    /**
     * Gets the value of the modifierPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifierPath() {
        return modifierPath;
    }

    /**
     * Sets the value of the modifierPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifierPath(String value) {
        this.modifierPath = value;
    }

}
