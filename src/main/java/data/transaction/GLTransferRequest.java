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
 * <p>Java class for GLTransferRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GLTransferRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.ws.supernova.neptunesoftware.com/}XAPIRequestBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fromAcctBusinessunitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromGLAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originBusinessunitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originBusinessunitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="toAcctBusinessunitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toGLAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="transactionCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnRevFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLTransferRequest", namespace = "http://data.transaction.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "fromAcctBusinessunitCode",
    "fromGLAccountNumber",
    "originBusinessunitCode",
    "originBusinessunitId",
    "toAcctBusinessunitCode",
    "toGLAccountNumber",
    "transactionAmount",
    "transactionCurrencyCode",
    "txnDate",
    "txnDescription",
    "txnReference",
    "txnRevFlag",
    "valueDate"
})
public class GLTransferRequest
    extends XAPIRequestBaseObject
{

    protected String fromAcctBusinessunitCode;
    protected String fromGLAccountNumber;
    protected String originBusinessunitCode;
    protected Long originBusinessunitId;
    protected String toAcctBusinessunitCode;
    protected String toGLAccountNumber;
    protected BigDecimal transactionAmount;
    protected String transactionCurrencyCode;
    protected String txnDate;
    protected String txnDescription;
    protected String txnReference;
    protected Boolean txnRevFlag;
    protected String valueDate;

    /**
     * Gets the value of the fromAcctBusinessunitCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFromAcctBusinessunitCode() {
        return fromAcctBusinessunitCode;
    }

    /**
     * Sets the value of the fromAcctBusinessunitCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFromAcctBusinessunitCode(String value) {
        this.fromAcctBusinessunitCode = value;
    }

    /**
     * Gets the value of the fromGLAccountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFromGLAccountNumber() {
        return fromGLAccountNumber;
    }

    /**
     * Sets the value of the fromGLAccountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFromGLAccountNumber(String value) {
        this.fromGLAccountNumber = value;
    }

    /**
     * Gets the value of the originBusinessunitCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginBusinessunitCode() {
        return originBusinessunitCode;
    }

    /**
     * Sets the value of the originBusinessunitCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginBusinessunitCode(String value) {
        this.originBusinessunitCode = value;
    }

    /**
     * Gets the value of the originBusinessunitId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getOriginBusinessunitId() {
        return originBusinessunitId;
    }

    /**
     * Sets the value of the originBusinessunitId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setOriginBusinessunitId(Long value) {
        this.originBusinessunitId = value;
    }

    /**
     * Gets the value of the toAcctBusinessunitCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToAcctBusinessunitCode() {
        return toAcctBusinessunitCode;
    }

    /**
     * Sets the value of the toAcctBusinessunitCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setToAcctBusinessunitCode(String value) {
        this.toAcctBusinessunitCode = value;
    }

    /**
     * Gets the value of the toGLAccountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToGLAccountNumber() {
        return toGLAccountNumber;
    }

    /**
     * Sets the value of the toGLAccountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setToGLAccountNumber(String value) {
        this.toGLAccountNumber = value;
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
     * Gets the value of the txnDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxnDescription() {
        return txnDescription;
    }

    /**
     * Sets the value of the txnDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxnDescription(String value) {
        this.txnDescription = value;
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
     * Gets the value of the txnRevFlag property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isTxnRevFlag() {
        return txnRevFlag;
    }

    /**
     * Sets the value of the txnRevFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setTxnRevFlag(Boolean value) {
        this.txnRevFlag = value;
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
