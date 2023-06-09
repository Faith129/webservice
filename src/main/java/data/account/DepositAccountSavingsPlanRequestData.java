//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.05 at 09:49:06 AM WAT
//


package data.account;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;


/**
 * <p>Java class for depositAccountSavingsPlanRequestData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="depositAccountSavingsPlanRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.ws.supernova.neptunesoftware.com/}XAPIRequestBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depositAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="depositAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="depositAcctSavingsPlanId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="durationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="durationVal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="fundingAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="fundingAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fundingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installmentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="installmentFrequencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="installmentFrequencyVal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="maturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "depositAccountSavingsPlanRequestData", namespace = "http://data.account.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "depositAccountId",
    "depositAccountNo",
    "depositAcctSavingsPlanId",
    "durationCode",
    "durationVal",
    "fundingAccountId",
    "fundingAccountNo",
    "fundingMethod",
    "installmentAmount",
    "installmentFrequencyCode",
    "installmentFrequencyVal",
    "maturityDate",
    "startDate"
})
public class DepositAccountSavingsPlanRequestData
    extends XAPIRequestBaseObject
{

    protected Long depositAccountId;
    protected String depositAccountNo;
    protected Long depositAcctSavingsPlanId;
    protected String durationCode;
    protected Long durationVal;
    protected Long fundingAccountId;
    protected String fundingAccountNo;
    protected String fundingMethod;
    protected BigDecimal installmentAmount;
    protected String installmentFrequencyCode;
    protected Long installmentFrequencyVal;
    protected String maturityDate;
    protected String startDate;

    /**
     * Gets the value of the depositAccountId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDepositAccountId() {
        return depositAccountId;
    }

    /**
     * Sets the value of the depositAccountId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDepositAccountId(Long value) {
        this.depositAccountId = value;
    }

    /**
     * Gets the value of the depositAccountNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDepositAccountNo() {
        return depositAccountNo;
    }

    /**
     * Sets the value of the depositAccountNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDepositAccountNo(String value) {
        this.depositAccountNo = value;
    }

    /**
     * Gets the value of the depositAcctSavingsPlanId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDepositAcctSavingsPlanId() {
        return depositAcctSavingsPlanId;
    }

    /**
     * Sets the value of the depositAcctSavingsPlanId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDepositAcctSavingsPlanId(Long value) {
        this.depositAcctSavingsPlanId = value;
    }

    /**
     * Gets the value of the durationCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDurationCode() {
        return durationCode;
    }

    /**
     * Sets the value of the durationCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDurationCode(String value) {
        this.durationCode = value;
    }

    /**
     * Gets the value of the durationVal property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDurationVal() {
        return durationVal;
    }

    /**
     * Sets the value of the durationVal property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDurationVal(Long value) {
        this.durationVal = value;
    }

    /**
     * Gets the value of the fundingAccountId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getFundingAccountId() {
        return fundingAccountId;
    }

    /**
     * Sets the value of the fundingAccountId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setFundingAccountId(Long value) {
        this.fundingAccountId = value;
    }

    /**
     * Gets the value of the fundingAccountNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFundingAccountNo() {
        return fundingAccountNo;
    }

    /**
     * Sets the value of the fundingAccountNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFundingAccountNo(String value) {
        this.fundingAccountNo = value;
    }

    /**
     * Gets the value of the fundingMethod property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFundingMethod() {
        return fundingMethod;
    }

    /**
     * Sets the value of the fundingMethod property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFundingMethod(String value) {
        this.fundingMethod = value;
    }

    /**
     * Gets the value of the installmentAmount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getInstallmentAmount() {
        return installmentAmount;
    }

    /**
     * Sets the value of the installmentAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setInstallmentAmount(BigDecimal value) {
        this.installmentAmount = value;
    }

    /**
     * Gets the value of the installmentFrequencyCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInstallmentFrequencyCode() {
        return installmentFrequencyCode;
    }

    /**
     * Sets the value of the installmentFrequencyCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInstallmentFrequencyCode(String value) {
        this.installmentFrequencyCode = value;
    }

    /**
     * Gets the value of the installmentFrequencyVal property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getInstallmentFrequencyVal() {
        return installmentFrequencyVal;
    }

    /**
     * Sets the value of the installmentFrequencyVal property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setInstallmentFrequencyVal(Long value) {
        this.installmentFrequencyVal = value;
    }

    /**
     * Gets the value of the maturityDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMaturityDate(String value) {
        this.maturityDate = value;
    }

    /**
     * Gets the value of the startDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

}
