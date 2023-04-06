
package data.account;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for balanceEnquiryRequestData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="balanceEnquiryRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authorizationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationInstitutionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetBankVerificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balanceEnquiryRequestData", namespace = "http://data.account.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "authorizationCode",
    "channelCode",
    "destinationInstitutionCode",
    "sessionId",
    "targetAccountName",
    "targetAccountNumber",
    "targetBankVerificationNumber"
})
public class BalanceEnquiryRequestData {

    protected String authorizationCode;
    protected String channelCode;
    protected String destinationInstitutionCode;
    protected String sessionId;
    protected String targetAccountName;
    protected String targetAccountNumber;
    protected String targetBankVerificationNumber;

    /**
     * Gets the value of the authorizationCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    /**
     * Sets the value of the authorizationCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuthorizationCode(String value) {
        this.authorizationCode = value;
    }

    /**
     * Gets the value of the channelCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Gets the value of the destinationInstitutionCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDestinationInstitutionCode() {
        return destinationInstitutionCode;
    }

    /**
     * Sets the value of the destinationInstitutionCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDestinationInstitutionCode(String value) {
        this.destinationInstitutionCode = value;
    }

    /**
     * Gets the value of the sessionId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the targetAccountName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTargetAccountName() {
        return targetAccountName;
    }

    /**
     * Sets the value of the targetAccountName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTargetAccountName(String value) {
        this.targetAccountName = value;
    }

    /**
     * Gets the value of the targetAccountNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTargetAccountNumber() {
        return targetAccountNumber;
    }

    /**
     * Sets the value of the targetAccountNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTargetAccountNumber(String value) {
        this.targetAccountNumber = value;
    }

    /**
     * Gets the value of the targetBankVerificationNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTargetBankVerificationNumber() {
        return targetBankVerificationNumber;
    }

    /**
     * Sets the value of the targetBankVerificationNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTargetBankVerificationNumber(String value) {
        this.targetBankVerificationNumber = value;
    }

}
