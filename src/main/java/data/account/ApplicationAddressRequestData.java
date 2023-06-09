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


/**
 * <p>Java class for applicationAddressRequestData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="applicationAddressRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.ws.supernova.neptunesoftware.com/}XAPIRequestBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="addressTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applAddressId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="custCountry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="custCountryCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentObjectReference" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="parentObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentObjectTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="propertyTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationAddressRequestData", namespace = "http://data.account.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "addressStatus",
    "addressType",
    "addressTypeCd",
    "applAddressId",
    "custCountry",
    "custCountryCd",
    "customerCity",
    "customerState",
    "parentObjectReference",
    "parentObjectType",
    "parentObjectTypeId",
    "postCode",
    "primaryAddress",
    "propertyType",
    "propertyTypeCd",
    "status",
    "strFromDate",
    "strToDate"
})
public class ApplicationAddressRequestData
    extends XAPIRequestBaseObject
{

    protected String addressLine1;
    protected String addressLine2;
    protected String addressLine3;
    protected String addressLine4;
    protected String addressStatus;
    protected Long addressType;
    protected String addressTypeCd;
    protected Long applAddressId;
    protected Long custCountry;
    protected String custCountryCd;
    protected String customerCity;
    protected String customerState;
    protected Long parentObjectReference;
    protected String parentObjectType;
    protected Long parentObjectTypeId;
    protected String postCode;
    protected Boolean primaryAddress;
    protected Long propertyType;
    protected String propertyTypeCd;
    protected String status;
    protected String strFromDate;
    protected String strToDate;

    /**
     * Gets the value of the addressLine1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the addressStatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressStatus() {
        return addressStatus;
    }

    /**
     * Sets the value of the addressStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressStatus(String value) {
        this.addressStatus = value;
    }

    /**
     * Gets the value of the addressType property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setAddressType(Long value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressTypeCd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressTypeCd() {
        return addressTypeCd;
    }

    /**
     * Sets the value of the addressTypeCd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressTypeCd(String value) {
        this.addressTypeCd = value;
    }

    /**
     * Gets the value of the applAddressId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getApplAddressId() {
        return applAddressId;
    }

    /**
     * Sets the value of the applAddressId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setApplAddressId(Long value) {
        this.applAddressId = value;
    }

    /**
     * Gets the value of the custCountry property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCustCountry() {
        return custCountry;
    }

    /**
     * Sets the value of the custCountry property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCustCountry(Long value) {
        this.custCountry = value;
    }

    /**
     * Gets the value of the custCountryCd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustCountryCd() {
        return custCountryCd;
    }

    /**
     * Sets the value of the custCountryCd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustCountryCd(String value) {
        this.custCountryCd = value;
    }

    /**
     * Gets the value of the customerCity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerCity() {
        return customerCity;
    }

    /**
     * Sets the value of the customerCity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerCity(String value) {
        this.customerCity = value;
    }

    /**
     * Gets the value of the customerState property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerState() {
        return customerState;
    }

    /**
     * Sets the value of the customerState property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerState(String value) {
        this.customerState = value;
    }

    /**
     * Gets the value of the parentObjectReference property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getParentObjectReference() {
        return parentObjectReference;
    }

    /**
     * Sets the value of the parentObjectReference property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setParentObjectReference(Long value) {
        this.parentObjectReference = value;
    }

    /**
     * Gets the value of the parentObjectType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getParentObjectType() {
        return parentObjectType;
    }

    /**
     * Sets the value of the parentObjectType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setParentObjectType(String value) {
        this.parentObjectType = value;
    }

    /**
     * Gets the value of the parentObjectTypeId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getParentObjectTypeId() {
        return parentObjectTypeId;
    }

    /**
     * Sets the value of the parentObjectTypeId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setParentObjectTypeId(Long value) {
        this.parentObjectTypeId = value;
    }

    /**
     * Gets the value of the postCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setPrimaryAddress(Boolean value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the propertyType property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setPropertyType(Long value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the propertyTypeCd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPropertyTypeCd() {
        return propertyTypeCd;
    }

    /**
     * Sets the value of the propertyTypeCd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPropertyTypeCd(String value) {
        this.propertyTypeCd = value;
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

}
