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
 * <p>Java class for depositAccountHistoryOutputData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="depositAccountHistoryOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountHistoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debitCreditIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="narration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rowTS" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="statementBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stmBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strChequeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strTranAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnContraAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnJournalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
@XmlType(name = "depositAccountHistoryOutputData", namespace = "http://data.account.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "accountHistoryId",
    "accountNo",
    "currency",
    "debitCreditIndicator",
    "description",
    "eventDescription",
    "narration",
    "reference",
    "rowTS",
    "statementBalance",
    "stmBalance",
    "strAmount",
    "strChequeNo",
    "strFromDate",
    "strToDate",
    "strTranAmount",
    "transactionCode",
    "txnAmount",
    "txnContraAccountNumber",
    "txnDate",
    "txnJournalId",
    "valueDate"
})
public class DepositAccountHistoryOutputData {

    protected Long accountHistoryId;
    protected String accountNo;
    protected String currency;
    protected String debitCreditIndicator;
    protected String description;
    protected String eventDescription;
    protected String narration;
    protected String reference;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rowTS;
    protected String statementBalance;
    protected String stmBalance;
    protected String strAmount;
    protected String strChequeNo;
    protected String strFromDate;
    protected String strToDate;
    protected String strTranAmount;
    protected String transactionCode;
    protected String txnAmount;
    protected String txnContraAccountNumber;
    protected String txnDate;
    protected Long txnJournalId;
    protected String valueDate;

    /**
     * Gets the value of the accountHistoryId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getAccountHistoryId() {
        return accountHistoryId;
    }

    /**
     * Sets the value of the accountHistoryId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setAccountHistoryId(Long value) {
        this.accountHistoryId = value;
    }

    /**
     * Gets the value of the accountNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
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
     * Gets the value of the narration property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNarration() {
        return narration;
    }

    /**
     * Sets the value of the narration property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNarration(String value) {
        this.narration = value;
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
     * Gets the value of the strChequeNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrChequeNo() {
        return strChequeNo;
    }

    /**
     * Sets the value of the strChequeNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrChequeNo(String value) {
        this.strChequeNo = value;
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
     * Gets the value of the strTranAmount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrTranAmount() {
        return strTranAmount;
    }

    /**
     * Sets the value of the strTranAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrTranAmount(String value) {
        this.strTranAmount = value;
    }

    /**
     * Gets the value of the transactionCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
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
