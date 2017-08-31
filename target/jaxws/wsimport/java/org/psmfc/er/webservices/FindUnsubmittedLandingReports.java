
package org.psmfc.er.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for findUnsubmittedLandingReports complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findUnsubmittedLandingReports">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pswd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fedProc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regBuyer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rcr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adfg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fromLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="opId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "findUnsubmittedLandingReports", propOrder = {
    "uid",
    "pswd",
    "ver",
    "rType",
    "pCode",
    "fedProc",
    "regBuyer",
    "rcr",
    "adfg",
    "from",
    "to",
    "fromLastUpdateDate",
    "toLastUpdateDate",
    "opId",
    "iersMonitor"
})
public class FindUnsubmittedLandingReports {

    protected String uid;
    protected String pswd;
    protected String ver;
    protected String rType;
    protected String pCode;
    protected String fedProc;
    protected String regBuyer;
    protected String rcr;
    protected String adfg;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar from;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar to;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromLastUpdateDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toLastUpdateDate;
    protected String opId;
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
