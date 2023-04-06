//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.05 at 09:49:06 AM WAT
//


package data.account;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for termDepositAccountHistoryOutputData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="termDepositAccountHistoryOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cheqNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debitCreditIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rowTS" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="statementBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnContraAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "termDepositAccountHistoryOutputData", namespace = "http://data.account.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "accountNumber",
    "cheqNo",
    "currency",
    "debitCreditIndicator",
    "description",
    "eventDescription",
    "reference",
    "rowTS",
    "statementBalance",
    "stmBalance",
    "strAmount",
    "txnAmount",
    "txnCode",
    "txnContraAccountNumber",
    "txnDate",
    "valueDate"
})
public class TermDepositAccountHistoryOutputData {

    protected String accountNumber;
    protected String cheqNo;
    protected String currency;
    protected String debitCreditIndicator;
    protected String description;
    protected String eventDescription;
    protected String reference;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rowTS;
    protected String statementBalance;
    protected String stmBalance;
    protected String strAmount;
    protected String txnAmount;
    protected String txnCode;
    protected String txnContraAccountNumber;
    protected String txnDate;
    protected String valueDate;

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
     * Gets the value of the cheqNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCheqNo() {
        return cheqNo;
    }

    /**
     * Sets the value of the cheqNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCheqNo(String value) {
        this.cheqNo = value;
    }

    /**
     * Gets the value of the currency property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the debitCreditIndicator property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDebitCreditIndicator() {
        return debitCreditIndicator;
    }

    /**
     * Sets the value of the debitCreditIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDebitCreditIndicator(String value) {
        this.debitCreditIndicator = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the eventDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * Sets the value of the eventDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEventDescription(String value) {
        this.eventDescription = value;
    }

    /**
     * Gets the value of the reference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the rowTS property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getRowTS() {
        return rowTS;
    }

    /**
     * Sets the value of the rowTS property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setRowTS(XMLGregorianCalendar value) {
        this.rowTS = value;
    }

    /**
     * Gets the value of the statementBalance property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatementBalance() {
        return statementBalance;
    }

    /**
     * Sets the value of the statementBalance property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatementBalance(String value) {
        this.statementBalance = value;
    }

    /**
     * Gets the value of the stmBalance property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStmBalance() {
        return stmBalance;
    }

    /**
     * Sets the value of the stmBalance property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStmBalance(String value) {
        this.stmBalance = value;
    }

    /**
     * Gets the value of the strAmount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrAmount() {
        return strAmount;
    }

    /**
     * Sets the value of the strAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrAmount(String value) {
        this.strAmount = value;
    }

    /**
     * Gets the value of the txnAmount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxnAmount() {
        return txnAmount;
    }

    /**
     * Sets the value of the txnAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxnAmount(String value) {
        this.txnAmount = value;
    }

    /**
     * Gets the value of the txnCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxnCode() {
        return txnCode;
    }

    /**
     * Sets the value of the txnCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxnCode(String value) {
        this.txnCode = value;
    }

    /**
     * Gets the value of the txnContraAccountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxnContraAccountNumber() {
        return txnContraAccountNumber;
    }

    /**
     * Sets the value of the txnContraAccountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxnContraAccountNumber(String value) {
        this.txnContraAccountNumber = value;
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
