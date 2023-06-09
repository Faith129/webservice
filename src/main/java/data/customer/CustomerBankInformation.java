//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 04:35:20 PM WAT
//


package data.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerBankInformation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="customerBankInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryOfRisk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creditRatingAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerSegment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mainContBusUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marketingCampaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="openingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationsCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="privacyLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="residentCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="residentFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="riskCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerBankInformation", namespace = "http://data.customer.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "countryOfRisk",
    "creditRatingAgency",
    "customerNumber",
    "customerSegment",
    "customerShortName",
    "industry",
    "locale",
    "mainContBusUnit",
    "marketingCampaign",
    "openingReason",
    "operationsCurrency",
    "primaryOfficer",
    "privacyLevel",
    "residentCountry",
    "residentFlag",
    "riskCode",
    "serviceLevel",
    "supplementaryOfficer",
    "taxGroup",
    "taxStatus"
})
public class CustomerBankInformation {

    protected String countryOfRisk;
    protected String creditRatingAgency;
    protected String customerNumber;
    protected String customerSegment;
    protected String customerShortName;
    protected String industry;
    protected String locale;
    protected String mainContBusUnit;
    protected String marketingCampaign;
    protected String openingReason;
    protected String operationsCurrency;
    protected String primaryOfficer;
    protected String privacyLevel;
    protected String residentCountry;
    protected boolean residentFlag;
    protected String riskCode;
    protected String serviceLevel;
    protected String supplementaryOfficer;
    protected String taxGroup;
    protected String taxStatus;

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
     * Gets the value of the creditRatingAgency property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreditRatingAgency() {
        return creditRatingAgency;
    }

    /**
     * Sets the value of the creditRatingAgency property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreditRatingAgency(String value) {
        this.creditRatingAgency = value;
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
     *     {@link String }
     *
     */
    public String getCustomerSegment() {
        return customerSegment;
    }

    /**
     * Sets the value of the customerSegment property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerSegment(String value) {
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
     * Gets the value of the industry property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIndustry(String value) {
        this.industry = value;
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
     *     {@link String }
     *
     */
    public String getMainContBusUnit() {
        return mainContBusUnit;
    }

    /**
     * Sets the value of the mainContBusUnit property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMainContBusUnit(String value) {
        this.mainContBusUnit = value;
    }

    /**
     * Gets the value of the marketingCampaign property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarketingCampaign() {
        return marketingCampaign;
    }

    /**
     * Sets the value of the marketingCampaign property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarketingCampaign(String value) {
        this.marketingCampaign = value;
    }

    /**
     * Gets the value of the openingReason property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOpeningReason() {
        return openingReason;
    }

    /**
     * Sets the value of the openingReason property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOpeningReason(String value) {
        this.openingReason = value;
    }

    /**
     * Gets the value of the operationsCurrency property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperationsCurrency() {
        return operationsCurrency;
    }

    /**
     * Sets the value of the operationsCurrency property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperationsCurrency(String value) {
        this.operationsCurrency = value;
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
     *     {@link String }
     *
     */
    public String getPrivacyLevel() {
        return privacyLevel;
    }

    /**
     * Sets the value of the privacyLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrivacyLevel(String value) {
        this.privacyLevel = value;
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
     * Gets the value of the riskCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRiskCode() {
        return riskCode;
    }

    /**
     * Sets the value of the riskCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRiskCode(String value) {
        this.riskCode = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
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
     *     {@link String }
     *
     */
    public String getTaxGroup() {
        return taxGroup;
    }

    /**
     * Sets the value of the taxGroup property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxGroup(String value) {
        this.taxGroup = value;
    }

    /**
     * Gets the value of the taxStatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxStatus() {
        return taxStatus;
    }

    /**
     * Sets the value of the taxStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxStatus(String value) {
        this.taxStatus = value;
    }

}
