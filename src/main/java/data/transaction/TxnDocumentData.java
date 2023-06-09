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
 * <p>Java class for txnDocumentData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="txnDocumentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="backImageBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="backImageFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="backImageStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="backPgImgPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="backPgImgSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="docTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="fileExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frontImageBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="frontImageFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frontImageStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frontPgImgPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frontPgImgSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="imageSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trackingNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="txnTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txnDocumentData", namespace = "http://data.txnprocess.server.ws.supernova.neptunesoftware.com/", propOrder = {
    "backImageBytes",
    "backImageFilePath",
    "backImageStr",
    "backPgImgPrefix",
    "backPgImgSize",
    "countryId",
    "docTypeId",
    "fileExtension",
    "frontImageBytes",
    "frontImageFilePath",
    "frontImageStr",
    "frontPgImgPrefix",
    "frontPgImgSize",
    "imageSource",
    "trackingNumber",
    "txnTypeId"
})
public class TxnDocumentData {

    protected byte[] backImageBytes;
    protected String backImageFilePath;
    protected String backImageStr;
    protected String backPgImgPrefix;
    protected Long backPgImgSize;
    protected Long countryId;
    protected Long docTypeId;
    protected String fileExtension;
    protected byte[] frontImageBytes;
    protected String frontImageFilePath;
    protected String frontImageStr;
    protected String frontPgImgPrefix;
    protected Long frontPgImgSize;
    protected String imageSource;
    protected Long trackingNumber;
    protected Long txnTypeId;

    /**
     * Gets the value of the backImageBytes property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBackImageBytes() {
        return backImageBytes;
    }

    /**
     * Sets the value of the backImageBytes property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBackImageBytes(byte[] value) {
        this.backImageBytes = value;
    }

    /**
     * Gets the value of the backImageFilePath property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBackImageFilePath() {
        return backImageFilePath;
    }

    /**
     * Sets the value of the backImageFilePath property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBackImageFilePath(String value) {
        this.backImageFilePath = value;
    }

    /**
     * Gets the value of the backImageStr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBackImageStr() {
        return backImageStr;
    }

    /**
     * Sets the value of the backImageStr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBackImageStr(String value) {
        this.backImageStr = value;
    }

    /**
     * Gets the value of the backPgImgPrefix property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBackPgImgPrefix() {
        return backPgImgPrefix;
    }

    /**
     * Sets the value of the backPgImgPrefix property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBackPgImgPrefix(String value) {
        this.backPgImgPrefix = value;
    }

    /**
     * Gets the value of the backPgImgSize property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getBackPgImgSize() {
        return backPgImgSize;
    }

    /**
     * Sets the value of the backPgImgSize property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setBackPgImgSize(Long value) {
        this.backPgImgSize = value;
    }

    /**
     * Gets the value of the countryId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCountryId(Long value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the docTypeId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getDocTypeId() {
        return docTypeId;
    }

    /**
     * Sets the value of the docTypeId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setDocTypeId(Long value) {
        this.docTypeId = value;
    }

    /**
     * Gets the value of the fileExtension property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * Sets the value of the fileExtension property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFileExtension(String value) {
        this.fileExtension = value;
    }

    /**
     * Gets the value of the frontImageBytes property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFrontImageBytes() {
        return frontImageBytes;
    }

    /**
     * Sets the value of the frontImageBytes property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFrontImageBytes(byte[] value) {
        this.frontImageBytes = value;
    }

    /**
     * Gets the value of the frontImageFilePath property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFrontImageFilePath() {
        return frontImageFilePath;
    }

    /**
     * Sets the value of the frontImageFilePath property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFrontImageFilePath(String value) {
        this.frontImageFilePath = value;
    }

    /**
     * Gets the value of the frontImageStr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFrontImageStr() {
        return frontImageStr;
    }

    /**
     * Sets the value of the frontImageStr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFrontImageStr(String value) {
        this.frontImageStr = value;
    }

    /**
     * Gets the value of the frontPgImgPrefix property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFrontPgImgPrefix() {
        return frontPgImgPrefix;
    }

    /**
     * Sets the value of the frontPgImgPrefix property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFrontPgImgPrefix(String value) {
        this.frontPgImgPrefix = value;
    }

    /**
     * Gets the value of the frontPgImgSize property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getFrontPgImgSize() {
        return frontPgImgSize;
    }

    /**
     * Sets the value of the frontPgImgSize property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setFrontPgImgSize(Long value) {
        this.frontPgImgSize = value;
    }

    /**
     * Gets the value of the imageSource property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImageSource() {
        return imageSource;
    }

    /**
     * Sets the value of the imageSource property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImageSource(String value) {
        this.imageSource = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTrackingNumber(Long value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the txnTypeId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getTxnTypeId() {
        return txnTypeId;
    }

    /**
     * Sets the value of the txnTypeId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTxnTypeId(Long value) {
        this.txnTypeId = value;
    }

}
