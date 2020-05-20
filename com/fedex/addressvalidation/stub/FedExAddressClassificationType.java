/**
 * FedExAddressClassificationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.addressvalidation.stub;

public class FedExAddressClassificationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FedExAddressClassificationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BUSINESS = "BUSINESS";
    public static final java.lang.String _MIXED = "MIXED";
    public static final java.lang.String _RESIDENTIAL = "RESIDENTIAL";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final FedExAddressClassificationType BUSINESS = new FedExAddressClassificationType(_BUSINESS);
    public static final FedExAddressClassificationType MIXED = new FedExAddressClassificationType(_MIXED);
    public static final FedExAddressClassificationType RESIDENTIAL = new FedExAddressClassificationType(_RESIDENTIAL);
    public static final FedExAddressClassificationType UNKNOWN = new FedExAddressClassificationType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static FedExAddressClassificationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FedExAddressClassificationType enumeration = (FedExAddressClassificationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FedExAddressClassificationType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FedExAddressClassificationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "FedExAddressClassificationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
