//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 04:32:59 PM WAT
//


package data.transaction;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genericPickListOutputData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="genericPickListOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="listDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericPickListOutputData", namespace = "http://data.refglobal.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "id",
    "listDesc",
    "listKey",
    "parentKey"
})
public class GenericPickListOutputData {

    protected Long id;
    protected String listDesc;
    protected String listKey;
    protected String parentKey;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the listDesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getListDesc() {
        return listDesc;
    }

    /**
     * Sets the value of the listDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setListDesc(String value) {
        this.listDesc = value;
    }

    /**
     * Gets the value of the listKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getListKey() {
        return listKey;
    }

    /**
     * Sets the value of the listKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setListKey(String value) {
        this.listKey = value;
    }

    /**
     * Gets the value of the parentKey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParentKey() {
        return parentKey;
    }

    /**
     * Sets the value of the parentKey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParentKey(String value) {
        this.parentKey = value;
    }

}
