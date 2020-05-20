/**
 * AddressToValidate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.addressvalidation.stub;

public class AddressToValidate  implements java.io.Serializable {
    /* A reference id provided by the client. */
    private java.lang.String clientReferenceId;

    private com.fedex.addressvalidation.stub.Contact contact;

    private com.fedex.addressvalidation.stub.Address address;

    public AddressToValidate() {
    }

    public AddressToValidate(
           java.lang.String clientReferenceId,
           com.fedex.addressvalidation.stub.Contact contact,
           com.fedex.addressvalidation.stub.Address address) {
           this.clientReferenceId = clientReferenceId;
           this.contact = contact;
           this.address = address;
    }


    /**
     * Gets the clientReferenceId value for this AddressToValidate.
     * 
     * @return clientReferenceId   * A reference id provided by the client.
     */
    public java.lang.String getClientReferenceId() {
        return clientReferenceId;
    }


    /**
     * Sets the clientReferenceId value for this AddressToValidate.
     * 
     * @param clientReferenceId   * A reference id provided by the client.
     */
    public void setClientReferenceId(java.lang.String clientReferenceId) {
        this.clientReferenceId = clientReferenceId;
    }


    /**
     * Gets the contact value for this AddressToValidate.
     * 
     * @return contact
     */
    public com.fedex.addressvalidation.stub.Contact getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this AddressToValidate.
     * 
     * @param contact
     */
    public void setContact(com.fedex.addressvalidation.stub.Contact contact) {
        this.contact = contact;
    }


    /**
     * Gets the address value for this AddressToValidate.
     * 
     * @return address
     */
    public com.fedex.addressvalidation.stub.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this AddressToValidate.
     * 
     * @param address
     */
    public void setAddress(com.fedex.addressvalidation.stub.Address address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressToValidate)) return false;
        AddressToValidate other = (AddressToValidate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientReferenceId==null && other.getClientReferenceId()==null) || 
             (this.clientReferenceId!=null &&
              this.clientReferenceId.equals(other.getClientReferenceId()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getClientReferenceId() != null) {
            _hashCode += getClientReferenceId().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressToValidate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "AddressToValidate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ClientReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "Address"));
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
