//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2023.04.05 at 09:49:06 AM WAT
//


package data.account;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WFViewRequestData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="WFViewRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://common.ws.supernova.neptunesoftware.com/}XAPIRequestBaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="recipientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="workItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WFViewRequestData", namespace = "http://data.workflow.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "eventId",
    "itemId",
    "recipientId",
    "workItemId"
})
public class WFViewRequestData
    extends XAPIRequestBaseObject
{

    protected Long eventId;
    protected Long itemId;
    protected Long recipientId;
    protected Long workItemId;

    /**
     * Gets the value of the eventId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setEventId(Long value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the itemId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the recipientId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getRecipientId() {
        return recipientId;
    }

    /**
     * Sets the value of the recipientId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setRecipientId(Long value) {
        this.recipientId = value;
    }

    /**
     * Gets the value of the workItemId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getWorkItemId() {
        return workItemId;
    }

    /**
     * Sets the value of the workItemId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setWorkItemId(Long value) {
        this.workItemId = value;
    }

}
