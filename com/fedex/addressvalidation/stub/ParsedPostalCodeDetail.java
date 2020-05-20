/**
 * ParsedPostalCodeDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.addressvalidation.stub;

public class ParsedPostalCodeDetail  implements java.io.Serializable {
    private java.lang.String base;

    private java.lang.String addOn;

    private java.lang.String deliveryPoint;

    public ParsedPostalCodeDetail() {
    }

    public ParsedPostalCodeDetail(
           java.lang.String base,
           java.lang.String addOn,
           java.lang.String deliveryPoint) {
           this.base = base;
           this.addOn = addOn;
           this.deliveryPoint = deliveryPoint;
    }


    /**
     * Gets the base value for this ParsedPostalCodeDetail.
     * 
     * @return base
     */
    public java.lang.String getBase() {
        return base;
    }


    /**
     * Sets the base value for this ParsedPostalCodeDetail.
     * 
     * @param base
     */
    public void setBase(java.lang.String base) {
        this.base = base;
    }


    /**
     * Gets the addOn value for this ParsedPostalCodeDetail.
     * 
     * @return addOn
     */
    public java.lang.String getAddOn() {
        return addOn;
    }


    /**
     * Sets the addOn value for this ParsedPostalCodeDetail.
     * 
     * @param addOn
     */
    public void setAddOn(java.lang.String addOn) {
        this.addOn = addOn;
    }


    /**
     * Gets the deliveryPoint value for this ParsedPostalCodeDetail.
     * 
     * @return deliveryPoint
     */
    public java.lang.String getDeliveryPoint() {
        return deliveryPoint;
    }


    /**
     * Sets the deliveryPoint value for this ParsedPostalCodeDetail.
     * 
     * @param deliveryPoint
     */
    public void setDeliveryPoint(java.lang.String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedPostalCodeDetail)) return false;
        ParsedPostalCodeDetail other = (ParsedPostalCodeDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.base==null && other.getBase()==null) || 
             (this.base!=null &&
              this.base.equals(other.getBase()))) &&
            ((this.addOn==null && other.getAddOn()==null) || 
             (this.addOn!=null &&
              this.addOn.equals(other.getAddOn()))) &&
            ((this.deliveryPoint==null && other.getDeliveryPoint()==null) || 
             (this.deliveryPoint!=null &&
              this.deliveryPoint.equals(other.getDeliveryPoint())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBase() != null) {
            _hashCode += getBase().hashCode();
        }
        if (getAddOn() != null) {
            _hashCode += getAddOn().hashCode();
        }
        if (getDeliveryPoint() != null) {
            _hashCode += getDeliveryPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedPostalCodeDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ParsedPostalCodeDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "Base"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "AddOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "DeliveryPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
