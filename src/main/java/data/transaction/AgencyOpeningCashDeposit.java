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
 * <p>Java class for agencyOpeningCashDeposit complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="agencyOpeningCashDeposit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://data.txnprocess.server.ws.supernova.neptunesoftware.com/}txnProcessRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agencyOpeningCashDeposit", propOrder = {
    "arg0"
})
public class AgencyOpeningCashDeposit {

    protected TxnProcessRequestData arg0;

    /**
     * Gets the value of the arg0 property.
     *
     * @return
     *     possible object is
     *     {@link TxnProcessRequestData }
     *
     */
    public TxnProcessRequestData getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     *
     * @param value
     *     allowed object is
     *     {@link TxnProcessRequestData }
     *
     */
    public void setArg0(TxnProcessRequestData value) {
        this.arg0 = value;
    }

}
