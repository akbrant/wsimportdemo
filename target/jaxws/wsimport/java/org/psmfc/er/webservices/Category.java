
package org.psmfc.er.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for category complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="category">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additivity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="level" type="{http://webservices.er.psmfc.org/}level" minOccurs="0"/>
 *         &lt;element name="resourceBundle" type="{http://webservices.er.psmfc.org/}resourceBundle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "category", propOrder = {
    "additivity",
    "level",
    "resourceBundle"
})
@XmlSeeAlso({
    Logger.class
})
public class Category {

    protected boolean additivity;
    protected Level level;
    protected ResourceBundle resourceBundle;

    /**
     * Gets the value of the additivity property.
     * 
     */
    public boolean isAdditivity() {
        return additivity;
    }

    /**
     * Sets the value of the additivity property.
     * 
     */
    public void setAdditivity(boolean value) {
        this.additivity = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Level }
     *     
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Level }
     *     
     */
    public void setLevel(Level value) {
        this.level = value;
    }

    /**
     * Gets the value of the resourceBundle property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceBundle }
     *     
     */
    public ResourceBundle getResourceBundle() {
        return resourceBundle;
    }

    /**
     * Sets the value of the resourceBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceBundle }
     *     
     */
    public void setResourceBundle(ResourceBundle value) {
        this.resourceBundle = value;
    }

}
