//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:39:06 AM EDT 
//


package edu.harvard.i2b2.crcxmljaxb.datavo.pdo.query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for totOccuranceOperatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="totOccuranceOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQ"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="LE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "totOccuranceOperatorType")
@XmlEnum
public enum TotOccuranceOperatorType {

    EQ,
    NE,
    GT,
    LT,
    GE,
    LE;

    public String value() {
        return name();
    }

    public static TotOccuranceOperatorType fromValue(String v) {
        return valueOf(v);
    }

}
