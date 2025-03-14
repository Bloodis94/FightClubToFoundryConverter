//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.randomaccessguy.fightclubtofoundryconverter.template.fightclub;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for raceType complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="raceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded">
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="size" type="{}sizeEnum"/>
 *         <element name="speed" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="ability" type="{}abilityBonusList"/>
 *         <element name="spellAbility" type="{}abilityEnum"/>
 *         <element name="proficiency" type="{}skillList"/>
 *         <element name="trait" type="{}traitType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="modifier" type="{}modifierType" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "raceType", propOrder = {
        "nameOrSizeOrSpeed"
})
public class RaceType {

    @XmlElementRefs({
            @XmlElementRef(name = "name", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "size", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "speed", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ability", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "spellAbility", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "proficiency", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "trait", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "modifier", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> nameOrSizeOrSpeed;

    /**
     * Gets the value of the nameOrSizeOrSpeed property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameOrSizeOrSpeed property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNameOrSizeOrSpeed().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ModifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link SizeEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link TraitType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * </p>
     *
     * @return The value of the nameOrSizeOrSpeed property.
     */
    public List<JAXBElement<?>> getNameOrSizeOrSpeed() {
        if (nameOrSizeOrSpeed == null) {
            nameOrSizeOrSpeed = new ArrayList<>();
        }
        return this.nameOrSizeOrSpeed;
    }

}
