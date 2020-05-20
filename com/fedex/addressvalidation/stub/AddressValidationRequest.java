/**
 * AddressValidationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.addressvalidation.stub;

public class AddressValidationRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private com.fedex.addressvalidation.stub.WebAuthenticationDetail webAuthenticationDetail;

    private com.fedex.addressvalidation.stub.ClientDetail clientDetail;

    private com.fedex.addressvalidation.stub.TransactionDetail transactionDetail;

    private com.fedex.addressvalidation.stub.VersionId version;

    private java.util.Calendar inEffectAsOfTimestamp;

    private com.fedex.addressvalidation.stub.AddressToValidate[] addressesToValidate;

    public AddressValidationRequest() {
    }

    public AddressValidationRequest(
           com.fedex.addressvalidation.stub.WebAuthenticationDetail webAuthenticationDetail,
           com.fedex.addressvalidation.stub.ClientDetail clientDetail,
           com.fedex.addressvalidation.stub.TransactionDetail transactionDetail,
           com.fedex.addressvalidation.stub.VersionId version,
           java.util.Calendar inEffectAsOfTimestamp,
           com.fedex.addressvalidation.stub.AddressToValidate[] addressesToValidate) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.inEffectAsOfTimestamp = inEffectAsOfTimestamp;
           this.addressesToValidate = addressesToValidate;
    }


    /**
     * Gets the webAuthenticationDetail value for this AddressValidationRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public com.fedex.addressvalidation.stub.WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this AddressValidationRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(com.fedex.addressvalidation.stub.WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this AddressValidationRequest.
     * 
     * @return clientDetail
     */
    public com.fedex.addressvalidation.stub.ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this AddressValidationRequest.
     * 
     * @param clientDetail
     */
    public void setClientDetail(com.fedex.addressvalidation.stub.ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this AddressValidationRequest.
     * 
     * @return transactionDetail
     */
    public com.fedex.addressvalidation.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this AddressValidationRequest.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(com.fedex.addressvalidation.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this AddressValidationRequest.
     * 
     * @return version
     */
    public com.fedex.addressvalidation.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AddressValidationRequest.
     * 
     * @param version
     */
    public void setVersion(com.fedex.addressvalidation.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the inEffectAsOfTimestamp value for this AddressValidationRequest.
     * 
     * @return inEffectAsOfTimestamp
     */
    public java.util.Calendar getInEffectAsOfTimestamp() {
        return inEffectAsOfTimestamp;
    }


    /**
     * Sets the inEffectAsOfTimestamp value for this AddressValidationRequest.
     * 
     * @param inEffectAsOfTimestamp
     */
    public void setInEffectAsOfTimestamp(java.util.Calendar inEffectAsOfTimestamp) {
        this.inEffectAsOfTimestamp = inEffectAsOfTimestamp;
    }


    /**
     * Gets the addressesToValidate value for this AddressValidationRequest.
     * 
     * @return addressesToValidate
     */
    public com.fedex.addressvalidation.stub.AddressToValidate[] getAddressesToValidate() {
        return addressesToValidate;
    }


    /**
     * Sets the addressesToValidate value for this AddressValidationRequest.
     * 
     * @param addressesToValidate
     */
    public void setAddressesToValidate(com.fedex.addressvalidation.stub.AddressToValidate[] addressesToValidate) {
        this.addressesToValidate = addressesToValidate;
    }

    public com.fedex.addressvalidation.stub.AddressToValidate getAddressesToValidate(int i) {
        return this.addressesToValidate[i];
    }

    public void setAddressesToValidate(int i, com.fedex.addressvalidation.stub.AddressToValidate _value) {
        this.addressesToValidate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressValidationRequest)) return false;
        AddressValidationRequest other = (AddressValidationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webAuthenticationDetail==null && other.getWebAuthenticationDetail()==null) || 
             (this.webAuthenticationDetail!=null &&
              this.webAuthenticationDetail.equals(other.getWebAuthenticationDetail()))) &&
            ((this.clientDetail==null && other.getClientDetail()==null) || 
             (this.clientDetail!=null &&
              this.clientDetail.equals(other.getClientDetail()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.inEffectAsOfTimestamp==null && other.getInEffectAsOfTimestamp()==null) || 
             (this.inEffectAsOfTimestamp!=null &&
              this.inEffectAsOfTimestamp.equals(other.getInEffectAsOfTimestamp()))) &&
            ((this.addressesToValidate==null && other.getAddressesToValidate()==null) || 
             (this.addressesToValidate!=null &&
              java.util.Arrays.equals(this.addressesToValidate, other.getAddressesToValidate())));
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
        if (getWebAuthenticationDetail() != null) {
            _hashCode += getWebAuthenticationDetail().hashCode();
        }
        if (getClientDetail() != null) {
            _hashCode += getClientDetail().hashCode();
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getInEffectAsOfTimestamp() != null) {
            _hashCode += getInEffectAsOfTimestamp().hashCode();
        }
        if (getAddressesToValidate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressesToValidate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressesToValidate(), i);
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
        new org.apache.axis.description.TypeDesc(AddressValidationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "AddressValidationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAuthenticationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "WebAuthenticationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "WebAuthenticationDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ClientDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ClientDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inEffectAsOfTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "InEffectAsOfTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressesToValidate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "AddressesToValidate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "AddressToValidate"));
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
