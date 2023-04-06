//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 09:35:02 AM WAT
//


package data.fundstransfer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstitutionListResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FinancialInstitutionListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="batchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationInstitutionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberOfRecords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionListResponse", namespace = "http://data.transfer.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "batchNumber",
    "channelCode",
    "destinationInstitutionCode",
    "numberOfRecords",
    "responseCode"
})
public class FinancialInstitutionListResponse2 {

    protected String batchNumber;
    protected String channelCode;
    protected String destinationInstitutionCode;
    protected String numberOfRecords;
    protected String responseCode;

    /**
     * Gets the value of the batchNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the value of the batchNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBatchNumber(String value) {
        this.batchNumber = value;
    }

    /**
     * Gets the value of the channelCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Gets the value of the destinationInstitutionCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDestinationInstitutionCode() {
        return destinationInstitutionCode;
    }

    /**
     * Sets the value of the destinationInstitutionCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDestinationInstitutionCode(String value) {
        this.destinationInstitutionCode = value;
    }

    /**
     * Gets the value of the numberOfRecords property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * Sets the value of the numberOfRecords property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumberOfRecords(String value) {
        this.numberOfRecords = value;
    }

    /**
     * Gets the value of the responseCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

}