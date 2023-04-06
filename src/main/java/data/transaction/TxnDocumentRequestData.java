//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.06 at 04:32:59 PM WAT
//


package data.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txnDocumentRequestData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="txnDocumentRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.ws.supernova.neptunesoftware.com/}XAPIRequestBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documents" type="{http://data.txnprocess.server.ws.supernova.neptunesoftware.com/}txnDocumentData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txnDocumentRequestData", namespace = "http://data.txnprocess.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "documents"
})
public class TxnDocumentRequestData
    extends XAPIRequestBaseObject
{

    @XmlElement(nillable = true)
    protected List<TxnDocumentData> documents;

    /**
     * Gets the value of the documents property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documents property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocuments().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxnDocumentData }
     *
     *
     */
    public List<TxnDocumentData> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<TxnDocumentData>();
        }
        return this.documents;
    }

}
