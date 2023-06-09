//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 04:32:59 PM WAT
//


package data.transaction;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for draftEncashmentResponseData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="draftEncashmentResponseData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="draftAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="draftCurrencyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="draftCurrencyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="draftNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retrievalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "draftEncashmentResponseData", namespace = "http://data.txnprocess.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "draftAmount",
    "draftCurrencyCd",
    "draftCurrencyId",
    "draftNumber",
    "responseCode",
    "retrievalReferenceNumber",
    "txnDate",
    "valueDate"
})
public class DraftEncashmentResponseData {

    protected BigDecimal draftAmount;
    protected String draftCurrencyCd;
    protected Long draftCurrencyId;
    protected Long draftNumber;
    protected String responseCode;
    protected String retrievalReferenceNumber;
    protected String txnDate;
    protected String valueDate;

    /**
     * Gets the value of the draftAmount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDraftAmount() {
        return draftAmount;
    }

    /**
     * Sets the value of the draftAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDraftAmount(BigDecimal value) {
        this.draftAmount = value;
    }

    /**
     * Gets the value of the draftCurrencyCd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDraftCurrencyCd() {
        return draftCurrencyCd;
    }

    /**
     * Sets the value of the draftCurrencyCd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDraftCurrencyCd(String value) {
        this.draftCurrencyCd = value;
    }

    /**
     * Gets the value of the draftCurrencyId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDraftCurrencyId() {
        return draftCurrencyId;
    }

    /**
     * Sets the value of the draftCurrencyId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDraftCurrencyId(Long value) {
        this.draftCurrencyId = value;
    }

    /**
     * Gets the value of the draftNumber property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDraftNumber() {
        return draftNumber;
    }

    /**
     * Sets the value of the draftNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDraftNumber(Long value) {
        this.draftNumber = value;
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

    /**
     * Gets the value of the retrievalReferenceNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    /**
     * Sets the value of the retrievalReferenceNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRetrievalReferenceNumber(String value) {
        this.retrievalReferenceNumber = value;
    }

    /**
     * Gets the value of the txnDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the value of the txnDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxnDate(String value) {
        this.txnDate = value;
    }

    /**
     * Gets the value of the valueDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValueDate(String value) {
        this.valueDate = value;
    }

}
