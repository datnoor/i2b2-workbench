//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:39:09 AM EDT 
//


package edu.harvard.i2b2.crcxmljaxb.datavo.pdo.query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputOptionPhiType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outputOptionPhiType">
 *   &lt;restriction base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}tokenType">
 *     &lt;enumeration value="encrypted"/>
 *     &lt;enumeration value="unencrypted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outputOptionPhiType")
@XmlEnum
public enum OutputOptionPhiType {

    @XmlEnumValue("encrypted")
    ENCRYPTED("encrypted"),
    @XmlEnumValue("unencrypted")
    UNENCRYPTED("unencrypted");
    private final String value;

    OutputOptionPhiType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputOptionPhiType fromValue(String v) {
        for (OutputOptionPhiType c: OutputOptionPhiType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
