/**
 * AddressValidationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.addressvalidation.stub;

public class AddressValidationResult  implements java.io.Serializable {
    /* The client reference id for the validated address. */
    private java.lang.String clientReferenceId;

    /* Specifies the degree to SHARE service was able to cannonicalise
     * the address provided, as per USPS standards and match it to an address
     * already in the internal FedEx address repository. */
    private com.fedex.addressvalidation.stub.OperationalAddressStateType state;

    private com.fedex.addressvalidation.stub.FedExAddressClassificationType classification;

    private com.fedex.addressvalidation.stub.Contact effectiveContact;

    private com.fedex.addressvalidation.stub.Address effectiveAddress;

    private com.fedex.addressvalidation.stub.ParsedAddressPartsDetail parsedAddressPartsDetail;

    /* Additional attributes about the validated address from FedEx
     * address respository.. */
    private com.fedex.addressvalidation.stub.AddressAttribute[] attributes;

    public AddressValidationResult() {
    }

    public AddressValidationResult(
           java.lang.String clientReferenceId,
           com.fedex.addressvalidation.stub.OperationalAddressStateType state,
           com.fedex.addressvalidation.stub.FedExAddressClassificationType classification,
           com.fedex.addressvalidation.stub.Contact effectiveContact,
           com.fedex.addressvalidation.stub.Address effectiveAddress,
           com.fedex.addressvalidation.stub.ParsedAddressPartsDetail parsedAddressPartsDetail,
           com.fedex.addressvalidation.stub.AddressAttribute[] attributes) {
           this.clientReferenceId = clientReferenceId;
           this.state = state;
           this.classification = classification;
           this.effectiveContact = effectiveContact;
           this.effectiveAddress = effectiveAddress;
           this.parsedAddressPartsDetail = parsedAddressPartsDetail;
           this.attributes = attributes;
    }


    /**
     * Gets the clientReferenceId value for this AddressValidationResult.
     * 
     * @return clientReferenceId   * The client reference id for the validated address.
     */
    public java.lang.String getClientReferenceId() {
        return clientReferenceId;
    }


    /**
     * Sets the clientReferenceId value for this AddressValidationResult.
     * 
     * @param clientReferenceId   * The client reference id for the validated address.
     */
    public void setClientReferenceId(java.lang.String clientReferenceId) {
        this.clientReferenceId = clientReferenceId;
    }


    /**
     * Gets the state value for this AddressValidationResult.
     * 
     * @return state   * Specifies the degree to SHARE service was able to cannonicalise
     * the address provided, as per USPS standards and match it to an address
     * already in the internal FedEx address repository.
     */
    public com.fedex.addressvalidation.stub.OperationalAddressStateType getState() {
        return state;
    }


    /**
     * Sets the state value for this AddressValidationResult.
     * 
     * @param state   * Specifies the degree to SHARE service was able to cannonicalise
     * the address provided, as per USPS standards and match it to an address
     * already in the internal FedEx address repository.
     */
    public void setState(com.fedex.addressvalidation.stub.OperationalAddressStateType state) {
        this.state = state;
    }


    /**
     * Gets the classification value for this AddressValidationResult.
     * 
     * @return classification
     */
    public com.fedex.addressvalidation.stub.FedExAddressClassificationType getClassification() {
        return classification;
    }


    /**
     * Sets the classification value for this AddressValidationResult.
     * 
     * @param classification
     */
    public void setClassification(com.fedex.addressvalidation.stub.FedExAddressClassificationType classification) {
        this.classification = classification;
    }


    /**
     * Gets the effectiveContact value for this AddressValidationResult.
     * 
     * @return effectiveContact
     */
    public com.fedex.addressvalidation.stub.Contact getEffectiveContact() {
        return effectiveContact;
    }


    /**
     * Sets the effectiveContact value for this AddressValidationResult.
     * 
     * @param effectiveContact
     */
    public void setEffectiveContact(com.fedex.addressvalidation.stub.Contact effectiveContact) {
        this.effectiveContact = effectiveContact;
    }


    /**
     * Gets the effectiveAddress value for this AddressValidationResult.
     * 
     * @return effectiveAddress
     */
    public com.fedex.addressvalidation.stub.Address getEffectiveAddress() {
        return effectiveAddress;
    }


    /**
     * Sets the effectiveAddress value for this AddressValidationResult.
     * 
     * @param effectiveAddress
     */
    public void setEffectiveAddress(com.fedex.addressvalidation.stub.Address effectiveAddress) {
        this.effectiveAddress = effectiveAddress;
    }


    /**
     * Gets the parsedAddressPartsDetail value for this AddressValidationResult.
     * 
     * @return parsedAddressPartsDetail
     */
    public com.fedex.addressvalidation.stub.ParsedAddressPartsDetail getParsedAddressPartsDetail() {
        return parsedAddressPartsDetail;
    }


    /**
     * Sets the parsedAddressPartsDetail value for this AddressValidationResult.
     * 
     * @param parsedAddressPartsDetail
     */
    public void setParsedAddressPartsDetail(com.fedex.addressvalidation.stub.ParsedAddressPartsDetail parsedAddressPartsDetail) {
        this.parsedAddressPartsDetail = parsedAddressPartsDetail;
    }


    /**
     * Gets the attributes value for this AddressValidationResult.
     * 
     * @return attributes   * Additional attributes about the validated address from FedEx
     * address respository..
     */
    public com.fedex.addressvalidation.stub.AddressAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this AddressValidationResult.
     * 
     * @param attributes   * Additional attributes about the validated address from FedEx
     * address respository..
     */
    public void setAttributes(com.fedex.addressvalidation.stub.AddressAttribute[] attributes) {
        this.attributes = attributes;
    }

    public com.fedex.addressvalidation.stub.AddressAttribute getAttributes(int i) {
        return this.attributes[i];
    }

    public void setAttributes(int i, com.fedex.addressvalidation.stub.AddressAttribute _value) {
        this.attributes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressValidationResult)) return false;
        AddressValidationResult other = (AddressValidationResult) obj;
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.classification==null && other.getClassification()==null) || 
             (this.classification!=null &&
              this.classification.equals(other.getClassification()))) &&
            ((this.effectiveContact==null && other.getEffectiveContact()==null) || 
             (this.effectiveContact!=null &&
              this.effectiveContact.equals(other.getEffectiveContact()))) &&
            ((this.effectiveAddress==null && other.getEffectiveAddress()==null) || 
             (this.effectiveAddress!=null &&
              this.effectiveAddress.equals(other.getEffectiveAddress()))) &&
            ((this.parsedAddressPartsDetail==null && other.getParsedAddressPartsDetail()==null) || 
             (this.parsedAddressPartsDetail!=null &&
              this.parsedAddressPartsDetail.equals(other.getParsedAddressPartsDetail()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getClassification() != null) {
            _hashCode += getClassification().hashCode();
        }
        if (getEffectiveContact() != null) {
            _hashCode += getEffectiveContact().hashCode();
        }
        if (getEffectiveAddress() != null) {
            _hashCode += getEffectiveAddress().hashCode();
        }
        if (getParsedAddressPartsDetail() != null) {
            _hashCode += getParsedAddressPartsDetail().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressValidationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "AddressValidationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ClientReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "OperationalAddressStateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "Classification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "FedExAddressClassificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "EffectiveContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "EffectiveAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parsedAddressPartsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ParsedAddressPartsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ParsedAddressPartsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "AddressAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
