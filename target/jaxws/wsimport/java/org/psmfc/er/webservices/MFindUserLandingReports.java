
package org.psmfc.er.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mFindUserLandingReports complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mFindUserLandingReports">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pswd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fTkt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fedProc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regBuyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adfg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cFishery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cPermit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmfsPerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeSummaries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenderBatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tInvoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastUpdateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="operationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "mFindUserLandingReports", propOrder = {
    "uid",
    "pswd",
    "ver",
    "fTkt",
    "pCode",
    "fedProc",
    "regBuyer",
    "rcr",
    "adfg",
    "rType",
    "port",
    "cFishery",
    "cPermit",
    "gear",
    "nmfsPerId",
    "ifq",
    "status",
    "from",
    "to",
    "tender",
    "includeSummaries",
    "tenderBatch",
    "tInvoice",
    "lastUpdateFrom",
    "lastUpdateTo",
    "operationId",
    "iersMonitor"
})
public class MFindUserLandingReports {

    protected String uid;
    protected String pswd;
    protected String ver;
    protected String fTkt;
    protected String pCode;
    protected String fedProc;
    protected String regBuyer;
    protected String rcr;
    protected String adfg;
    protected String rType;
    protected String port;
    protected String cFishery;
    protected String cPermit;
    protected String gear;
    protected String nmfsPerId;
    protected String ifq;
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar from;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar to;
    protected String tender;
    protected String includeSummaries;
    protected String tenderBatch;
    protected String tInvoice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdateTo;
    protected String operationId;
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
     * Gets the value of the fTkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTkt() {
        return fTkt;
    }

    /**
     * Sets the value of the fTkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTkt(String value) {
        this.fTkt = value;
    }

    /**
     * Gets the value of the pCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCode() {
        return pCode;
    }

    /**
     * Sets the value of the pCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCode(String value) {
        this.pCode = value;
    }

    /**
     * Gets the value of the fedProc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFedProc() {
        return fedProc;
    }

    /**
     * Sets the value of the fedProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFedProc(String value) {
        this.fedProc = value;
    }

    /**
     * Gets the value of the regBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegBuyer() {
        return regBuyer;
    }

    /**
     * Sets the value of the regBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegBuyer(String value) {
        this.regBuyer = value;
    }

    /**
     * Gets the value of the rcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcr() {
        return rcr;
    }

    /**
     * Sets the value of the rcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcr(String value) {
        this.rcr = value;
    }

    /**
     * Gets the value of the adfg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdfg() {
        return adfg;
    }

    /**
     * Sets the value of the adfg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdfg(String value) {
        this.adfg = value;
    }

    /**
     * Gets the value of the rType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRType() {
        return rType;
    }

    /**
     * Sets the value of the rType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRType(String value) {
        this.rType = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the cFishery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFishery() {
        return cFishery;
    }

    /**
     * Sets the value of the cFishery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFishery(String value) {
        this.cFishery = value;
    }

    /**
     * Gets the value of the cPermit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPermit() {
        return cPermit;
    }

    /**
     * Sets the value of the cPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPermit(String value) {
        this.cPermit = value;
    }

    /**
     * Gets the value of the gear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGear() {
        return gear;
    }

    /**
     * Sets the value of the gear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGear(String value) {
        this.gear = value;
    }

    /**
     * Gets the value of the nmfsPerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmfsPerId() {
        return nmfsPerId;
    }

    /**
     * Sets the value of the nmfsPerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmfsPerId(String value) {
        this.nmfsPerId = value;
    }

    /**
     * Gets the value of the ifq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfq() {
        return ifq;
    }

    /**
     * Sets the value of the ifq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfq(String value) {
        this.ifq = value;
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
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrom(XMLGregorianCalendar value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTo(XMLGregorianCalendar value) {
        this.to = value;
    }

    /**
     * Gets the value of the tender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTender() {
        return tender;
    }

    /**
     * Sets the value of the tender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTender(String value) {
        this.tender = value;
    }

    /**
     * Gets the value of the includeSummaries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeSummaries() {
        return includeSummaries;
    }

    /**
     * Sets the value of the includeSummaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeSummaries(String value) {
        this.includeSummaries = value;
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
     * Gets the value of the tInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTInvoice() {
        return tInvoice;
    }

    /**
     * Sets the value of the tInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTInvoice(String value) {
        this.tInvoice = value;
    }

    /**
     * Gets the value of the lastUpdateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateFrom() {
        return lastUpdateFrom;
    }

    /**
     * Sets the value of the lastUpdateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateFrom(XMLGregorianCalendar value) {
        this.lastUpdateFrom = value;
    }

    /**
     * Gets the value of the lastUpdateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateTo() {
        return lastUpdateTo;
    }

    /**
     * Sets the value of the lastUpdateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateTo(XMLGregorianCalendar value) {
        this.lastUpdateTo = value;
    }

    /**
     * Gets the value of the operationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * Sets the value of the operationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationId(String value) {
        this.operationId = value;
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
