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
 * <p>Java class for groupCashTransactionOutputData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="groupCashTransactionOutputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://data.workflow.server.ws.supernova.neptunesoftware.com/}wsBaseWorkFlowData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditFacilityReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="currencyListOutputArrayData" type="{http://data.refglobal.server.ws.supernova.neptunesoftware.com/}genericPickListOutputData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="drawerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="facilityRepaymentsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="fileData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="groupCashSuspense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupCashTxnDetailData" type="{http://data.txnprocess.server.ws.supernova.neptunesoftware.com/}groupCashTransactionDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="groupCashTxnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="groupCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupCustomerNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupItemHasErrors" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="narrative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="poolAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="txnCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupCashTransactionOutputData", namespace = "http://data.txnprocess.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "creditFacilityReference",
    "currencyCode",
    "currencyId",
    "currencyListOutputArrayData",
    "drawerId",
    "facilityRepaymentsFlag",
    "fileData",
    "groupCashSuspense",
    "groupCashTxnDetailData",
    "groupCashTxnId",
    "groupCustomerName",
    "groupCustomerNo",
    "groupItemHasErrors",
    "narrative",
    "poolAccountNo",
    "reference",
    "status",
    "totalAmt",
    "txnCategory",
    "txnDate",
    "valueDate"
})
public class GroupCashTransactionOutputData
    extends WsBaseWorkFlowData
{

    protected String creditFacilityReference;
    protected String currencyCode;
    protected Long currencyId;
    @XmlElement(nillable = true)
    protected List<GenericPickListOutputData> currencyListOutputArrayData;
    protected Long drawerId;
    protected boolean facilityRepaymentsFlag;
    protected byte[] fileData;
    protected String groupCashSuspense;
    @XmlElement(nillable = true)
    protected List<GroupCashTransactionDetailData> groupCashTxnDetailData;
    protected Long groupCashTxnId;
    protected String groupCustomerName;
    protected String groupCustomerNo;
    protected boolean groupItemHasErrors;
    protected String narrative;
    protected String poolAccountNo;
    protected String reference;
    protected String status;
    protected BigDecimal totalAmt;
    protected String txnCategory;
    protected String txnDate;
    protected String valueDate;

    /**
     * Gets the value of the creditFacilityReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreditFacilityReference() {
        return creditFacilityReference;
    }

    /**
     * Sets the value of the creditFacilityReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreditFacilityReference(String value) {
        this.creditFacilityReference = value;
    }

    /**
     * Gets the value of the currencyCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
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
     * Gets the value of the currencyListOutputArrayData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyListOutputArrayData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyListOutputArrayData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericPickListOutputData }
     *
     *
     */
    public List<GenericPickListOutputData> getCurrencyListOutputArrayData() {
        if (currencyListOutputArrayData == null) {
            currencyListOutputArrayData = new ArrayList<GenericPickListOutputData>();
        }
        return this.currencyListOutputArrayData;
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
     * Gets the value of the facilityRepaymentsFlag property.
     *
     */
    public boolean isFacilityRepaymentsFlag() {
        return facilityRepaymentsFlag;
    }

    /**
     * Sets the value of the facilityRepaymentsFlag property.
     *
     */
    public void setFacilityRepaymentsFlag(boolean value) {
        this.facilityRepaymentsFlag = value;
    }

    /**
     * Gets the value of the fileData property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileData() {
        return fileData;
    }

    /**
     * Sets the value of the fileData property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileData(byte[] value) {
        this.fileData = value;
    }

    /**
     * Gets the value of the groupCashSuspense property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGroupCashSuspense() {
        return groupCashSuspense;
    }

    /**
     * Sets the value of the groupCashSuspense property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGroupCashSuspense(String value) {
        this.groupCashSuspense = value;
    }

    /**
     * Gets the value of the groupCashTxnDetailData property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCashTxnDetailData property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupCashTxnDetailData().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupCashTransactionDetailData }
     *
     *
     */
    public List<GroupCashTransactionDetailData> getGroupCashTxnDetailData() {
        if (groupCashTxnDetailData == null) {
            groupCashTxnDetailData = new ArrayList<GroupCashTransactionDetailData>();
        }
        return this.groupCashTxnDetailData;
    }

    /**
     * Gets the value of the groupCashTxnId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getGroupCashTxnId() {
        return groupCashTxnId;
    }

    /**
     * Sets the value of the groupCashTxnId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setGroupCashTxnId(Long value) {
        this.groupCashTxnId = value;
    }

    /**
     * Gets the value of the groupCustomerName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGroupCustomerName() {
        return groupCustomerName;
    }

    /**
     * Sets the value of the groupCustomerName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGroupCustomerName(String value) {
        this.groupCustomerName = value;
    }

    /**
     * Gets the value of the groupCustomerNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGroupCustomerNo() {
        return groupCustomerNo;
    }

    /**
     * Sets the value of the groupCustomerNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGroupCustomerNo(String value) {
        this.groupCustomerNo = value;
    }

    /**
     * Gets the value of the groupItemHasErrors property.
     *
     */
    public boolean isGroupItemHasErrors() {
        return groupItemHasErrors;
    }

    /**
     * Sets the value of the groupItemHasErrors property.
     *
     */
    public void setGroupItemHasErrors(boolean value) {
        this.groupItemHasErrors = value;
    }

    /**
     * Gets the value of the narrative property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNarrative() {
        return narrative;
    }

    /**
     * Sets the value of the narrative property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNarrative(String value) {
        this.narrative = value;
    }

    /**
     * Gets the value of the poolAccountNo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPoolAccountNo() {
        return poolAccountNo;
    }

    /**
     * Sets the value of the poolAccountNo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPoolAccountNo(String value) {
        this.poolAccountNo = value;
    }

    /**
     * Gets the value of the reference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReference(String value) {
        this.reference = value;
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
     * Gets the value of the totalAmt property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

    /**
     * Gets the value of the txnCategory property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTxnCategory() {
        return txnCategory;
    }

    /**
     * Sets the value of the txnCategory property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTxnCategory(String value) {
        this.txnCategory = value;
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

}
