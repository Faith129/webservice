//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.05 at 09:49:06 AM WAT
//


package data.account;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for submitDepositAccountApplicationResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="submitDepositAccountApplicationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://data.account.server.ws.supernova.neptunesoftware.com/}depositAcctApplicationOutputData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "submitDepositAccountApplicationResponse", propOrder = {
    "_return"
})
public class SubmitDepositAccountApplicationResponse {

    @XmlElement(name = "return")
    protected DepositAcctApplicationOutputData _return;

    /**
     * Gets the value of the return property.
     *
     * @return
     *     possible object is
     *     {@link DepositAcctApplicationOutputData }
     *
     */
    public DepositAcctApplicationOutputData getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value
     *     allowed object is
     *     {@link DepositAcctApplicationOutputData }
     *
     */
    public void setReturn(DepositAcctApplicationOutputData value) {
        this._return = value;
    }

}
