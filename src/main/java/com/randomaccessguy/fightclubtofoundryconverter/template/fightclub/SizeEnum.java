//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.randomaccessguy.fightclubtofoundryconverter.template.fightclub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sizeEnum</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="sizeEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="T"/>
 *     <enumeration value="S"/>
 *     <enumeration value="M"/>
 *     <enumeration value="L"/>
 *     <enumeration value="H"/>
 *     <enumeration value="G"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "sizeEnum")
@XmlEnum
public enum SizeEnum {

    T,
    S,
    M,
    L,
    H,
    G;

    public String value() {
        return name();
    }

    public static SizeEnum fromValue(String v) {
        return valueOf(v);
    }

}
