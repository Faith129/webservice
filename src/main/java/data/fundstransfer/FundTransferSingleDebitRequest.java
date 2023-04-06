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

import java.math.BigDecimal;


/**
 * <p>Java class for fundTransferSingleDebitRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="fundTransferSingleDebitRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="beneficiaryAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beneficiaryAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beneficiaryBankVerificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beneficiaryKYCLevel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="channelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debitAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debitAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debitBankVerificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debitKYCLevel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="destinationInstitutionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mandateReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameEnquiryRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="narration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="transactionLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fundTransferSingleDebitRequest", namespace = "http://data.transfer.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "amount",
    "beneficiaryAccountName",
    "beneficiaryAccountNumber",
    "beneficiaryBankVerificationNumber",
    "beneficiaryKYCLevel",
    "channelCode",
    "debitAccountName",
    "debitAccountNumber",
    "debitBankVerificationNumber",
    "debitKYCLevel",
    "destinationInstitutionCode",
    "mandateReferenceNumber",
    "nameEnquiryRef",
    "narration",
    "paymentReference",
    "sessionId",
    "transactionFee",
    "transactionLocation"
})
public class FundTransferSingleDebitRequest {

    protected BigDecimal amount;
    protected String beneficiaryAccountName;
    protected String beneficiaryAccountNumber;
    protected String beneficiaryBankVerificationNumber;
    protected Long beneficiaryKYCLevel;
    protected String channelCode;
    protected String debitAccountName;
    protected String debitAccountNumber;
    protected String debitBankVerificationNumber;
    protected Long debitKYCLevel;
    protected String destinationInstitutionCode;
    protected String mandateReferenceNumber;
    protected String nameEnquiryRef;
    protected String narration;
    protected String paymentReference;
    protected String sessionId;
    protected BigDecimal transactionFee;
    protected String transactionLocation;

    /**
     * Gets the value of the amount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the beneficiaryAccountName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBeneficiaryAccountName() {
        return beneficiaryAccountName;
    }

    /**
     * Sets the value of the beneficiaryAccountName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBeneficiaryAccountName(String value) {
        this.beneficiaryAccountName = value;
    }

    /**
     * Gets the value of the beneficiaryAccountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBeneficiaryAccountNumber() {
        return beneficiaryAccountNumber;
    }

    /**
     * Sets the value of the beneficiaryAccountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBeneficiaryAccountNumber(String value) {
        this.beneficiaryAccountNumber = value;
    }

    /**
     * Gets the value of the beneficiaryBankVerificationNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBeneficiaryBankVerificationNumber() {
        return beneficiaryBankVerificationNumber;
    }

    /**
     * Sets the value of the beneficiaryBankVerificationNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBeneficiaryBankVerificationNumber(String value) {
        this.beneficiaryBankVerificationNumber = value;
    }

    /**
     * Gets the value of the beneficiaryKYCLevel property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getBeneficiaryKYCLevel() {
        return beneficiaryKYCLevel;
    }

    /**
     * Sets the value of the beneficiaryKYCLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setBeneficiaryKYCLevel(Long value) {
        this.beneficiaryKYCLevel = value;
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
     * Gets the value of the debitAccountName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDebitAccountName() {
        return debitAccountName;
    }

    /**
     * Sets the value of the debitAccountName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDebitAccountName(String value) {
        this.debitAccountName = value;
    }

    /**
     * Gets the value of the debitAccountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDebitAccountNumber() {
        return debitAccountNumber;
    }

    /**
     * Sets the value of the debitAccountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDebitAccountNumber(String value) {
        this.debitAccountNumber = value;
    }

    /**
     * Gets the value of the debitBankVerificationNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDebitBankVerificationNumber() {
        return debitBankVerificationNumber;
    }

    /**
     * Sets the value of the debitBankVerificationNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDebitBankVerificationNumber(String value) {
        this.debitBankVerificationNumber = value;
    }

    /**
     * Gets the value of the debitKYCLevel property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDebitKYCLevel() {
        return debitKYCLevel;
    }

    /**
     * Sets the value of the debitKYCLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDebitKYCLevel(Long value) {
        this.debitKYCLevel = value;
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
     * Gets the value of the mandateReferenceNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMandateReferenceNumber() {
        return mandateReferenceNumber;
    }

    /**
     * Sets the value of the mandateReferenceNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMandateReferenceNumber(String value) {
        this.mandateReferenceNumber = value;
    }

    /**
     * Gets the value of the nameEnquiryRef property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNameEnquiryRef() {
        return nameEnquiryRef;
    }

    /**
     * Sets the value of the nameEnquiryRef property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNameEnquiryRef(String value) {
        this.nameEnquiryRef = value;
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
     * Gets the value of the paymentReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentReference() {
        return paymentReference;
    }

    /**
     * Sets the value of the paymentReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentReference(String value) {
        this.paymentReference = value;
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

    /**
     * Gets the value of the transactionFee property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTransactionFee() {
        return transactionFee;
    }

    /**
     * Sets the value of the transactionFee property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTransactionFee(BigDecimal value) {
        this.transactionFee = value;
    }

    /**
     * Gets the value of the transactionLocation property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransactionLocation() {
        return transactionLocation;
    }

    /**
     * Sets the value of the transactionLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransactionLocation(String value) {
        this.transactionLocation = value;
    }

}
