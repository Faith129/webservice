//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 09:35:02 AM WAT
//


package data.fundstransfer;

import jakarta.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for standingOrderRequestData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="standingOrderRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.ws.supernova.neptunesoftware.com/}XAPIRequestBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="insufficientFundOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextTransferDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="noOfPayments" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nonBusinessDueDateOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repaymentFrequencyUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repaymentFrequencyValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="standingOderReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="standingOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="standingOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supplimentaryReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transferReasonCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transferReasonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standingOrderRequestData", namespace = "http://data.transfer.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "accountNumber",
    "amountBasis",
    "currencyCode",
    "description",
    "expiryDate",
    "insufficientFundOption",
    "nextTransferDate",
    "noOfPayments",
    "nonBusinessDueDateOption",
    "paymentType",
    "repaymentFrequencyUnit",
    "repaymentFrequencyValue",
    "sequenceNumber",
    "standingOderReference",
    "standingOrderId",
    "standingOrderType",
    "supplimentaryReference",
    "transferReasonCd",
    "transferReasonId"
})
@XmlSeeAlso({
    InterBankStandingOrderRequestData.class,
    InternalStandingOrderRequestData.class,
    ServiceProviderStandingOrderRequestData.class
})
public class StandingOrderRequestData
    extends XAPIRequestBaseObject
{

    protected String accountNumber;
    protected String amountBasis;
    protected String currencyCode;
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    protected String insufficientFundOption;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextTransferDate;
    protected Long noOfPayments;
    protected String nonBusinessDueDateOption;
    protected String paymentType;
    protected String repaymentFrequencyUnit;
    protected Long repaymentFrequencyValue;
    protected Long sequenceNumber;
    protected String standingOderReference;
    protected Long standingOrderId;
    protected String standingOrderType;
    protected String supplimentaryReference;
    protected String transferReasonCd;
    protected Long transferReasonId;

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
     * Gets the value of the amountBasis property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAmountBasis() {
        return amountBasis;
    }

    /**
     * Sets the value of the amountBasis property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAmountBasis(String value) {
        this.amountBasis = value;
    }

    /**
     * Gets the value of the currencyCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
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
     * Gets the value of the insufficientFundOption property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInsufficientFundOption() {
        return insufficientFundOption;
    }

    /**
     * Sets the value of the insufficientFundOption property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInsufficientFundOption(String value) {
        this.insufficientFundOption = value;
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
     * Gets the value of the noOfPayments property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getNoOfPayments() {
        return noOfPayments;
    }

    /**
     * Sets the value of the noOfPayments property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setNoOfPayments(Long value) {
        this.noOfPayments = value;
    }

    /**
     * Gets the value of the nonBusinessDueDateOption property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNonBusinessDueDateOption() {
        return nonBusinessDueDateOption;
    }

    /**
     * Sets the value of the nonBusinessDueDateOption property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNonBusinessDueDateOption(String value) {
        this.nonBusinessDueDateOption = value;
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
     * Gets the value of the repaymentFrequencyUnit property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRepaymentFrequencyUnit() {
        return repaymentFrequencyUnit;
    }

    /**
     * Sets the value of the repaymentFrequencyUnit property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRepaymentFrequencyUnit(String value) {
        this.repaymentFrequencyUnit = value;
    }

    /**
     * Gets the value of the repaymentFrequencyValue property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getRepaymentFrequencyValue() {
        return repaymentFrequencyValue;
    }

    /**
     * Sets the value of the repaymentFrequencyValue property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setRepaymentFrequencyValue(Long value) {
        this.repaymentFrequencyValue = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSequenceNumber(Long value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the standingOderReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStandingOderReference() {
        return standingOderReference;
    }

    /**
     * Sets the value of the standingOderReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStandingOderReference(String value) {
        this.standingOderReference = value;
    }

    /**
     * Gets the value of the standingOrderId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getStandingOrderId() {
        return standingOrderId;
    }

    /**
     * Sets the value of the standingOrderId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setStandingOrderId(Long value) {
        this.standingOrderId = value;
    }

    /**
     * Gets the value of the standingOrderType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStandingOrderType() {
        return standingOrderType;
    }

    /**
     * Sets the value of the standingOrderType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStandingOrderType(String value) {
        this.standingOrderType = value;
    }

    /**
     * Gets the value of the supplimentaryReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSupplimentaryReference() {
        return supplimentaryReference;
    }

    /**
     * Sets the value of the supplimentaryReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSupplimentaryReference(String value) {
        this.supplimentaryReference = value;
    }

    /**
     * Gets the value of the transferReasonCd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransferReasonCd() {
        return transferReasonCd;
    }

    /**
     * Sets the value of the transferReasonCd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransferReasonCd(String value) {
        this.transferReasonCd = value;
    }

    /**
     * Gets the value of the transferReasonId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getTransferReasonId() {
        return transferReasonId;
    }

    /**
     * Sets the value of the transferReasonId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTransferReasonId(Long value) {
        this.transferReasonId = value;
    }

}
