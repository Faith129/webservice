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
 * <p>Java class for cashVoucherRequestData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cashVoucherRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://data.txnprocess.server.ws.supernova.neptunesoftware.com/}XAPIBaseTxnRequestData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationTxnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="finalTxnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="recipientPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voucherNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voucherPin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cashVoucherRequestData", namespace = "http://data.txnprocess.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "acctShortName",
    "creationTxnId",
    "customerNumber",
    "finalTxnId",
    "recipientPhoneNumber",
    "requestReference",
    "status",
    "strFromDate",
    "strToDate",
    "voucherNumber",
    "voucherPin"
})
public class CashVoucherRequestData
    extends XAPIBaseTxnRequestData
{

    protected String acctShortName;
    protected Long creationTxnId;
    protected String customerNumber;
    protected Long finalTxnId;
    protected String recipientPhoneNumber;
    protected String requestReference;
    protected String status;
    protected String strFromDate;
    protected String strToDate;
    protected String voucherNumber;
    protected String voucherPin;

    /**
     * Gets the value of the acctShortName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAcctShortName() {
        return acctShortName;
    }

    /**
     * Sets the value of the acctShortName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAcctShortName(String value) {
        this.acctShortName = value;
    }

    /**
     * Gets the value of the creationTxnId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCreationTxnId() {
        return creationTxnId;
    }

    /**
     * Sets the value of the creationTxnId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCreationTxnId(Long value) {
        this.creationTxnId = value;
    }

    /**
     * Gets the value of the customerNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the finalTxnId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getFinalTxnId() {
        return finalTxnId;
    }

    /**
     * Sets the value of the finalTxnId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setFinalTxnId(Long value) {
        this.finalTxnId = value;
    }

    /**
     * Gets the value of the recipientPhoneNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRecipientPhoneNumber() {
        return recipientPhoneNumber;
    }

    /**
     * Sets the value of the recipientPhoneNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRecipientPhoneNumber(String value) {
        this.recipientPhoneNumber = value;
    }

    /**
     * Gets the value of the requestReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestReference() {
        return requestReference;
    }

    /**
     * Sets the value of the requestReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestReference(String value) {
        this.requestReference = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the strFromDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrFromDate() {
        return strFromDate;
    }

    /**
     * Sets the value of the strFromDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrFromDate(String value) {
        this.strFromDate = value;
    }

    /**
     * Gets the value of the strToDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrToDate() {
        return strToDate;
    }

    /**
     * Sets the value of the strToDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrToDate(String value) {
        this.strToDate = value;
    }

    /**
     * Gets the value of the voucherNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVoucherNumber() {
        return voucherNumber;
    }

    /**
     * Sets the value of the voucherNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVoucherNumber(String value) {
        this.voucherNumber = value;
    }

    /**
     * Gets the value of the voucherPin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVoucherPin() {
        return voucherPin;
    }

    /**
     * Sets the value of the voucherPin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVoucherPin(String value) {
        this.voucherPin = value;
    }

}