//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 04:35:20 PM WAT
//


package data.customer;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerBankInformationRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="customerBankInformationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.ws.supernova.neptunesoftware.com/}XAPIRequestBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="annualIncomeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="buResponsibilityCentreId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="controlCreditLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="countryOfRisk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditRatingAgencyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="custBankInfoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerSegment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="customerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cyclicMessageGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="insiderRelationshipFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="kycLevel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mainContBusUnit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="marketingCampaign" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="monthlyIncomeAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="netWorthAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="openingReason" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="operationsCurrency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ownerGenderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="privacyLevel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="referredCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationshipMgr1Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="relationshipMgr2Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="residentCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="residentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="riskCodeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="serviceLevel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="sourceOfFundsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="taxIdentificationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="valueChainId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerBankInformationRequest", namespace = "http://data.customer.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "annualIncomeAmt",
    "buResponsibilityCentreId",
    "controlCreditLimit",
    "countryOfRisk",
    "creditRatingAgencyId",
    "custBankInfoId",
    "customerId",
    "customerNumber",
    "customerSegment",
    "customerShortName",
    "cyclicMessageGroupId",
    "industry",
    "insiderRelationshipFlag",
    "kycLevel",
    "locale",
    "mainContBusUnit",
    "marketingCampaign",
    "monthlyIncomeAmt",
    "netWorthAmt",
    "openingReason",
    "operationsCurrency",
    "ownerGenderCode",
    "primaryOfficer",
    "privacyLevel",
    "referredCustomerNo",
    "relationshipMgr1Id",
    "relationshipMgr2Id",
    "residentCountry",
    "residentFlag",
    "riskCodeId",
    "serviceLevel",
    "sourceOfFundsId",
    "supplementaryOfficer",
    "taxGroup",
    "taxIdentificationNo",
    "taxStatus",
    "valueChainId"
})
public class CustomerBankInformationRequest
    extends XAPIRequestBaseObject
{

    protected BigDecimal annualIncomeAmt;
    protected Long buResponsibilityCentreId;
    protected BigDecimal controlCreditLimit;
    protected String countryOfRisk;
    protected Long creditRatingAgencyId;
    protected Long custBankInfoId;
    protected Long customerId;
    protected String customerNumber;
    protected Long customerSegment;
    protected String customerShortName;
    protected Long cyclicMessageGroupId;
    protected Long industry;
    protected boolean insiderRelationshipFlag;
    protected Long kycLevel;
    protected String locale;
    protected Long mainContBusUnit;
    protected Long marketingCampaign;
    protected BigDecimal monthlyIncomeAmt;
    protected BigDecimal netWorthAmt;
    protected Long openingReason;
    protected Long operationsCurrency;
    protected String ownerGenderCode;
    protected String primaryOfficer;
    protected Long privacyLevel;
    protected String referredCustomerNo;
    protected Long relationshipMgr1Id;
    protected Long relationshipMgr2Id;
    protected String residentCountry;
    protected boolean residentFlag;
    protected Long riskCodeId;
    protected Long serviceLevel;
    protected Long sourceOfFundsId;
    protected String supplementaryOfficer;
    protected Long taxGroup;
    protected String taxIdentificationNo;
    protected Long taxStatus;
    protected Long valueChainId;

    /**
     * Gets the value of the annualIncomeAmt property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getAnnualIncomeAmt() {
        return annualIncomeAmt;
    }

    /**
     * Sets the value of the annualIncomeAmt property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setAnnualIncomeAmt(BigDecimal value) {
        this.annualIncomeAmt = value;
    }

    /**
     * Gets the value of the buResponsibilityCentreId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getBuResponsibilityCentreId() {
        return buResponsibilityCentreId;
    }

    /**
     * Sets the value of the buResponsibilityCentreId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setBuResponsibilityCentreId(Long value) {
        this.buResponsibilityCentreId = value;
    }

    /**
     * Gets the value of the controlCreditLimit property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getControlCreditLimit() {
        return controlCreditLimit;
    }

    /**
     * Sets the value of the controlCreditLimit property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setControlCreditLimit(BigDecimal value) {
        this.controlCreditLimit = value;
    }

    /**
     * Gets the value of the countryOfRisk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountryOfRisk() {
        return countryOfRisk;
    }

    /**
     * Sets the value of the countryOfRisk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountryOfRisk(String value) {
        this.countryOfRisk = value;
    }

    /**
     * Gets the value of the creditRatingAgencyId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCreditRatingAgencyId() {
        return creditRatingAgencyId;
    }

    /**
     * Sets the value of the creditRatingAgencyId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCreditRatingAgencyId(Long value) {
        this.creditRatingAgencyId = value;
    }

    /**
     * Gets the value of the custBankInfoId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCustBankInfoId() {
        return custBankInfoId;
    }

    /**
     * Sets the value of the custBankInfoId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCustBankInfoId(Long value) {
        this.custBankInfoId = value;
    }

    /**
     * Gets the value of the customerId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
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
     * Gets the value of the customerSegment property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCustomerSegment() {
        return customerSegment;
    }

    /**
     * Sets the value of the customerSegment property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCustomerSegment(Long value) {
        this.customerSegment = value;
    }

    /**
     * Gets the value of the customerShortName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerShortName() {
        return customerShortName;
    }

    /**
     * Sets the value of the customerShortName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerShortName(String value) {
        this.customerShortName = value;
    }

    /**
     * Gets the value of the cyclicMessageGroupId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCyclicMessageGroupId() {
        return cyclicMessageGroupId;
    }

    /**
     * Sets the value of the cyclicMessageGroupId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCyclicMessageGroupId(Long value) {
        this.cyclicMessageGroupId = value;
    }

    /**
     * Gets the value of the industry property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setIndustry(Long value) {
        this.industry = value;
    }

    /**
     * Gets the value of the insiderRelationshipFlag property.
     *
     */
    public boolean isInsiderRelationshipFlag() {
        return insiderRelationshipFlag;
    }

    /**
     * Sets the value of the insiderRelationshipFlag property.
     *
     */
    public void setInsiderRelationshipFlag(boolean value) {
        this.insiderRelationshipFlag = value;
    }

    /**
     * Gets the value of the kycLevel property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getKycLevel() {
        return kycLevel;
    }

    /**
     * Sets the value of the kycLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setKycLevel(Long value) {
        this.kycLevel = value;
    }

    /**
     * Gets the value of the locale property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the mainContBusUnit property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getMainContBusUnit() {
        return mainContBusUnit;
    }

    /**
     * Sets the value of the mainContBusUnit property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setMainContBusUnit(Long value) {
        this.mainContBusUnit = value;
    }

    /**
     * Gets the value of the marketingCampaign property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getMarketingCampaign() {
        return marketingCampaign;
    }

    /**
     * Sets the value of the marketingCampaign property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setMarketingCampaign(Long value) {
        this.marketingCampaign = value;
    }

    /**
     * Gets the value of the monthlyIncomeAmt property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getMonthlyIncomeAmt() {
        return monthlyIncomeAmt;
    }

    /**
     * Sets the value of the monthlyIncomeAmt property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setMonthlyIncomeAmt(BigDecimal value) {
        this.monthlyIncomeAmt = value;
    }

    /**
     * Gets the value of the netWorthAmt property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getNetWorthAmt() {
        return netWorthAmt;
    }

    /**
     * Sets the value of the netWorthAmt property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setNetWorthAmt(BigDecimal value) {
        this.netWorthAmt = value;
    }

    /**
     * Gets the value of the openingReason property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getOpeningReason() {
        return openingReason;
    }

    /**
     * Sets the value of the openingReason property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setOpeningReason(Long value) {
        this.openingReason = value;
    }

    /**
     * Gets the value of the operationsCurrency property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getOperationsCurrency() {
        return operationsCurrency;
    }

    /**
     * Sets the value of the operationsCurrency property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setOperationsCurrency(Long value) {
        this.operationsCurrency = value;
    }

    /**
     * Gets the value of the ownerGenderCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOwnerGenderCode() {
        return ownerGenderCode;
    }

    /**
     * Sets the value of the ownerGenderCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOwnerGenderCode(String value) {
        this.ownerGenderCode = value;
    }

    /**
     * Gets the value of the primaryOfficer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrimaryOfficer() {
        return primaryOfficer;
    }

    /**
     * Sets the value of the primaryOfficer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrimaryOfficer(String value) {
        this.primaryOfficer = value;
    }

    /**
     * Gets the value of the privacyLevel property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPrivacyLevel() {
        return privacyLevel;
    }

    /**
     * Sets the value of the privacyLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPrivacyLevel(Long value) {
        this.privacyLevel = value;
    }

    /**
     * Gets the value of the referredCustomerNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReferredCustomerNo() {
        return referredCustomerNo;
    }

    /**
     * Sets the value of the referredCustomerNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReferredCustomerNo(String value) {
        this.referredCustomerNo = value;
    }

    /**
     * Gets the value of the relationshipMgr1Id property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getRelationshipMgr1Id() {
        return relationshipMgr1Id;
    }

    /**
     * Sets the value of the relationshipMgr1Id property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setRelationshipMgr1Id(Long value) {
        this.relationshipMgr1Id = value;
    }

    /**
     * Gets the value of the relationshipMgr2Id property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getRelationshipMgr2Id() {
        return relationshipMgr2Id;
    }

    /**
     * Sets the value of the relationshipMgr2Id property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setRelationshipMgr2Id(Long value) {
        this.relationshipMgr2Id = value;
    }

    /**
     * Gets the value of the residentCountry property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResidentCountry() {
        return residentCountry;
    }

    /**
     * Sets the value of the residentCountry property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResidentCountry(String value) {
        this.residentCountry = value;
    }

    /**
     * Gets the value of the residentFlag property.
     *
     */
    public boolean isResidentFlag() {
        return residentFlag;
    }

    /**
     * Sets the value of the residentFlag property.
     *
     */
    public void setResidentFlag(boolean value) {
        this.residentFlag = value;
    }

    /**
     * Gets the value of the riskCodeId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getRiskCodeId() {
        return riskCodeId;
    }

    /**
     * Sets the value of the riskCodeId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setRiskCodeId(Long value) {
        this.riskCodeId = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setServiceLevel(Long value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the sourceOfFundsId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSourceOfFundsId() {
        return sourceOfFundsId;
    }

    /**
     * Sets the value of the sourceOfFundsId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSourceOfFundsId(Long value) {
        this.sourceOfFundsId = value;
    }

    /**
     * Gets the value of the supplementaryOfficer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSupplementaryOfficer() {
        return supplementaryOfficer;
    }

    /**
     * Sets the value of the supplementaryOfficer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSupplementaryOfficer(String value) {
        this.supplementaryOfficer = value;
    }

    /**
     * Gets the value of the taxGroup property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getTaxGroup() {
        return taxGroup;
    }

    /**
     * Sets the value of the taxGroup property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTaxGroup(Long value) {
        this.taxGroup = value;
    }

    /**
     * Gets the value of the taxIdentificationNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxIdentificationNo() {
        return taxIdentificationNo;
    }

    /**
     * Sets the value of the taxIdentificationNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxIdentificationNo(String value) {
        this.taxIdentificationNo = value;
    }

    /**
     * Gets the value of the taxStatus property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getTaxStatus() {
        return taxStatus;
    }

    /**
     * Sets the value of the taxStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTaxStatus(Long value) {
        this.taxStatus = value;
    }

    /**
     * Gets the value of the valueChainId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getValueChainId() {
        return valueChainId;
    }

    /**
     * Sets the value of the valueChainId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setValueChainId(Long value) {
        this.valueChainId = value;
    }

}
