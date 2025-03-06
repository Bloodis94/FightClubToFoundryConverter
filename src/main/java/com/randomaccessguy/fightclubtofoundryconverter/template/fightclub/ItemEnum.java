//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.randomaccessguy.fightclubtofoundryconverter.template.fightclub;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemEnum</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="itemEnum">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LA"/>
 *     <enumeration value="MA"/>
 *     <enumeration value="HA"/>
 *     <enumeration value="S"/>
 *     <enumeration value="M"/>
 *     <enumeration value="R"/>
 *     <enumeration value="A"/>
 *     <enumeration value="RD"/>
 *     <enumeration value="ST"/>
 *     <enumeration value="WD"/>
 *     <enumeration value="RG"/>
 *     <enumeration value="P"/>
 *     <enumeration value="SC"/>
 *     <enumeration value="W"/>
 *     <enumeration value="G"/>
 *     <enumeration value="$"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "itemEnum")
@XmlEnum
public enum ItemEnum {

    LA,
    MA,
    HA,
    S,
    M,
    R,
    A,
    RD,
    ST,
    WD,
    RG,
    P,
    SC,
    W,
    G,
    $;

    public String value() {
        return name();
    }

    public static ItemEnum fromValue(String v) {
        return valueOf(v);
    }

}
