
package org.psmfc.er.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for findLandingReports complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findLandingReports">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pswd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fTkt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fedProc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regBuyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adfg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cFishery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cPermit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cYearSeq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mPgm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mPgmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmfsPerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorUpdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="speciesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tenderVesselNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenderBatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tripNumberStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iersMonitorArray" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findLandingReports", propOrder = {
    "uid",
    "pswd",
    "ver",
    "rptId",
    "rType",
    "fTkt",
    "pCode",
    "fedProc",
    "regBuyer",
    "rcr",
    "adfg",
    "port",
    "cFishery",
    "cPermit",
    "cYearSeq",
    "mPgm",
    "mPgmId",
    "gear",
    "nmfsPerId",
    "ifq",
    "status",
    "processorUpdated",
    "from",
    "to",
    "speciesCode",
    "fromLastUpdateDate",
    "toLastUpdateDate",
    "tenderVesselNumber",
    "tenderBatch",
    "tripNumberStatus",
    "opId",
    "iersMonitorArray"
})
public class FindLandingReports {

    protected String uid;
    protected String pswd;
    protected String ver;
    protected String rptId;
    protected String rType;
    protected String fTkt;
    protected String pCode;
    protected String fedProc;
    protected String regBuyer;
    protected String rcr;
    protected String adfg;
    protected String port;
    protected String cFishery;
    protected String cPermit;
    protected String cYearSeq;
    protected String mPgm;
    protected String mPgmId;
    protected String gear;
    protected String nmfsPerId;
    protected String ifq;
    protected String status;
    protected String processorUpdated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar from;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar to;
    protected String speciesCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromLastUpdateDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toLastUpdateDate;
    protected String tenderVesselNumber;
    protected String tenderBatch;
    protected String tripNumberStatus;
    protected String opId;
    protected String iersMonitorArray;

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
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptId(String value) {
        this.rptId = value;
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
     * Gets the value of the cYearSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCYearSeq() {
        return cYearSeq;
    }

    /**
     * Sets the value of the cYearSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCYearSeq(String value) {
        this.cYearSeq = value;
    }

    /**
     * Gets the value of the mPgm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPgm() {
        return mPgm;
    }

    /**
     * Sets the value of the mPgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPgm(String value) {
        this.mPgm = value;
    }

    /**
     * Gets the value of the mPgmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPgmId() {
        return mPgmId;
    }

    /**
     * Sets the value of the mPgmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPgmId(String value) {
        this.mPgmId = value;
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
     * Gets the value of the processorUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorUpdated() {
        return processorUpdated;
    }

    /**
     * Sets the value of the processorUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorUpdated(String value) {
        this.processorUpdated = value;
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
     * Gets the value of the speciesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeciesCode() {
        return speciesCode;
    }

    /**
     * Sets the value of the speciesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeciesCode(String value) {
        this.speciesCode = value;
    }

    /**
     * Gets the value of the fromLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromLastUpdateDate() {
        return fromLastUpdateDate;
    }

    /**
     * Sets the value of the fromLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromLastUpdateDate(XMLGregorianCalendar value) {
        this.fromLastUpdateDate = value;
    }

    /**
     * Gets the value of the toLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToLastUpdateDate() {
        return toLastUpdateDate;
    }

    /**
     * Sets the value of the toLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToLastUpdateDate(XMLGregorianCalendar value) {
        this.toLastUpdateDate = value;
    }

    /**
     * Gets the value of the tenderVesselNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderVesselNumber() {
        return tenderVesselNumber;
    }

    /**
     * Sets the value of the tenderVesselNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderVesselNumber(String value) {
        this.tenderVesselNumber = value;
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
     * Gets the value of the tripNumberStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripNumberStatus() {
        return tripNumberStatus;
    }

    /**
     * Sets the value of the tripNumberStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripNumberStatus(String value) {
        this.tripNumberStatus = value;
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
     * Gets the value of the iersMonitorArray property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIersMonitorArray() {
        return iersMonitorArray;
    }

    /**
     * Sets the value of the iersMonitorArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIersMonitorArray(String value) {
        this.iersMonitorArray = value;
    }

}
