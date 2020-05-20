/**
 * ParsedAddressPartsDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.addressvalidation.stub;

public class ParsedAddressPartsDetail  implements java.io.Serializable {
    private com.fedex.addressvalidation.stub.ParsedStreetLineDetail parsedStreetLine;

    /* The postal code specified in a form that is supported by USPS
     * as base, secondary and tertiary. */
    private com.fedex.addressvalidation.stub.ParsedPostalCodeDetail parsedPostalCode;

    public ParsedAddressPartsDetail() {
    }

    public ParsedAddressPartsDetail(
           com.fedex.addressvalidation.stub.ParsedStreetLineDetail parsedStreetLine,
           com.fedex.addressvalidation.stub.ParsedPostalCodeDetail parsedPostalCode) {
           this.parsedStreetLine = parsedStreetLine;
           this.parsedPostalCode = parsedPostalCode;
    }


    /**
     * Gets the parsedStreetLine value for this ParsedAddressPartsDetail.
     * 
     * @return parsedStreetLine
     */
    public com.fedex.addressvalidation.stub.ParsedStreetLineDetail getParsedStreetLine() {
        return parsedStreetLine;
    }


    /**
     * Sets the parsedStreetLine value for this ParsedAddressPartsDetail.
     * 
     * @param parsedStreetLine
     */
    public void setParsedStreetLine(com.fedex.addressvalidation.stub.ParsedStreetLineDetail parsedStreetLine) {
        this.parsedStreetLine = parsedStreetLine;
    }


    /**
     * Gets the parsedPostalCode value for this ParsedAddressPartsDetail.
     * 
     * @return parsedPostalCode   * The postal code specified in a form that is supported by USPS
     * as base, secondary and tertiary.
     */
    public com.fedex.addressvalidation.stub.ParsedPostalCodeDetail getParsedPostalCode() {
        return parsedPostalCode;
    }


    /**
     * Sets the parsedPostalCode value for this ParsedAddressPartsDetail.
     * 
     * @param parsedPostalCode   * The postal code specified in a form that is supported by USPS
     * as base, secondary and tertiary.
     */
    public void setParsedPostalCode(com.fedex.addressvalidation.stub.ParsedPostalCodeDetail parsedPostalCode) {
        this.parsedPostalCode = parsedPostalCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsedAddressPartsDetail)) return false;
        ParsedAddressPartsDetail other = (ParsedAddressPartsDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parsedStreetLine==null && other.getParsedStreetLine()==null) || 
             (this.parsedStreetLine!=null &&
              this.parsedStreetLine.equals(other.getParsedStreetLine()))) &&
            ((this.parsedPostalCode==null && other.getParsedPostalCode()==null) || 
             (this.parsedPostalCode!=null &&
              this.parsedPostalCode.equals(other.getParsedPostalCode())));
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
        if (getParsedStreetLine() != null) {
            _hashCode += getParsedStreetLine().hashCode();
        }
        if (getParsedPostalCode() != null) {
            _hashCode += getParsedPostalCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsedAddressPartsDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ParsedAddressPartsDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parsedStreetLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ParsedStreetLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ParsedStreetLineDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parsedPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ParsedPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ParsedPostalCodeDetail"));
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
