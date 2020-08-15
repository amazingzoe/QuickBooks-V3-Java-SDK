//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.15 at 03:58:30 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColumnTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ColumnTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Account"/&gt;
 *     &lt;enumeration value="Money"/&gt;
 *     &lt;enumeration value="Rate"/&gt;
 *     &lt;enumeration value="Customer"/&gt;
 *     &lt;enumeration value="Vendor"/&gt;
 *     &lt;enumeration value="Employee"/&gt;
 *     &lt;enumeration value="ProductsAndService"/&gt;
 *     &lt;enumeration value="Department"/&gt;
 *     &lt;enumeration value="Class"/&gt;
 *     &lt;enumeration value="String"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ColumnTypeEnum")
@XmlEnum
public enum ColumnTypeEnum {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Money")
    MONEY("Money"),
    @XmlEnumValue("Rate")
    RATE("Rate"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),
    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("ProductsAndService")
    PRODUCTS_AND_SERVICE("ProductsAndService"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("Class")
    CLASS("Class"),
    @XmlEnumValue("String")
    STRING("String");
    private final String value;

    ColumnTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColumnTypeEnum fromValue(String v) {
        for (ColumnTypeEnum c: ColumnTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
