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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XAPIBaseTxnRequestData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="XAPIBaseTxnRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.ws.supernova.neptunesoftware.com/}XAPIRequestBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contraAcctNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contraGLAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgBusinessUnitId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="overrideExchangeRateValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="overrideFromExchagneRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="overrideToExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="prepaidTxnFg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="serviceProviderCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceProviderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="skipCrncyConversion" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="txnAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="txnCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnGLFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="txnReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnRevFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="waiveCharge" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XAPIBaseTxnRequestData", namespace = "http://data.txnprocess.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "acctNo",
    "contraAcctNo",
    "contraGLAccountNumber",
    "orgBusinessUnitId",
    "overrideExchangeRateValue",
    "overrideFromExchagneRate",
    "overrideToExchangeRate",
    "prepaidTxnFg",
    "product",
    "productId",
    "serviceProviderCd",
    "serviceProviderId",
    "skipCrncyConversion",
    "txnAmount",
    "txnCurrencyCode",
    "txnDate",
    "txnDescription",
    "txnGLFlag",
    "txnReference",
    "txnRevFlag",
    "valueDate",
    "waiveCharge"
})
@XmlSeeAlso({
    TxnProcessRequestData.class,
    CashVoucherRequestData.class,
    GroupCashTransactionRequestData.class,
    GroupCashTransactionDetailData.class,
    CreditCardRepaymentRequestData.class,
    CashRequestData.class,
    DraftEncashmentRequestData.class,
    DraftPurchaseRequestData.class,
    ClearingChequeRequestData.class,
    TxnWorkflowRequestData.class
})
public class XAPIBaseTxnRequestData
    extends XAPIRequestBaseObject
{

    protected String acctNo;
    protected String contraAcctNo;
    protected String contraGLAccountNumber;
    protected Long orgBusinessUnitId;
    protected BigDecimal overrideExchangeRateValue;
    protected BigDecimal overrideFromExchagneRate;
    protected BigDecimal overrideToExchangeRate;
    protected String prepaidTxnFg;
    protected String product;
    protected Long productId;
    protected String serviceProviderCd;
    protected Long serviceProviderId;
    protected boolean skipCrncyConversion;
    protected BigDecimal txnAmount;
    protected String txnCurrencyCode;
    protected String txnDate;
    protected String txnDescription;
    protected boolean txnGLFlag;
    protected String txnReference;
    protected boolean txnRevFlag;
    protected String valueDate;
    protected boolean waiveCharge;

    /**
     * Gets the value of the acctNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAcctNo() {
        return acctNo;
    }

    /**
     * Sets the value of the acctNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAcctNo(String value) {
        this.acctNo = value;
    }

    /**
     * Gets the value of the contraAcctNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContraAcctNo() {
        return contraAcctNo;
    }

    /**
     * Sets the value of the contraAcctNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContraAcctNo(String value) {
        this.contraAcctNo = value;
    }

    /**
     * Gets the value of the contraGLAccountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContraGLAccountNumber() {
        return contraGLAccountNumber;
    }

    /**
     * Sets the value of the contraGLAccountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContraGLAccountNumber(String value) {
        this.contraGLAccountNumber = value;
    }

    /**
     * Gets the value of the orgBusinessUnitId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getOrgBusinessUnitId() {
        return orgBusinessUnitId;
    }

    /**
     * Sets the value of the orgBusinessUnitId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setOrgBusinessUnitId(Long value) {
        this.orgBusinessUnitId = value;
    }

    /**
     * Gets the value of the overrideExchangeRateValue property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getOverrideExchangeRateValue() {
        return overrideExchangeRateValue;
    }

    /**
     * Sets the value of the overrideExchangeRateValue property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setOverrideExchangeRateValue(BigDecimal value) {
        this.overrideExchangeRateValue = value;
    }

    /**
     * Gets the value of the overrideFromExchagneRate property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getOverrideFromExchagneRate() {
        return overrideFromExchagneRate;
    }

    /**
     * Sets the value of the overrideFromExchagneRate property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setOverrideFromExchagneRate(BigDecimal value) {
        this.overrideFromExchagneRate = value;
    }

    /**
     * Gets the value of the overrideToExchangeRate property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getOverrideToExchangeRate() {
        return overrideToExchangeRate;
    }

    /**
     * Sets the value of the overrideToExchangeRate property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setOverrideToExchangeRate(BigDecimal value) {
        this.overrideToExchangeRate = value;
    }

    /**
     * Gets the value of the prepaidTxnFg property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrepaidTxnFg() {
        return prepaidTxnFg;
    }

    /**
     * Sets the value of the prepaidTxnFg property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrepaidTxnFg(String value) {
        this.prepaidTxnFg = value;
    }

    /**
     * Gets the value of the product property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the productId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the serviceProviderCd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getServiceProviderCd() {
        return serviceProviderCd;
    }

    /**
     * Sets the value of the serviceProviderCd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setServiceProviderCd(String value) {
        this.serviceProviderCd = value;
    }

    /**
     * Gets the value of the serviceProviderId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getServiceProviderId() {
        return serviceProviderId;
    }

    /**
     * Sets the value of the serviceProviderId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setServiceProviderId(Long value) {
        this.serviceProviderId = value;
    }

    /**
     * Gets the value of the skipCrncyConversion property.
     *
     */
    public boolean isSkipCrncyConversion() {
        return skipCrncyConversion;
    }

    /**
     * Sets the value of the skipCrncyConversion property.
     *
     */
    public void setSkipCrncyConversion(boolean value) {
        this.skipCrncyConversion = value;
    }

    /**
     * Gets the value of the txnAmount property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTxnAmount() {
        return txnAmount;
    }

    /**
     * Sets the value of the txnAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTxnAmount(BigDecimal value) {
        this.txnAmount = value;
    }

    /**
     * Gets the value of the txnCurrencyCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxnCurrencyCode() {
        return txnCurrencyCode;
    }

    /**
     * Sets the value of the txnCurrencyCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxnCurrencyCode(String value) {
        this.txnCurrencyCode = value;
    }

    /**
     * Gets the value of the txnDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the value of the txnDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxnDate(String value) {
        this.txnDate = value;
    }

    /**
     * Gets the value of the txnDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxnDescription() {
        return txnDescription;
    }

    /**
     * Sets the value of the txnDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxnDescription(String value) {
        this.txnDescription = value;
    }

    /**
     * Gets the value of the txnGLFlag property.
     *
     */
    public boolean isTxnGLFlag() {
        return txnGLFlag;
    }

    /**
     * Sets the value of the txnGLFlag property.
     *
     */
    public void setTxnGLFlag(boolean value) {
        this.txnGLFlag = value;
    }

    /**
     * Gets the value of the txnReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxnReference() {
        return txnReference;
    }

    /**
     * Sets the value of the txnReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxnReference(String value) {
        this.txnReference = value;
    }

    /**
     * Gets the value of the txnRevFlag property.
     *
     */
    public boolean isTxnRevFlag() {
        return txnRevFlag;
    }

    /**
     * Sets the value of the txnRevFlag property.
     *
     */
    public void setTxnRevFlag(boolean value) {
        this.txnRevFlag = value;
    }

    /**
     * Gets the value of the valueDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValueDate(String value) {
        this.valueDate = value;
    }

    /**
     * Gets the value of the waiveCharge property.
     *
     */
    public boolean isWaiveCharge() {
        return waiveCharge;
    }

    /**
     * Sets the value of the waiveCharge property.
     *
     */
    public void setWaiveCharge(boolean value) {
        this.waiveCharge = value;
    }

}
