//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 04:35:20 PM WAT
//


package data.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for customerIdentificationInformation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="customerIdentificationInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="binaryImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="cityOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityOfIssueCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityOfIssueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="countryOfIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryOfIssueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="identificationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="identityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identityTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identityTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="stateOfIssueCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stateOfIssueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="strExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="verifiedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerIdentificationInformation", namespace = "http://data.customer.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "binaryImage",
    "cityOfIssue",
    "cityOfIssueCd",
    "cityOfIssueId",
    "countryOfIssue",
    "countryOfIssueId",
    "customerName",
    "customerNumber",
    "expiryDate",
    "identificationId",
    "identityNumber",
    "identityType",
    "identityTypeDesc",
    "identityTypeId",
    "issueDate",
    "stateOfIssueCd",
    "stateOfIssueId",
    "strExpiryDate",
    "strIssueDate",
    "verifiedFlag"
})
public class CustomerIdentificationInformation {

    protected byte[] binaryImage;
    protected String cityOfIssue;
    protected String cityOfIssueCd;
    protected Long cityOfIssueId;
    protected String countryOfIssue;
    protected Long countryOfIssueId;
    protected String customerName;
    protected String customerNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    protected Long identificationId;
    protected String identityNumber;
    protected String identityType;
    protected String identityTypeDesc;
    protected Long identityTypeId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    protected String stateOfIssueCd;
    protected Long stateOfIssueId;
    protected String strExpiryDate;
    protected String strIssueDate;
    protected Boolean verifiedFlag;

    /**
     * Gets the value of the binaryImage property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryImage() {
        return binaryImage;
    }

    /**
     * Sets the value of the binaryImage property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryImage(byte[] value) {
        this.binaryImage = value;
    }

    /**
     * Gets the value of the cityOfIssue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCityOfIssue() {
        return cityOfIssue;
    }

    /**
     * Sets the value of the cityOfIssue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCityOfIssue(String value) {
        this.cityOfIssue = value;
    }

    /**
     * Gets the value of the cityOfIssueCd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCityOfIssueCd() {
        return cityOfIssueCd;
    }

    /**
     * Sets the value of the cityOfIssueCd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCityOfIssueCd(String value) {
        this.cityOfIssueCd = value;
    }

    /**
     * Gets the value of the cityOfIssueId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCityOfIssueId() {
        return cityOfIssueId;
    }

    /**
     * Sets the value of the cityOfIssueId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCityOfIssueId(Long value) {
        this.cityOfIssueId = value;
    }

    /**
     * Gets the value of the countryOfIssue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountryOfIssue() {
        return countryOfIssue;
    }

    /**
     * Sets the value of the countryOfIssue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountryOfIssue(String value) {
        this.countryOfIssue = value;
    }

    /**
     * Gets the value of the countryOfIssueId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCountryOfIssueId() {
        return countryOfIssueId;
    }

    /**
     * Sets the value of the countryOfIssueId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCountryOfIssueId(Long value) {
        this.countryOfIssueId = value;
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
     * Gets the value of the identificationId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getIdentificationId() {
        return identificationId;
    }

    /**
     * Sets the value of the identificationId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setIdentificationId(Long value) {
        this.identificationId = value;
    }

    /**
     * Gets the value of the identityNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    /**
     * Sets the value of the identityNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentityNumber(String value) {
        this.identityNumber = value;
    }

    /**
     * Gets the value of the identityType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * Sets the value of the identityType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentityType(String value) {
        this.identityType = value;
    }

    /**
     * Gets the value of the identityTypeDesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdentityTypeDesc() {
        return identityTypeDesc;
    }

    /**
     * Sets the value of the identityTypeDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdentityTypeDesc(String value) {
        this.identityTypeDesc = value;
    }

    /**
     * Gets the value of the identityTypeId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getIdentityTypeId() {
        return identityTypeId;
    }

    /**
     * Sets the value of the identityTypeId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setIdentityTypeId(Long value) {
        this.identityTypeId = value;
    }

    /**
     * Gets the value of the issueDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the stateOfIssueCd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStateOfIssueCd() {
        return stateOfIssueCd;
    }

    /**
     * Sets the value of the stateOfIssueCd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStateOfIssueCd(String value) {
        this.stateOfIssueCd = value;
    }

    /**
     * Gets the value of the stateOfIssueId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getStateOfIssueId() {
        return stateOfIssueId;
    }

    /**
     * Sets the value of the stateOfIssueId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setStateOfIssueId(Long value) {
        this.stateOfIssueId = value;
    }

    /**
     * Gets the value of the strExpiryDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrExpiryDate() {
        return strExpiryDate;
    }

    /**
     * Sets the value of the strExpiryDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrExpiryDate(String value) {
        this.strExpiryDate = value;
    }

    /**
     * Gets the value of the strIssueDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStrIssueDate() {
        return strIssueDate;
    }

    /**
     * Sets the value of the strIssueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStrIssueDate(String value) {
        this.strIssueDate = value;
    }

    /**
     * Gets the value of the verifiedFlag property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isVerifiedFlag() {
        return verifiedFlag;
    }

    /**
     * Sets the value of the verifiedFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setVerifiedFlag(Boolean value) {
        this.verifiedFlag = value;
    }

}
