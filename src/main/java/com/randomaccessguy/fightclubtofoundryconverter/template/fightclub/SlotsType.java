//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.randomaccessguy.fightclubtofoundryconverter.template.fightclub;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for slotsType complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="slotsType">
 *   <simpleContent>
 *     <extension base="<>integerList">
 *       <attribute name="optional" type="{}boolean" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "slotsType", propOrder = {
        "value"
})
public class SlotsType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "optional")
    protected String optional;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the optional property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOptional(String value) {
        this.optional = value;
    }

}
