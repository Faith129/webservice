//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 04:32:59 PM WAT
//


package data.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for drawerOutputData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="drawerOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currencyDenominations" type="{http://data.org.server.ws.supernova.neptunesoftware.com/}currencyDenomData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currencyIsoCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="drawerCurrencies" type="{http://data.org.server.ws.supernova.neptunesoftware.com/}drawerCurrencyData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="drawerCurrency" type="{http://data.org.server.ws.supernova.neptunesoftware.com/}drawerCurrencyData" minOccurs="0"/&gt;
 *         &lt;element name="drawerCurrencyDenomination" type="{http://data.org.server.ws.supernova.neptunesoftware.com/}drawerCurrencyDenomData" minOccurs="0"/&gt;
 *         &lt;element name="drawerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="drawerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="drawerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="drawerUserRoleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="errorData" type="{http://common.ws.supernova.neptunesoftware.com/}XAPIErrorData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="errorList" type="{http://common.ws.supernova.neptunesoftware.com/}XAPIErrorData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="overrideLimitFg" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="runningTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userRoleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="warningFg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drawerOutputData", namespace = "http://data.org.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "currencyDenominations",
    "currencyIsoCd",
    "currentBalance",
    "drawerCurrencies",
    "drawerCurrency",
    "drawerCurrencyDenomination",
    "drawerId",
    "drawerNumber",
    "drawerType",
    "drawerUserRoleId",
    "errorData",
    "errorList",
    "overrideLimitFg",
    "runningTotal",
    "scale",
    "status",
    "userRoleId",
    "warningFg"
})
public class DrawerOutputData {

    @XmlElement(nillable = true)
    protected List<CurrencyDenomData> currencyDenominations;
    protected String currencyIsoCd;
    protected BigDecimal currentBalance;
    @XmlElement(nillable = true)
    protected List<DrawerCurrencyData> drawerCurrencies;
    protected DrawerCurrencyData drawerCurrency;
    protected DrawerCurrencyDenomData drawerCurrencyDenomination;
    protected Long drawerId;
    protected String drawerNumber;
    protected String drawerType;
    protected Long drawerUserRoleId;
    @XmlElement(nillable = true)
    protected List<XAPIErrorData> errorData;
    @XmlElement(nillable = true)
    protected List<XAPIErrorData> errorList;
    protected boolean overrideLimitFg;
    protected BigDecimal runningTotal;
    protected Integer scale;
    protected String status;
    protected Long userRoleId;
    protected Boolean warningFg;

    /**
     * Gets the value of the currencyDenominations property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyDenominations property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyDenominations().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyDenomData }
     *
     *
     */
    public List<CurrencyDenomData> getCurrencyDenominations() {
        if (currencyDenominations == null) {
            currencyDenominations = new ArrayList<CurrencyDenomData>();
        }
        return this.currencyDenominations;
    }

    /**
     * Gets the value of the currencyIsoCd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrencyIsoCd() {
        return currencyIsoCd;
    }

    /**
     * Sets the value of the currencyIsoCd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrencyIsoCd(String value) {
        this.currencyIsoCd = value;
    }

    /**
     * Gets the value of the currentBalance property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCurrentBalance(BigDecimal value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the drawerCurrencies property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drawerCurrencies property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrawerCurrencies().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrawerCurrencyData }
     *
     *
     */
    public List<DrawerCurrencyData> getDrawerCurrencies() {
        if (drawerCurrencies == null) {
            drawerCurrencies = new ArrayList<DrawerCurrencyData>();
        }
        return this.drawerCurrencies;
    }

    /**
     * Gets the value of the drawerCurrency property.
     *
     * @return
     *     possible object is
     *     {@link DrawerCurrencyData }
     *
     */
    public DrawerCurrencyData getDrawerCurrency() {
        return drawerCurrency;
    }

    /**
     * Sets the value of the drawerCurrency property.
     *
     * @param value
     *     allowed object is
     *     {@link DrawerCurrencyData }
     *
     */
    public void setDrawerCurrency(DrawerCurrencyData value) {
        this.drawerCurrency = value;
    }

    /**
     * Gets the value of the drawerCurrencyDenomination property.
     *
     * @return
     *     possible object is
     *     {@link DrawerCurrencyDenomData }
     *
     */
    public DrawerCurrencyDenomData getDrawerCurrencyDenomination() {
        return drawerCurrencyDenomination;
    }

    /**
     * Sets the value of the drawerCurrencyDenomination property.
     *
     * @param value
     *     allowed object is
     *     {@link DrawerCurrencyDenomData }
     *
     */
    public void setDrawerCurrencyDenomination(DrawerCurrencyDenomData value) {
        this.drawerCurrencyDenomination = value;
    }

    /**
     * Gets the value of the drawerId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDrawerId() {
        return drawerId;
    }

    /**
     * Sets the value of the drawerId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDrawerId(Long value) {
        this.drawerId = value;
    }

    /**
     * Gets the value of the drawerNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDrawerNumber() {
        return drawerNumber;
    }

    /**
     * Sets the value of the drawerNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDrawerNumber(String value) {
        this.drawerNumber = value;
    }

    /**
     * Gets the value of the drawerType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDrawerType() {
        return drawerType;
    }

    /**
     * Sets the value of the drawerType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDrawerType(String value) {
        this.drawerType = value;
    }

    /**
     * Gets the value of the drawerUserRoleId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDrawerUserRoleId() {
        return drawerUserRoleId;
    }

    /**
     * Sets the value of the drawerUserRoleId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDrawerUserRoleId(Long value) {
        this.drawerUserRoleId = value;
    }

    /**
     * Gets the value of the errorData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XAPIErrorData }
     *
     *
     */
    public List<XAPIErrorData> getErrorData() {
        if (errorData == null) {
            errorData = new ArrayList<XAPIErrorData>();
        }
        return this.errorData;
    }

    /**
     * Gets the value of the errorList property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorList property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorList().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XAPIErrorData }
     *
     *
     */
    public List<XAPIErrorData> getErrorList() {
        if (errorList == null) {
            errorList = new ArrayList<XAPIErrorData>();
        }
        return this.errorList;
    }

    /**
     * Gets the value of the overrideLimitFg property.
     *
     */
    public boolean isOverrideLimitFg() {
        return overrideLimitFg;
    }

    /**
     * Sets the value of the overrideLimitFg property.
     *
     */
    public void setOverrideLimitFg(boolean value) {
        this.overrideLimitFg = value;
    }

    /**
     * Gets the value of the runningTotal property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRunningTotal() {
        return runningTotal;
    }

    /**
     * Sets the value of the runningTotal property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRunningTotal(BigDecimal value) {
        this.runningTotal = value;
    }

    /**
     * Gets the value of the scale property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setScale(Integer value) {
        this.scale = value;
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
     * Gets the value of the userRoleId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getUserRoleId() {
        return userRoleId;
    }

    /**
     * Sets the value of the userRoleId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setUserRoleId(Long value) {
        this.userRoleId = value;
    }

    /**
     * Gets the value of the warningFg property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isWarningFg() {
        return warningFg;
    }

    /**
     * Sets the value of the warningFg property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setWarningFg(Boolean value) {
        this.warningFg = value;
    }

}
