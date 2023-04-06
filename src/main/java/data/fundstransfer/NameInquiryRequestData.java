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
 * <p>Java class for nameInquiryRequestData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="nameInquiryRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.ws.supernova.neptunesoftware.com/}XAPIRequestBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bicCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationInstitutionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nameInquiryRequestData", namespace = "http://data.transfer.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "accountNumber",
    "bicCode",
    "destinationInstitutionCode",
    "sessionId"
})
public class NameInquiryRequestData
    extends XAPIRequestBaseObject
{

    protected String accountNumber;
    protected String bicCode;
    protected String destinationInstitutionCode;
    protected String sessionId;

    /**
     * Gets the value of the accountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the bicCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBicCode() {
        return bicCode;
    }

    /**
     * Sets the value of the bicCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBicCode(String value) {
        this.bicCode = value;
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
     * Gets the value of the sessionId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

}