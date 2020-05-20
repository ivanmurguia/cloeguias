/**
 * AddressValidationReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.addressvalidation.stub;

public class AddressValidationReply  implements java.io.Serializable {
    private com.fedex.addressvalidation.stub.NotificationSeverityType highestSeverity;

    private com.fedex.addressvalidation.stub.Notification[] notifications;

    private com.fedex.addressvalidation.stub.TransactionDetail transactionDetail;

    private com.fedex.addressvalidation.stub.VersionId version;

    private java.util.Calendar replyTimestamp;

    private com.fedex.addressvalidation.stub.AddressValidationResult[] addressResults;

    public AddressValidationReply() {
    }

    public AddressValidationReply(
           com.fedex.addressvalidation.stub.NotificationSeverityType highestSeverity,
           com.fedex.addressvalidation.stub.Notification[] notifications,
           com.fedex.addressvalidation.stub.TransactionDetail transactionDetail,
           com.fedex.addressvalidation.stub.VersionId version,
           java.util.Calendar replyTimestamp,
           com.fedex.addressvalidation.stub.AddressValidationResult[] addressResults) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.replyTimestamp = replyTimestamp;
           this.addressResults = addressResults;
    }


    /**
     * Gets the highestSeverity value for this AddressValidationReply.
     * 
     * @return highestSeverity
     */
    public com.fedex.addressvalidation.stub.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this AddressValidationReply.
     * 
     * @param highestSeverity
     */
    public void setHighestSeverity(com.fedex.addressvalidation.stub.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this AddressValidationReply.
     * 
     * @return notifications
     */
    public com.fedex.addressvalidation.stub.Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this AddressValidationReply.
     * 
     * @param notifications
     */
    public void setNotifications(com.fedex.addressvalidation.stub.Notification[] notifications) {
        this.notifications = notifications;
    }

    public com.fedex.addressvalidation.stub.Notification getNotifications(int i) {
        return this.notifications[i];
    }

    public void setNotifications(int i, com.fedex.addressvalidation.stub.Notification _value) {
        this.notifications[i] = _value;
    }


    /**
     * Gets the transactionDetail value for this AddressValidationReply.
     * 
     * @return transactionDetail
     */
    public com.fedex.addressvalidation.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this AddressValidationReply.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(com.fedex.addressvalidation.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this AddressValidationReply.
     * 
     * @return version
     */
    public com.fedex.addressvalidation.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AddressValidationReply.
     * 
     * @param version
     */
    public void setVersion(com.fedex.addressvalidation.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the replyTimestamp value for this AddressValidationReply.
     * 
     * @return replyTimestamp
     */
    public java.util.Calendar getReplyTimestamp() {
        return replyTimestamp;
    }


    /**
     * Sets the replyTimestamp value for this AddressValidationReply.
     * 
     * @param replyTimestamp
     */
    public void setReplyTimestamp(java.util.Calendar replyTimestamp) {
        this.replyTimestamp = replyTimestamp;
    }


    /**
     * Gets the addressResults value for this AddressValidationReply.
     * 
     * @return addressResults
     */
    public com.fedex.addressvalidation.stub.AddressValidationResult[] getAddressResults() {
        return addressResults;
    }


    /**
     * Sets the addressResults value for this AddressValidationReply.
     * 
     * @param addressResults
     */
    public void setAddressResults(com.fedex.addressvalidation.stub.AddressValidationResult[] addressResults) {
        this.addressResults = addressResults;
    }

    public com.fedex.addressvalidation.stub.AddressValidationResult getAddressResults(int i) {
        return this.addressResults[i];
    }

    public void setAddressResults(int i, com.fedex.addressvalidation.stub.AddressValidationResult _value) {
        this.addressResults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressValidationReply)) return false;
        AddressValidationReply other = (AddressValidationReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.highestSeverity==null && other.getHighestSeverity()==null) || 
             (this.highestSeverity!=null &&
              this.highestSeverity.equals(other.getHighestSeverity()))) &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              java.util.Arrays.equals(this.notifications, other.getNotifications()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.replyTimestamp==null && other.getReplyTimestamp()==null) || 
             (this.replyTimestamp!=null &&
              this.replyTimestamp.equals(other.getReplyTimestamp()))) &&
            ((this.addressResults==null && other.getAddressResults()==null) || 
             (this.addressResults!=null &&
              java.util.Arrays.equals(this.addressResults, other.getAddressResults())));
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
        if (getHighestSeverity() != null) {
            _hashCode += getHighestSeverity().hashCode();
        }
        if (getNotifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getReplyTimestamp() != null) {
            _hashCode += getReplyTimestamp().hashCode();
        }
        if (getAddressResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressResults(), i);
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
        new org.apache.axis.description.TypeDesc(AddressValidationReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "AddressValidationReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "NotificationSeverityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "Notification"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("replyTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "ReplyTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "AddressResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "AddressValidationResult"));
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
