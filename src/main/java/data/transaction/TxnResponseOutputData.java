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
 * <p>Java class for txnResponseOutputData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="txnResponseOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="primaryAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retrievalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="track2Data" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="transactionCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transmissionTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="txnJournalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="txnReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voucherRef" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txnResponseOutputData", namespace = "http://data.transaction.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "primaryAccountNumber",
    "responseCode",
    "retrievalReferenceNumber",
    "track2Data",
    "transactionAmount",
    "transactionCurrencyCode",
    "transmissionTime",
    "txnJournalId",
    "txnReference",
    "voucherRef"
})
public class TxnResponseOutputData {

    protected String primaryAccountNumber;
    protected String responseCode;
    protected String retrievalReferenceNumber;
    protected String track2Data;
    protected BigDecimal transactionAmount;
    protected String transactionCurrencyCode;
    protected Long transmissionTime;
    protected Long txnJournalId;
    protected String txnReference;
    protected Long voucherRef;

    /**
     * Gets the value of the primaryAccountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrimaryAccountNumber() {
        return primaryAccountNumber;
    }

    /**
     * Sets the value of the primaryAccountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrimaryAccountNumber(String value) {
        this.primaryAccountNumber = value;
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
     * Gets the value of the track2Data property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTrack2Data() {
        return track2Data;
    }

    /**
     * Sets the value of the track2Data property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTrack2Data(String value) {
        this.track2Data = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTransactionAmount(BigDecimal value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the transactionCurrencyCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransactionCurrencyCode() {
        return transactionCurrencyCode;
    }

    /**
     * Sets the value of the transactionCurrencyCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransactionCurrencyCode(String value) {
        this.transactionCurrencyCode = value;
    }

    /**
     * Gets the value of the transmissionTime property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getTransmissionTime() {
        return transmissionTime;
    }

    /**
     * Sets the value of the transmissionTime property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTransmissionTime(Long value) {
        this.transmissionTime = value;
    }

    /**
     * Gets the value of the txnJournalId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getTxnJournalId() {
        return txnJournalId;
    }

    /**
     * Sets the value of the txnJournalId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTxnJournalId(Long value) {
        this.txnJournalId = value;
    }

    /**
     * Gets the value of the txnReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxnReference() {
        return txnReference;
    }

    /**
     * Sets the value of the txnReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxnReference(String value) {
        this.txnReference = value;
    }

    /**
     * Gets the value of the voucherRef property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getVoucherRef() {
        return voucherRef;
    }

    /**
     * Sets the value of the voucherRef property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setVoucherRef(Long value) {
        this.voucherRef = value;
    }

}
