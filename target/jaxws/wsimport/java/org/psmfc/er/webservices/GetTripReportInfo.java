
package org.psmfc.er.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTripReportInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTripReportInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pswd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getTripReportInfo", propOrder = {
    "uid",
    "pswd",
    "ver",
    "opId",
    "yr",
    "iersMonitorArray"
})
public class GetTripReportInfo {

    protected String uid;
    protected String pswd;
    protected String ver;
    protected String opId;
    protected String yr;
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
     * Gets the value of the yr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYr() {
        return yr;
    }

    /**
     * Sets the value of the yr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYr(String value) {
        this.yr = value;
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
