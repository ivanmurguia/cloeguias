/**
 * AddressValidationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.addressvalidation.stub;

public class AddressValidationServiceLocator extends org.apache.axis.client.Service implements com.fedex.addressvalidation.stub.AddressValidationService {

    public AddressValidationServiceLocator() {
    }


    public AddressValidationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddressValidationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddressValidationServicePort
    private java.lang.String AddressValidationServicePort_address = "https://wsbeta.fedex.com:443/web-services/addressvalidation";

    public java.lang.String getAddressValidationServicePortAddress() {
        return AddressValidationServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddressValidationServicePortWSDDServiceName = "AddressValidationServicePort";

    public java.lang.String getAddressValidationServicePortWSDDServiceName() {
        return AddressValidationServicePortWSDDServiceName;
    }

    public void setAddressValidationServicePortWSDDServiceName(java.lang.String name) {
        AddressValidationServicePortWSDDServiceName = name;
    }

    public com.fedex.addressvalidation.stub.AddressValidationPortType getAddressValidationServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddressValidationServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddressValidationServicePort(endpoint);
    }

    public com.fedex.addressvalidation.stub.AddressValidationPortType getAddressValidationServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fedex.addressvalidation.stub.AddressValidationServiceSoapBindingStub _stub = new com.fedex.addressvalidation.stub.AddressValidationServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddressValidationServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddressValidationServicePortEndpointAddress(java.lang.String address) {
        AddressValidationServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.fedex.addressvalidation.stub.AddressValidationPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fedex.addressvalidation.stub.AddressValidationServiceSoapBindingStub _stub = new com.fedex.addressvalidation.stub.AddressValidationServiceSoapBindingStub(new java.net.URL(AddressValidationServicePort_address), this);
                _stub.setPortName(getAddressValidationServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AddressValidationServicePort".equals(inputPortName)) {
            return getAddressValidationServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "AddressValidationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fedex.com/ws/addressvalidation/v4", "AddressValidationServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddressValidationServicePort".equals(portName)) {
            setAddressValidationServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
