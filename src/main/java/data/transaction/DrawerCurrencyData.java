//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 04:32:59 PM WAT
//


package data.transaction;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for drawerCurrencyData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="drawerCurrencyData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cashBoughtCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cashInCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cashOutCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cashSaleCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="currencyIsoCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyRoundingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="diffBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="displayCurrentBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayEndingBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayOpenBal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayOverageAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayRefundAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayShortageAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="drawerCurrencyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="drawerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="endBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="openBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="overageAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="refundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="shortageAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalCashBought" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalCashIn" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalCashOut" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalCashSale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "drawerCurrencyData", namespace = "http://data.org.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "cashBoughtCount",
    "cashInCount",
    "cashOutCount",
    "cashSaleCount",
    "currencyId",
    "currencyIsoCd",
    "currencyRoundingMethod",
    "currentBalance",
    "diffBalance",
    "displayCurrentBal",
    "displayEndingBal",
    "displayOpenBal",
    "displayOverageAmount",
    "displayRefundAmount",
    "displayShortageAmount",
    "drawerCurrencyId",
    "drawerId",
    "endBalance",
    "openBalance",
    "overageAmount",
    "refundAmount",
    "shortageAmount",
    "status",
    "totalCashBought",
    "totalCashIn",
    "totalCashOut",
    "totalCashSale"
})
public class DrawerCurrencyData {

    protected Long cashBoughtCount;
    protected Long cashInCount;
    protected Long cashOutCount;
    protected Long cashSaleCount;
    protected Long currencyId;
    protected String currencyIsoCd;
    protected String currencyRoundingMethod;
    protected BigDecimal currentBalance;
    protected BigDecimal diffBalance;
    protected String displayCurrentBal;
    protected String displayEndingBal;
    protected String displayOpenBal;
    protected String displayOverageAmount;
    protected String displayRefundAmount;
    protected String displayShortageAmount;
    protected Long drawerCurrencyId;
    protected Long drawerId;
    protected BigDecimal endBalance;
    protected BigDecimal openBalance;
    protected BigDecimal overageAmount;
    protected BigDecimal refundAmount;
    protected BigDecimal shortageAmount;
    protected String status;
    protected BigDecimal totalCashBought;
    protected BigDecimal totalCashIn;
    protected BigDecimal totalCashOut;
    protected BigDecimal totalCashSale;

    /**
     * Gets the value of the cashBoughtCount property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCashBoughtCount() {
        return cashBoughtCount;
    }

    /**
     * Sets the value of the cashBoughtCount property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCashBoughtCount(Long value) {
        this.cashBoughtCount = value;
    }

    /**
     * Gets the value of the cashInCount property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCashInCount() {
        return cashInCount;
    }

    /**
     * Sets the value of the cashInCount property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCashInCount(Long value) {
        this.cashInCount = value;
    }

    /**
     * Gets the value of the cashOutCount property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCashOutCount() {
        return cashOutCount;
    }

    /**
     * Sets the value of the cashOutCount property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCashOutCount(Long value) {
        this.cashOutCount = value;
    }

    /**
     * Gets the value of the cashSaleCount property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCashSaleCount() {
        return cashSaleCount;
    }

    /**
     * Sets the value of the cashSaleCount property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCashSaleCount(Long value) {
        this.cashSaleCount = value;
    }

    /**
     * Gets the value of the currencyId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the value of the currencyId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCurrencyId(Long value) {
        this.currencyId = value;
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
     * Gets the value of the currencyRoundingMethod property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrencyRoundingMethod() {
        return currencyRoundingMethod;
    }

    /**
     * Sets the value of the currencyRoundingMethod property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrencyRoundingMethod(String value) {
        this.currencyRoundingMethod = value;
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
     * Gets the value of the diffBalance property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getDiffBalance() {
        return diffBalance;
    }

    /**
     * Sets the value of the diffBalance property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setDiffBalance(BigDecimal value) {
        this.diffBalance = value;
    }

    /**
     * Gets the value of the displayCurrentBal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayCurrentBal() {
        return displayCurrentBal;
    }

    /**
     * Sets the value of the displayCurrentBal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisplayCurrentBal(String value) {
        this.displayCurrentBal = value;
    }

    /**
     * Gets the value of the displayEndingBal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayEndingBal() {
        return displayEndingBal;
    }

    /**
     * Sets the value of the displayEndingBal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisplayEndingBal(String value) {
        this.displayEndingBal = value;
    }

    /**
     * Gets the value of the displayOpenBal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayOpenBal() {
        return displayOpenBal;
    }

    /**
     * Sets the value of the displayOpenBal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisplayOpenBal(String value) {
        this.displayOpenBal = value;
    }

    /**
     * Gets the value of the displayOverageAmount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayOverageAmount() {
        return displayOverageAmount;
    }

    /**
     * Sets the value of the displayOverageAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisplayOverageAmount(String value) {
        this.displayOverageAmount = value;
    }

    /**
     * Gets the value of the displayRefundAmount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayRefundAmount() {
        return displayRefundAmount;
    }

    /**
     * Sets the value of the displayRefundAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisplayRefundAmount(String value) {
        this.displayRefundAmount = value;
    }

    /**
     * Gets the value of the displayShortageAmount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisplayShortageAmount() {
        return displayShortageAmount;
    }

    /**
     * Sets the value of the displayShortageAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisplayShortageAmount(String value) {
        this.displayShortageAmount = value;
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
     * Gets the value of the endBalance property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getEndBalance() {
        return endBalance;
    }

    /**
     * Sets the value of the endBalance property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setEndBalance(BigDecimal value) {
        this.endBalance = value;
    }

    /**
     * Gets the value of the openBalance property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getOpenBalance() {
        return openBalance;
    }

    /**
     * Sets the value of the openBalance property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setOpenBalance(BigDecimal value) {
        this.openBalance = value;
    }

    /**
     * Gets the value of the overageAmount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getOverageAmount() {
        return overageAmount;
    }

    /**
     * Sets the value of the overageAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setOverageAmount(BigDecimal value) {
        this.overageAmount = value;
    }

    /**
     * Gets the value of the refundAmount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setRefundAmount(BigDecimal value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the shortageAmount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getShortageAmount() {
        return shortageAmount;
    }

    /**
     * Sets the value of the shortageAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setShortageAmount(BigDecimal value) {
        this.shortageAmount = value;
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
     * Gets the value of the totalCashBought property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalCashBought() {
        return totalCashBought;
    }

    /**
     * Sets the value of the totalCashBought property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalCashBought(BigDecimal value) {
        this.totalCashBought = value;
    }

    /**
     * Gets the value of the totalCashIn property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalCashIn() {
        return totalCashIn;
    }

    /**
     * Sets the value of the totalCashIn property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalCashIn(BigDecimal value) {
        this.totalCashIn = value;
    }

    /**
     * Gets the value of the totalCashOut property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalCashOut() {
        return totalCashOut;
    }

    /**
     * Sets the value of the totalCashOut property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalCashOut(BigDecimal value) {
        this.totalCashOut = value;
    }

    /**
     * Gets the value of the totalCashSale property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalCashSale() {
        return totalCashSale;
    }

    /**
     * Sets the value of the totalCashSale property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalCashSale(BigDecimal value) {
        this.totalCashSale = value;
    }

}
