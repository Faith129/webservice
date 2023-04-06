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
 * <p>Java class for drawerRequestData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="drawerRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.ws.supernova.neptunesoftware.com/}XAPIRequestBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currDenomAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currDenomNum" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="drawerCurrencies" type="{http://data.org.server.ws.supernova.neptunesoftware.com/}drawerCurrencyData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="drawerCurrency" type="{http://data.org.server.ws.supernova.neptunesoftware.com/}drawerCurrencyData" minOccurs="0"/&gt;
 *         &lt;element name="drawerCurrencyDenomData" type="{http://data.org.server.ws.supernova.neptunesoftware.com/}drawerCurrencyDenomData" minOccurs="0"/&gt;
 *         &lt;element name="drawerCurrencyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="drawerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="drawerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="drawerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="drawerUserRoleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ignoreFg" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="overrideLimitFg" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="warningFg" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drawerRequestData", namespace = "http://data.org.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "currDenomAmt",
    "currDenomNum",
    "drawerCurrencies",
    "drawerCurrency",
    "drawerCurrencyDenomData",
    "drawerCurrencyId",
    "drawerId",
    "drawerNumber",
    "drawerType",
    "drawerUserRoleId",
    "ignoreFg",
    "overrideLimitFg",
    "status",
    "warningFg"
})
public class DrawerRequestData
    extends XAPIRequestBaseObject
{

    @XmlElement(nillable = true)
    protected List<BigDecimal> currDenomAmt;
    @XmlElement(nillable = true)
    protected List<BigDecimal> currDenomNum;
    @XmlElement(nillable = true)
    protected List<DrawerCurrencyData> drawerCurrencies;
    protected DrawerCurrencyData drawerCurrency;
    protected DrawerCurrencyDenomData drawerCurrencyDenomData;
    protected Long drawerCurrencyId;
    protected Long drawerId;
    protected String drawerNumber;
    protected String drawerType;
    protected Long drawerUserRoleId;
    protected boolean ignoreFg;
    protected boolean overrideLimitFg;
    protected String status;
    protected boolean warningFg;

    /**
     * Gets the value of the currDenomAmt property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currDenomAmt property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrDenomAmt().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     *
     *
     */
    public List<BigDecimal> getCurrDenomAmt() {
        if (currDenomAmt == null) {
            currDenomAmt = new ArrayList<BigDecimal>();
        }
        return this.currDenomAmt;
    }

    /**
     * Gets the value of the currDenomNum property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currDenomNum property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrDenomNum().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     *
     *
     */
    public List<BigDecimal> getCurrDenomNum() {
        if (currDenomNum == null) {
            currDenomNum = new ArrayList<BigDecimal>();
        }
        return this.currDenomNum;
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
     * Gets the value of the drawerCurrencyDenomData property.
     *
     * @return
     *     possible object is
     *     {@link DrawerCurrencyDenomData }
     *
     */
    public DrawerCurrencyDenomData getDrawerCurrencyDenomData() {
        return drawerCurrencyDenomData;
    }

    /**
     * Sets the value of the drawerCurrencyDenomData property.
     *
     * @param value
     *     allowed object is
     *     {@link DrawerCurrencyDenomData }
     *
     */
    public void setDrawerCurrencyDenomData(DrawerCurrencyDenomData value) {
        this.drawerCurrencyDenomData = value;
    }

    /**
     * Gets the value of the drawerCurrencyId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDrawerCurrencyId() {
        return drawerCurrencyId;
    }

    /**
     * Sets the value of the drawerCurrencyId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDrawerCurrencyId(Long value) {
        this.drawerCurrencyId = value;
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
     * Gets the value of the ignoreFg property.
     *
     */
    public boolean isIgnoreFg() {
        return ignoreFg;
    }

    /**
     * Sets the value of the ignoreFg property.
     *
     */
    public void setIgnoreFg(boolean value) {
        this.ignoreFg = value;
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
     * Gets the value of the warningFg property.
     *
     */
    public boolean isWarningFg() {
        return warningFg;
    }

    /**
     * Sets the value of the warningFg property.
     *
     */
    public void setWarningFg(boolean value) {
        this.warningFg = value;
    }

}
