//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 04:32:59 PM WAT
//


package data.transaction;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditCardRepaymentRequestData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="creditCardRepaymentRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://data.txnprocess.server.ws.supernova.neptunesoftware.com/}XAPIBaseTxnRequestData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardIssuerCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardIssuerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCardRepaymentRequestData", namespace = "http://data.txnprocess.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "cardIssuerCd",
    "cardIssuerId"
})
public class CreditCardRepaymentRequestData
    extends XAPIBaseTxnRequestData
{

    protected String cardIssuerCd;
    protected Long cardIssuerId;

    /**
     * Gets the value of the cardIssuerCd property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCardIssuerCd() {
        return cardIssuerCd;
    }

    /**
     * Sets the value of the cardIssuerCd property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCardIssuerCd(String value) {
        this.cardIssuerCd = value;
    }

    /**
     * Gets the value of the cardIssuerId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCardIssuerId() {
        return cardIssuerId;
    }

    /**
     * Sets the value of the cardIssuerId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCardIssuerId(Long value) {
        this.cardIssuerId = value;
    }

}
