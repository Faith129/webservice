//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 09:35:02 AM WAT
//


package data.fundstransfer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for XAPIErrorData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="XAPIErrorData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorSeverityLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="params" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XAPIErrorData", namespace = "http://common.ws.supernova.neptunesoftware.com/", propOrder = {
    "errMessage",
    "errorCode",
    "errorSeverityLevel",
    "params"
})
public class XAPIErrorData {

    protected String errMessage;
    protected String errorCode;
    protected String errorSeverityLevel;
    @XmlElement(nillable = true)
    protected List<String> params;

    /**
     * Gets the value of the errMessage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrMessage() {
        return errMessage;
    }

    /**
     * Sets the value of the errMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrMessage(String value) {
        this.errMessage = value;
    }

    /**
     * Gets the value of the errorCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorSeverityLevel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorSeverityLevel() {
        return errorSeverityLevel;
    }

    /**
     * Sets the value of the errorSeverityLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorSeverityLevel(String value) {
        this.errorSeverityLevel = value;
    }

    /**
     * Gets the value of the params property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the params property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParams().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getParams() {
        if (params == null) {
            params = new ArrayList<String>();
        }
        return this.params;
    }

}
