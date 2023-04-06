//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 09:35:02 AM WAT
//


package data.fundstransfer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import java.math.BigDecimal;


/**
 * <p>Java class for directDebitViewOutputData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="directDebitViewOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beneficiaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directDebitMandateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exAcctNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="firstPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="maxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nextTransferDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originatorReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryInsts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "directDebitViewOutputData", namespace = "http://data.transfer.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "accountNumber",
    "amount",
    "bankName",
    "beneficiaryAddress",
    "beneficiaryName",
    "branchName",
    "city",
    "currency",
    "customerName",
    "description",
    "directDebitMandateType",
    "exAcctNumber",
    "expiryDate",
    "firstPaymentDate",
    "maxAmount",
    "nextTransferDate",
    "numberOfPayment",
    "originatorName",
    "originatorReference",
    "paymentFrequency",
    "paymentType",
    "scheduleType",
    "status",
    "supplementaryInsts"
})
public class DirectDebitViewOutputData {

    protected String accountNumber;
    protected String amount;
    protected String bankName;
    protected String beneficiaryAddress;
    protected String beneficiaryName;
    protected String branchName;
    protected String city;
    protected String currency;
    protected String customerName;
    protected String description;
    protected String directDebitMandateType;
    protected String exAcctNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstPaymentDate;
    protected BigDecimal maxAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextTransferDate;
    protected String numberOfPayment;
    protected String originatorName;
    protected String originatorReference;
    protected String paymentFrequency;
    protected String paymentType;
    protected String scheduleType;
    protected String status;
    protected String supplementaryInsts;

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
     * Gets the value of the amount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the bankName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the beneficiaryAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBeneficiaryAddress() {
        return beneficiaryAddress;
    }

    /**
     * Sets the value of the beneficiaryAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBeneficiaryAddress(String value) {
        this.beneficiaryAddress = value;
    }

    /**
     * Gets the value of the beneficiaryName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    /**
     * Sets the value of the beneficiaryName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBeneficiaryName(String value) {
        this.beneficiaryName = value;
    }

    /**
     * Gets the value of the branchName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
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
     * Gets the value of the customerName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerName(String value) {
        this.customerName = value;
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
     * Gets the value of the directDebitMandateType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDirectDebitMandateType() {
        return directDebitMandateType;
    }

    /**
     * Sets the value of the directDebitMandateType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDirectDebitMandateType(String value) {
        this.directDebitMandateType = value;
    }

    /**
     * Gets the value of the exAcctNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExAcctNumber() {
        return exAcctNumber;
    }

    /**
     * Sets the value of the exAcctNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExAcctNumber(String value) {
        this.exAcctNumber = value;
    }

    /**
     * Gets the value of the expiryDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the firstPaymentDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFirstPaymentDate() {
        return firstPaymentDate;
    }

    /**
     * Sets the value of the firstPaymentDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setFirstPaymentDate(XMLGregorianCalendar value) {
        this.firstPaymentDate = value;
    }

    /**
     * Gets the value of the maxAmount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    /**
     * Sets the value of the maxAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setMaxAmount(BigDecimal value) {
        this.maxAmount = value;
    }

    /**
     * Gets the value of the nextTransferDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getNextTransferDate() {
        return nextTransferDate;
    }

    /**
     * Sets the value of the nextTransferDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setNextTransferDate(XMLGregorianCalendar value) {
        this.nextTransferDate = value;
    }

    /**
     * Gets the value of the numberOfPayment property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumberOfPayment() {
        return numberOfPayment;
    }

    /**
     * Sets the value of the numberOfPayment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumberOfPayment(String value) {
        this.numberOfPayment = value;
    }

    /**
     * Gets the value of the originatorName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginatorName() {
        return originatorName;
    }

    /**
     * Sets the value of the originatorName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginatorName(String value) {
        this.originatorName = value;
    }

    /**
     * Gets the value of the originatorReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginatorReference() {
        return originatorReference;
    }

    /**
     * Sets the value of the originatorReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginatorReference(String value) {
        this.originatorReference = value;
    }

    /**
     * Gets the value of the paymentFrequency property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentFrequency() {
        return paymentFrequency;
    }

    /**
     * Sets the value of the paymentFrequency property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentFrequency(String value) {
        this.paymentFrequency = value;
    }

    /**
     * Gets the value of the paymentType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the scheduleType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getScheduleType() {
        return scheduleType;
    }

    /**
     * Sets the value of the scheduleType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setScheduleType(String value) {
        this.scheduleType = value;
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
     * Gets the value of the supplementaryInsts property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSupplementaryInsts() {
        return supplementaryInsts;
    }

    /**
     * Sets the value of the supplementaryInsts property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSupplementaryInsts(String value) {
        this.supplementaryInsts = value;
    }

}
