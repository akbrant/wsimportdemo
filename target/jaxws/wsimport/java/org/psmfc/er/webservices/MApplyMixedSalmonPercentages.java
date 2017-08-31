
package org.psmfc.er.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mApplyMixedSalmonPercentages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mApplyMixedSalmonPercentages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pswd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chumPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cohoPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinkPercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sockeyeAverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chumAverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cohoAverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinkAverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="landingReports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repringTickets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tenderBatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkWarnings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iersMonitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mApplyMixedSalmonPercentages", propOrder = {
    "uid",
    "pswd",
    "ver",
    "chumPercent",
    "cohoPercent",
    "pinkPercent",
    "sockeyeAverage",
    "chumAverage",
    "cohoAverage",
    "pinkAverage",
    "landingReports",
    "repringTickets",
    "opId",
    "fromDate",
    "toDate",
    "tenderBatch",
    "checkWarnings",
    "iersMonitor"
})
public class MApplyMixedSalmonPercentages {

    protected String uid;
    protected String pswd;
    protected String ver;
    protected String chumPercent;
    protected String cohoPercent;
    protected String pinkPercent;
    protected String sockeyeAverage;
    protected String chumAverage;
    protected String cohoAverage;
    protected String pinkAverage;
    protected String landingReports;
    protected String repringTickets;
    protected String opId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    protected String tenderBatch;
    protected String checkWarnings;
    protected String iersMonitor;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the pswd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPswd() {
        return pswd;
    }

    /**
     * Sets the value of the pswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPswd(String value) {
        this.pswd = value;
    }

    /**
     * Gets the value of the ver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer() {
        return ver;
    }

    /**
     * Sets the value of the ver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer(String value) {
        this.ver = value;
    }

    /**
     * Gets the value of the chumPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChumPercent() {
        return chumPercent;
    }

    /**
     * Sets the value of the chumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChumPercent(String value) {
        this.chumPercent = value;
    }

    /**
     * Gets the value of the cohoPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCohoPercent() {
        return cohoPercent;
    }

    /**
     * Sets the value of the cohoPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCohoPercent(String value) {
        this.cohoPercent = value;
    }

    /**
     * Gets the value of the pinkPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinkPercent() {
        return pinkPercent;
    }

    /**
     * Sets the value of the pinkPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinkPercent(String value) {
        this.pinkPercent = value;
    }

    /**
     * Gets the value of the sockeyeAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSockeyeAverage() {
        return sockeyeAverage;
    }

    /**
     * Sets the value of the sockeyeAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSockeyeAverage(String value) {
        this.sockeyeAverage = value;
    }

    /**
     * Gets the value of the chumAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChumAverage() {
        return chumAverage;
    }

    /**
     * Sets the value of the chumAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChumAverage(String value) {
        this.chumAverage = value;
    }

    /**
     * Gets the value of the cohoAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCohoAverage() {
        return cohoAverage;
    }

    /**
     * Sets the value of the cohoAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCohoAverage(String value) {
        this.cohoAverage = value;
    }

    /**
     * Gets the value of the pinkAverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinkAverage() {
        return pinkAverage;
    }

    /**
     * Sets the value of the pinkAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinkAverage(String value) {
        this.pinkAverage = value;
    }

    /**
     * Gets the value of the landingReports property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandingReports() {
        return landingReports;
    }

    /**
     * Sets the value of the landingReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandingReports(String value) {
        this.landingReports = value;
    }

    /**
     * Gets the value of the repringTickets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepringTickets() {
        return repringTickets;
    }

    /**
     * Sets the value of the repringTickets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepringTickets(String value) {
        this.repringTickets = value;
    }

    /**
     * Gets the value of the opId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpId() {
        return opId;
    }

    /**
     * Sets the value of the opId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpId(String value) {
        this.opId = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the tenderBatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderBatch() {
        return tenderBatch;
    }

    /**
     * Sets the value of the tenderBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderBatch(String value) {
        this.tenderBatch = value;
    }

    /**
     * Gets the value of the checkWarnings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckWarnings() {
        return checkWarnings;
    }

    /**
     * Sets the value of the checkWarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckWarnings(String value) {
        this.checkWarnings = value;
    }

    /**
     * Gets the value of the iersMonitor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIersMonitor() {
        return iersMonitor;
    }

    /**
     * Sets the value of the iersMonitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIersMonitor(String value) {
        this.iersMonitor = value;
    }

}
