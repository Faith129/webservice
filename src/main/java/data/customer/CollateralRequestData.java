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
 * <p>Java class for collateralRequestData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="collateralRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.ws.supernova.neptunesoftware.com/}XAPIRequestBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addrLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addrLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addrLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addrLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chrgTaxStlmntAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cntryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="collateralCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collateralCurrencyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="collateralDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collateralIssueDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collateralMarketValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="collateralReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collateralType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collateralTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="customerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="districtId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="expiryDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forcedSalesValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="guaranteeIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lendingPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lendingValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numberOfUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="othrFacilitiesFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="postcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="verifiedDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collateralRequestData", namespace = "http://data.customer.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "addrLine1",
    "addrLine2",
    "addrLine3",
    "addrLine4",
    "chrgTaxStlmntAcctNo",
    "city",
    "cntryId",
    "collateralCategoryCode",
    "collateralCurrencyId",
    "collateralDescription",
    "collateralIssueDateStr",
    "collateralMarketValue",
    "collateralReferenceNumber",
    "collateralType",
    "collateralTypeId",
    "customerId",
    "customerNo",
    "description",
    "districtId",
    "expiryDateStr",
    "forcedSalesValue",
    "guaranteeIssuer",
    "lendingPercent",
    "lendingValue",
    "numberOfUnits",
    "othrFacilitiesFlag",
    "postcd",
    "state",
    "unitCode",
    "verifiedDateStr"
})
public class CollateralRequestData
    extends XAPIRequestBaseObject
{

    protected String addrLine1;
    protected String addrLine2;
    protected String addrLine3;
    protected String addrLine4;
    protected String chrgTaxStlmntAcctNo;
    protected String city;
    protected Long cntryId;
    protected String collateralCategoryCode;
    protected Long collateralCurrencyId;
    protected String collateralDescription;
    protected String collateralIssueDateStr;
    protected BigDecimal collateralMarketValue;
    protected String collateralReferenceNumber;
    protected String collateralType;
    protected Long collateralTypeId;
    protected Long customerId;
    protected String customerNo;
    protected String description;
    protected Long districtId;
    protected String expiryDateStr;
    protected BigDecimal forcedSalesValue;
    protected String guaranteeIssuer;
    protected BigDecimal lendingPercent;
    protected BigDecimal lendingValue;
    protected BigDecimal numberOfUnits;
    protected boolean othrFacilitiesFlag;
    protected String postcd;
    protected String state;
    protected String unitCode;
    protected String verifiedDateStr;

    /**
     * Gets the value of the addrLine1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddrLine1() {
        return addrLine1;
    }

    /**
     * Sets the value of the addrLine1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddrLine1(String value) {
        this.addrLine1 = value;
    }

    /**
     * Gets the value of the addrLine2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddrLine2() {
        return addrLine2;
    }

    /**
     * Sets the value of the addrLine2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddrLine2(String value) {
        this.addrLine2 = value;
    }

    /**
     * Gets the value of the addrLine3 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddrLine3() {
        return addrLine3;
    }

    /**
     * Sets the value of the addrLine3 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddrLine3(String value) {
        this.addrLine3 = value;
    }

    /**
     * Gets the value of the addrLine4 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddrLine4() {
        return addrLine4;
    }

    /**
     * Sets the value of the addrLine4 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddrLine4(String value) {
        this.addrLine4 = value;
    }

    /**
     * Gets the value of the chrgTaxStlmntAcctNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChrgTaxStlmntAcctNo() {
        return chrgTaxStlmntAcctNo;
    }

    /**
     * Sets the value of the chrgTaxStlmntAcctNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setChrgTaxStlmntAcctNo(String value) {
        this.chrgTaxStlmntAcctNo = value;
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
     * Gets the value of the cntryId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCntryId() {
        return cntryId;
    }

    /**
     * Sets the value of the cntryId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCntryId(Long value) {
        this.cntryId = value;
    }

    /**
     * Gets the value of the collateralCategoryCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCollateralCategoryCode() {
        return collateralCategoryCode;
    }

    /**
     * Sets the value of the collateralCategoryCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCollateralCategoryCode(String value) {
        this.collateralCategoryCode = value;
    }

    /**
     * Gets the value of the collateralCurrencyId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCollateralCurrencyId() {
        return collateralCurrencyId;
    }

    /**
     * Sets the value of the collateralCurrencyId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCollateralCurrencyId(Long value) {
        this.collateralCurrencyId = value;
    }

    /**
     * Gets the value of the collateralDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCollateralDescription() {
        return collateralDescription;
    }

    /**
     * Sets the value of the collateralDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCollateralDescription(String value) {
        this.collateralDescription = value;
    }

    /**
     * Gets the value of the collateralIssueDateStr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCollateralIssueDateStr() {
        return collateralIssueDateStr;
    }

    /**
     * Sets the value of the collateralIssueDateStr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCollateralIssueDateStr(String value) {
        this.collateralIssueDateStr = value;
    }

    /**
     * Gets the value of the collateralMarketValue property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCollateralMarketValue() {
        return collateralMarketValue;
    }

    /**
     * Sets the value of the collateralMarketValue property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCollateralMarketValue(BigDecimal value) {
        this.collateralMarketValue = value;
    }

    /**
     * Gets the value of the collateralReferenceNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCollateralReferenceNumber() {
        return collateralReferenceNumber;
    }

    /**
     * Sets the value of the collateralReferenceNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCollateralReferenceNumber(String value) {
        this.collateralReferenceNumber = value;
    }

    /**
     * Gets the value of the collateralType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCollateralType() {
        return collateralType;
    }

    /**
     * Sets the value of the collateralType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCollateralType(String value) {
        this.collateralType = value;
    }

    /**
     * Gets the value of the collateralTypeId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCollateralTypeId() {
        return collateralTypeId;
    }

    /**
     * Sets the value of the collateralTypeId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCollateralTypeId(Long value) {
        this.collateralTypeId = value;
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
     * Gets the value of the customerNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * Sets the value of the customerNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerNo(String value) {
        this.customerNo = value;
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
     * Gets the value of the districtId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDistrictId() {
        return districtId;
    }

    /**
     * Sets the value of the districtId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDistrictId(Long value) {
        this.districtId = value;
    }

    /**
     * Gets the value of the expiryDateStr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExpiryDateStr() {
        return expiryDateStr;
    }

    /**
     * Sets the value of the expiryDateStr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExpiryDateStr(String value) {
        this.expiryDateStr = value;
    }

    /**
     * Gets the value of the forcedSalesValue property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getForcedSalesValue() {
        return forcedSalesValue;
    }

    /**
     * Sets the value of the forcedSalesValue property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setForcedSalesValue(BigDecimal value) {
        this.forcedSalesValue = value;
    }

    /**
     * Gets the value of the guaranteeIssuer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGuaranteeIssuer() {
        return guaranteeIssuer;
    }

    /**
     * Sets the value of the guaranteeIssuer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGuaranteeIssuer(String value) {
        this.guaranteeIssuer = value;
    }

    /**
     * Gets the value of the lendingPercent property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getLendingPercent() {
        return lendingPercent;
    }

    /**
     * Sets the value of the lendingPercent property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setLendingPercent(BigDecimal value) {
        this.lendingPercent = value;
    }

    /**
     * Gets the value of the lendingValue property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getLendingValue() {
        return lendingValue;
    }

    /**
     * Sets the value of the lendingValue property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setLendingValue(BigDecimal value) {
        this.lendingValue = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setNumberOfUnits(BigDecimal value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the othrFacilitiesFlag property.
     *
     */
    public boolean isOthrFacilitiesFlag() {
        return othrFacilitiesFlag;
    }

    /**
     * Sets the value of the othrFacilitiesFlag property.
     *
     */
    public void setOthrFacilitiesFlag(boolean value) {
        this.othrFacilitiesFlag = value;
    }

    /**
     * Gets the value of the postcd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostcd() {
        return postcd;
    }

    /**
     * Sets the value of the postcd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostcd(String value) {
        this.postcd = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the unitCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the verifiedDateStr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getVerifiedDateStr() {
        return verifiedDateStr;
    }

    /**
     * Sets the value of the verifiedDateStr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setVerifiedDateStr(String value) {
        this.verifiedDateStr = value;
    }

}