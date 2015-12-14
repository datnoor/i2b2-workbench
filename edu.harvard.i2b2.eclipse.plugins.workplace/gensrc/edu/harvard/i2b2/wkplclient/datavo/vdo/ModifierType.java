//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.21 at 10:39:00 AM EDT 
//


package edu.harvard.i2b2.wkplclient.datavo.vdo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for modifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="applied_path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="visualattributes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="synonym_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="basecode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="metadataxml" type="{http://www.i2b2.org/xsd/cell/ont/1.1/}xml_valueType"/>
 *         &lt;element name="facttablecolumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tablename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="columnname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="columndatatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dimcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tooltip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="update_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="download_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="import_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="sourcesystem_cd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifierType", propOrder = {
    "level",
    "appliedPath",
    "key",
    "fullname",
    "name",
    "visualattributes",
    "synonymCd",
    "totalnum",
    "basecode",
    "metadataxml",
    "facttablecolumn",
    "tablename",
    "columnname",
    "columndatatype",
    "operator",
    "dimcode",
    "comment",
    "tooltip",
    "updateDate",
    "downloadDate",
    "importDate",
    "sourcesystemCd"
})
public class ModifierType {

    protected int level;
    @XmlElement(name = "applied_path", required = true)
    protected String appliedPath;
    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected String fullname;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String visualattributes;
    @XmlElement(name = "synonym_cd", required = true)
    protected String synonymCd;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer totalnum;
    @XmlElement(required = true)
    protected String basecode;
    @XmlElement(required = true)
    protected XmlValueType metadataxml;
    @XmlElement(required = true)
    protected String facttablecolumn;
    @XmlElement(required = true)
    protected String tablename;
    @XmlElement(required = true)
    protected String columnname;
    @XmlElement(required = true)
    protected String columndatatype;
    @XmlElement(required = true)
    protected String operator;
    @XmlElement(required = true)
    protected String dimcode;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected String tooltip;
    @XmlElement(name = "update_date", required = true)
    protected XMLGregorianCalendar updateDate;
    @XmlElement(name = "download_date", required = true)
    protected XMLGregorianCalendar downloadDate;
    @XmlElement(name = "import_date", required = true)
    protected XMLGregorianCalendar importDate;
    @XmlElement(name = "sourcesystem_cd", required = true)
    protected String sourcesystemCd;

    /**
     * Gets the value of the level property.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Gets the value of the appliedPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedPath() {
        return appliedPath;
    }

    /**
     * Sets the value of the appliedPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedPath(String value) {
        this.appliedPath = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullname(String value) {
        this.fullname = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the visualattributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualattributes() {
        return visualattributes;
    }

    /**
     * Sets the value of the visualattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualattributes(String value) {
        this.visualattributes = value;
    }

    /**
     * Gets the value of the synonymCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynonymCd() {
        return synonymCd;
    }

    /**
     * Sets the value of the synonymCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynonymCd(String value) {
        this.synonymCd = value;
    }

    /**
     * Gets the value of the totalnum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalnum() {
        return totalnum;
    }

    /**
     * Sets the value of the totalnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalnum(Integer value) {
        this.totalnum = value;
    }

    /**
     * Gets the value of the basecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasecode() {
        return basecode;
    }

    /**
     * Sets the value of the basecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasecode(String value) {
        this.basecode = value;
    }

    /**
     * Gets the value of the metadataxml property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValueType }
     *     
     */
    public XmlValueType getMetadataxml() {
        return metadataxml;
    }

    /**
     * Sets the value of the metadataxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValueType }
     *     
     */
    public void setMetadataxml(XmlValueType value) {
        this.metadataxml = value;
    }

    /**
     * Gets the value of the facttablecolumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacttablecolumn() {
        return facttablecolumn;
    }

    /**
     * Sets the value of the facttablecolumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacttablecolumn(String value) {
        this.facttablecolumn = value;
    }

    /**
     * Gets the value of the tablename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTablename() {
        return tablename;
    }

    /**
     * Sets the value of the tablename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTablename(String value) {
        this.tablename = value;
    }

    /**
     * Gets the value of the columnname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnname() {
        return columnname;
    }

    /**
     * Sets the value of the columnname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnname(String value) {
        this.columnname = value;
    }

    /**
     * Gets the value of the columndatatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumndatatype() {
        return columndatatype;
    }

    /**
     * Sets the value of the columndatatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumndatatype(String value) {
        this.columndatatype = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the dimcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimcode() {
        return dimcode;
    }

    /**
     * Sets the value of the dimcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimcode(String value) {
        this.dimcode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the tooltip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTooltip() {
        return tooltip;
    }

    /**
     * Sets the value of the tooltip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTooltip(String value) {
        this.tooltip = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the downloadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDownloadDate() {
        return downloadDate;
    }

    /**
     * Sets the value of the downloadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDownloadDate(XMLGregorianCalendar value) {
        this.downloadDate = value;
    }

    /**
     * Gets the value of the importDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImportDate() {
        return importDate;
    }

    /**
     * Sets the value of the importDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImportDate(XMLGregorianCalendar value) {
        this.importDate = value;
    }

    /**
     * Gets the value of the sourcesystemCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcesystemCd() {
        return sourcesystemCd;
    }

    /**
     * Sets the value of the sourcesystemCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcesystemCd(String value) {
        this.sourcesystemCd = value;
    }

}
