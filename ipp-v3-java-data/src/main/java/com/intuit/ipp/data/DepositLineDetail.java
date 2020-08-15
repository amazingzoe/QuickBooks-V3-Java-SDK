//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.15 at 03:58:30 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: Deposit detail for a
 * 				transaction line.
 * 			
 * 
 * <p>Java class for DepositLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositLineDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Entity" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ClassRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="AccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethodRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="CheckNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TxnType" type="{http://schema.intuit.com/finance/v3}TxnTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="TaxCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TaxApplicableOn" type="{http://schema.intuit.com/finance/v3}TaxApplicableOnEnum" minOccurs="0"/&gt;
 *         &lt;element name="DepositLineDetailEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositLineDetail", propOrder = {
    "entity",
    "classRef",
    "accountRef",
    "paymentMethodRef",
    "checkNum",
    "txnType",
    "taxCodeRef",
    "taxApplicableOn",
    "depositLineDetailEx"
})
public class DepositLineDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Entity")
    protected ReferenceType entity;
    @XmlElement(name = "ClassRef")
    protected ReferenceType classRef;
    @XmlElement(name = "AccountRef")
    protected ReferenceType accountRef;
    @XmlElement(name = "PaymentMethodRef")
    protected ReferenceType paymentMethodRef;
    @XmlElement(name = "CheckNum")
    protected String checkNum;
    @XmlElement(name = "TxnType")
    @XmlSchemaType(name = "string")
    protected TxnTypeEnum txnType;
    @XmlElement(name = "TaxCodeRef")
    protected ReferenceType taxCodeRef;
    @XmlElement(name = "TaxApplicableOn")
    @XmlSchemaType(name = "string")
    protected TaxApplicableOnEnum taxApplicableOn;
    @XmlElement(name = "DepositLineDetailEx")
    protected IntuitAnyType depositLineDetailEx;

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setEntity(ReferenceType value) {
        this.entity = value;
    }

    /**
     * Gets the value of the classRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getClassRef() {
        return classRef;
    }

    /**
     * Sets the value of the classRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setClassRef(ReferenceType value) {
        this.classRef = value;
    }

    /**
     * Gets the value of the accountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAccountRef() {
        return accountRef;
    }

    /**
     * Sets the value of the accountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAccountRef(ReferenceType value) {
        this.accountRef = value;
    }

    /**
     * Gets the value of the paymentMethodRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getPaymentMethodRef() {
        return paymentMethodRef;
    }

    /**
     * Sets the value of the paymentMethodRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setPaymentMethodRef(ReferenceType value) {
        this.paymentMethodRef = value;
    }

    /**
     * Gets the value of the checkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNum() {
        return checkNum;
    }

    /**
     * Sets the value of the checkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNum(String value) {
        this.checkNum = value;
    }

    /**
     * Gets the value of the txnType property.
     * 
     * @return
     *     possible object is
     *     {@link TxnTypeEnum }
     *     
     */
    public TxnTypeEnum getTxnType() {
        return txnType;
    }

    /**
     * Sets the value of the txnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnTypeEnum }
     *     
     */
    public void setTxnType(TxnTypeEnum value) {
        this.txnType = value;
    }

    /**
     * Gets the value of the taxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    /**
     * Sets the value of the taxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTaxCodeRef(ReferenceType value) {
        this.taxCodeRef = value;
    }

    /**
     * Gets the value of the taxApplicableOn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxApplicableOnEnum }
     *     
     */
    public TaxApplicableOnEnum getTaxApplicableOn() {
        return taxApplicableOn;
    }

    /**
     * Sets the value of the taxApplicableOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxApplicableOnEnum }
     *     
     */
    public void setTaxApplicableOn(TaxApplicableOnEnum value) {
        this.taxApplicableOn = value;
    }

    /**
     * Gets the value of the depositLineDetailEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getDepositLineDetailEx() {
        return depositLineDetailEx;
    }

    /**
     * Sets the value of the depositLineDetailEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setDepositLineDetailEx(IntuitAnyType value) {
        this.depositLineDetailEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DepositLineDetail that = ((DepositLineDetail) object);
        {
            ReferenceType lhsEntity;
            lhsEntity = this.getEntity();
            ReferenceType rhsEntity;
            rhsEntity = that.getEntity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "entity", lhsEntity), LocatorUtils.property(thatLocator, "entity", rhsEntity), lhsEntity, rhsEntity, (this.entity!= null), (that.entity!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsClassRef;
            lhsClassRef = this.getClassRef();
            ReferenceType rhsClassRef;
            rhsClassRef = that.getClassRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "classRef", lhsClassRef), LocatorUtils.property(thatLocator, "classRef", rhsClassRef), lhsClassRef, rhsClassRef, (this.classRef!= null), (that.classRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsAccountRef;
            lhsAccountRef = this.getAccountRef();
            ReferenceType rhsAccountRef;
            rhsAccountRef = that.getAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accountRef", lhsAccountRef), LocatorUtils.property(thatLocator, "accountRef", rhsAccountRef), lhsAccountRef, rhsAccountRef, (this.accountRef!= null), (that.accountRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsPaymentMethodRef;
            lhsPaymentMethodRef = this.getPaymentMethodRef();
            ReferenceType rhsPaymentMethodRef;
            rhsPaymentMethodRef = that.getPaymentMethodRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentMethodRef", lhsPaymentMethodRef), LocatorUtils.property(thatLocator, "paymentMethodRef", rhsPaymentMethodRef), lhsPaymentMethodRef, rhsPaymentMethodRef, (this.paymentMethodRef!= null), (that.paymentMethodRef!= null))) {
                return false;
            }
        }
        {
            String lhsCheckNum;
            lhsCheckNum = this.getCheckNum();
            String rhsCheckNum;
            rhsCheckNum = that.getCheckNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "checkNum", lhsCheckNum), LocatorUtils.property(thatLocator, "checkNum", rhsCheckNum), lhsCheckNum, rhsCheckNum, (this.checkNum!= null), (that.checkNum!= null))) {
                return false;
            }
        }
        {
            TxnTypeEnum lhsTxnType;
            lhsTxnType = this.getTxnType();
            TxnTypeEnum rhsTxnType;
            rhsTxnType = that.getTxnType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnType", lhsTxnType), LocatorUtils.property(thatLocator, "txnType", rhsTxnType), lhsTxnType, rhsTxnType, (this.txnType!= null), (that.txnType!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsTaxCodeRef;
            lhsTaxCodeRef = this.getTaxCodeRef();
            ReferenceType rhsTaxCodeRef;
            rhsTaxCodeRef = that.getTaxCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxCodeRef", lhsTaxCodeRef), LocatorUtils.property(thatLocator, "taxCodeRef", rhsTaxCodeRef), lhsTaxCodeRef, rhsTaxCodeRef, (this.taxCodeRef!= null), (that.taxCodeRef!= null))) {
                return false;
            }
        }
        {
            TaxApplicableOnEnum lhsTaxApplicableOn;
            lhsTaxApplicableOn = this.getTaxApplicableOn();
            TaxApplicableOnEnum rhsTaxApplicableOn;
            rhsTaxApplicableOn = that.getTaxApplicableOn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxApplicableOn", lhsTaxApplicableOn), LocatorUtils.property(thatLocator, "taxApplicableOn", rhsTaxApplicableOn), lhsTaxApplicableOn, rhsTaxApplicableOn, (this.taxApplicableOn!= null), (that.taxApplicableOn!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsDepositLineDetailEx;
            lhsDepositLineDetailEx = this.getDepositLineDetailEx();
            IntuitAnyType rhsDepositLineDetailEx;
            rhsDepositLineDetailEx = that.getDepositLineDetailEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "depositLineDetailEx", lhsDepositLineDetailEx), LocatorUtils.property(thatLocator, "depositLineDetailEx", rhsDepositLineDetailEx), lhsDepositLineDetailEx, rhsDepositLineDetailEx, (this.depositLineDetailEx!= null), (that.depositLineDetailEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            ReferenceType theEntity;
            theEntity = this.getEntity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "entity", theEntity), currentHashCode, theEntity, (this.entity!= null));
        }
        {
            ReferenceType theClassRef;
            theClassRef = this.getClassRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "classRef", theClassRef), currentHashCode, theClassRef, (this.classRef!= null));
        }
        {
            ReferenceType theAccountRef;
            theAccountRef = this.getAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountRef", theAccountRef), currentHashCode, theAccountRef, (this.accountRef!= null));
        }
        {
            ReferenceType thePaymentMethodRef;
            thePaymentMethodRef = this.getPaymentMethodRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentMethodRef", thePaymentMethodRef), currentHashCode, thePaymentMethodRef, (this.paymentMethodRef!= null));
        }
        {
            String theCheckNum;
            theCheckNum = this.getCheckNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "checkNum", theCheckNum), currentHashCode, theCheckNum, (this.checkNum!= null));
        }
        {
            TxnTypeEnum theTxnType;
            theTxnType = this.getTxnType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnType", theTxnType), currentHashCode, theTxnType, (this.txnType!= null));
        }
        {
            ReferenceType theTaxCodeRef;
            theTaxCodeRef = this.getTaxCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxCodeRef", theTaxCodeRef), currentHashCode, theTaxCodeRef, (this.taxCodeRef!= null));
        }
        {
            TaxApplicableOnEnum theTaxApplicableOn;
            theTaxApplicableOn = this.getTaxApplicableOn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxApplicableOn", theTaxApplicableOn), currentHashCode, theTaxApplicableOn, (this.taxApplicableOn!= null));
        }
        {
            IntuitAnyType theDepositLineDetailEx;
            theDepositLineDetailEx = this.getDepositLineDetailEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "depositLineDetailEx", theDepositLineDetailEx), currentHashCode, theDepositLineDetailEx, (this.depositLineDetailEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
