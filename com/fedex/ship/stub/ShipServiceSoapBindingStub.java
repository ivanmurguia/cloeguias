/**
 * ShipServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;

public class ShipServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.fedex.ship.stub.ShipPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processTag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ProcessTagRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ProcessTagRequest"), com.fedex.ship.stub.ProcessTagRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ProcessTagReply"));
        oper.setReturnClass(com.fedex.ship.stub.ProcessTagReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ProcessTagReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ProcessShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ProcessShipmentRequest"), com.fedex.ship.stub.ProcessShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ProcessShipmentReply"));
        oper.setReturnClass(com.fedex.ship.stub.ProcessShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ProcessShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteTag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DeleteTagRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DeleteTagRequest"), com.fedex.ship.stub.DeleteTagRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentReply"));
        oper.setReturnClass(com.fedex.ship.stub.ShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DeleteShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DeleteShipmentRequest"), com.fedex.ship.stub.DeleteShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentReply"));
        oper.setReturnClass(com.fedex.ship.stub.ShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateShipment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ValidateShipmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ValidateShipmentRequest"), com.fedex.ship.stub.ValidateShipmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentReply"));
        oper.setReturnClass(com.fedex.ship.stub.ShipmentReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public ShipServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ShipServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ShipServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AccessorRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.AccessorRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AdditionalLabelsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.AdditionalLabelsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AdditionalLabelsType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.AdditionalLabelsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Address");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AdrLicenseDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.AdrLicenseDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AlcoholDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.AlcoholDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AlcoholRecipientType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.AlcoholRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AncillaryFeeAndTax");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.AncillaryFeeAndTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AncillaryFeeAndTaxType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.AncillaryFeeAndTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AssociatedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.AssociatedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AssociatedShipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.AssociatedShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "B13AFilingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.B13AFilingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "BarcodeSymbologyType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.BarcodeSymbologyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "BatteryClassificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.BatteryClassificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "BatteryMaterialType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.BatteryMaterialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "BatteryPackingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.BatteryPackingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "BatteryRegulatorySubType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.BatteryRegulatorySubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "BinaryBarcode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.BinaryBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "BinaryBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.BinaryBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "BrokerDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.BrokerDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "BrokerType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.BrokerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CarrierCodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CarrierCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ChargeBasisLevelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ChargeBasisLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ClearanceBrokerageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ClearanceBrokerageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CodAddTransportationChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CodAddTransportationChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CodAddTransportationChargesDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CodAddTransportationChargesDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CodAdjustmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CodAdjustmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CodCollectionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CodCollectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CodDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CodReturnPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CodReturnPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CodReturnReferenceIndicatorType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CodReturnReferenceIndicatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CommercialInvoice");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CommercialInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CommercialInvoiceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CommercialInvoiceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Commodity");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Commodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CommodityPurposeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CommodityPurposeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedCodDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CompletedCodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedEtdDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CompletedEtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedEtdType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CompletedEtdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedHazardousPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CompletedHazardousPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedHazardousShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CompletedHazardousShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedHazardousSummaryDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CompletedHazardousSummaryDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedHoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CompletedHoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedPackageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CompletedPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CompletedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedSmartPostDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CompletedSmartPostDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedTagDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CompletedTagDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ConfigurableLabelReferenceEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ConfigurableLabelReferenceEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Contact");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ContactAndAddress");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ContentRecord");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ContentRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CurrencyExchangeRate");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CurrencyExchangeRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomDeliveryWindowDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomDeliveryWindowDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomDeliveryWindowType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomDeliveryWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomDocumentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomerImageUsage");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomerImageUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomerImageUsageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomerImageUsageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomerReference");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomerReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomerReferenceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomerReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomerSpecifiedLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomerSpecifiedLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomerSpecifiedLabelGenerationOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomerSpecifiedLabelGenerationOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomLabelBarcodeEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomLabelBarcodeEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomLabelBoxEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomLabelBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomLabelCoordinateUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomLabelCoordinateUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomLabelGraphicEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomLabelGraphicEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomLabelPosition");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomLabelPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomLabelTextBoxEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomLabelTextBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomLabelTextEntry");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomLabelTextEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomsClearanceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomsClearanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomsDeclarationStatementDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomsDeclarationStatementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomsDeclarationStatementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomsDeclarationStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomsOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomsOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomsOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomsOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomsRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.CustomsRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsAccessibilityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DangerousGoodsAccessibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsContainer");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DangerousGoodsContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DangerousGoodsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsPackingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DangerousGoodsPackingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsShippersDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DangerousGoodsShippersDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsSignatory");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DangerousGoodsSignatory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DateRange");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DayOfWeekType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DayOfWeekType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DeleteShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DeleteShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DeleteTagRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DeleteTagRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DeletionControlType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DeletionControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DeliveryOnInvoiceAcceptanceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DeliveryOnInvoiceAcceptanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DestinationControlDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DestinationControlDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DestinationControlStatementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DestinationControlStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Dimensions");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocTabContent");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DocTabContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocTabContentBarcoded");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DocTabContentBarcoded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocTabContentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DocTabContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocTabContentZone001");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DocTabContentZone001.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocTabZoneJustificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DocTabZoneJustificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocTabZoneSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DocTabZoneSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocumentFormatOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DocumentFormatOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocumentFormatOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DocumentFormatOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocumentGenerationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DocumentGenerationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocumentRequirementsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DocumentRequirementsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DropoffType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.DropoffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EdtCommodityTax");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EdtCommodityTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EdtExciseCondition");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EdtExciseCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EdtRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EdtRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EdtTaxDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EdtTaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EdtTaxType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EdtTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EMailLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EMailLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EMailNotificationRecipientType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EMailNotificationRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EmailOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EmailOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EmailOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EmailOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EMailRecipient");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EnterpriseDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EnterpriseDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EtdAttributeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EtdAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EtdDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.EtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ExportDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ExportDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ExportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ExpressFreightDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ExpressFreightDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FedExLocationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FedExLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightAddressLabelDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightAddressLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightBaseCharge");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightBaseCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightBaseChargeCalculationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightBaseChargeCalculationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightChargeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightClassType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightCollectTermsType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightCollectTermsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightGuaranteeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightGuaranteeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightGuaranteeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightGuaranteeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightOnValueType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightOnValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightRateNotation");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightRateNotation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightRateQuoteType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightRateQuoteType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightShipmentLineItem");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightShipmentLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightShipmentRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightShipmentRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "FreightSpecialServicePayment");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.FreightSpecialServicePayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "GeneralAgencyAgreementDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.GeneralAgencyAgreementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "GroundDeliveryEligibilityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.GroundDeliveryEligibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityAttributeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityDescriptionProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityDescriptionProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityInnerReceptacleDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityInnerReceptacleDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityLabelTextOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityLabelTextOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityPackagingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityPackagingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityPackingDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityPackingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityPackingGroupType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityPackingGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityQuantityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityQuantityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityQuantityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityQuantityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityRegulationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousCommodityRegulationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousContainerPackingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HazardousContainerPackingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HomeDeliveryPremiumDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HomeDeliveryPremiumDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HomeDeliveryPremiumType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.HomeDeliveryPremiumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ImageId");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ImageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "InternationalControlledExportDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.InternationalControlledExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "InternationalControlledExportType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.InternationalControlledExportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "InternationalDocumentContentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.InternationalDocumentContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "InternationalTrafficInArmsRegulationsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.InternationalTrafficInArmsRegulationsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelFormatType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.LabelFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelMaskableDataType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.LabelMaskableDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelOrderType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.LabelOrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelPrintingOrientationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.LabelPrintingOrientationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelRotationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.LabelRotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.LabelSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelStockType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.LabelStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LiabilityCoverageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.LiabilityCoverageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LiabilityCoverageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.LiabilityCoverageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LicenseOrPermitDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.LicenseOrPermitDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LinearMeasure");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.LinearMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LinearUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.LinearUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Localization");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Measure");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Measure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "MinimumChargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.MinimumChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Money");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NaftaCertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NaftaCertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NaftaCommodityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NaftaCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NaftaImporterSpecificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NaftaImporterSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NaftaLowValueStatementDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NaftaLowValueStatementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NaftaNetCostMethodCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NaftaNetCostMethodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NaftaPreferenceCriterionCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NaftaPreferenceCriterionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NaftaProducer");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NaftaProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NaftaProducerDeterminationCode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NaftaProducerDeterminationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NaftaProducerSpecificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NaftaProducerSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NetExplosiveClassificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NetExplosiveClassificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NetExplosiveDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NetExplosiveDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Notification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NotificationEventType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NotificationEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NotificationFormatType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NotificationFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NotificationParameter");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NotificationParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NotificationSeverityType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NotificationSeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "NotificationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.NotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Op900Detail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Op900Detail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "OperationalInstruction");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.OperationalInstruction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "OversizeClassType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.OversizeClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PackageBarcodes");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PackageBarcodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PackageOperationalDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PackageOperationalDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PackageRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PackageRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PackageRating");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PackageRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PackageSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PackageSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PackageSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PackageSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PackagingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PageQuadrantType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PageQuadrantType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Party");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Party.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Payment");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Payment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PaymentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Payor");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Payor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PendingShipmentAccessDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PendingShipmentAccessDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PendingShipmentAccessorDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PendingShipmentAccessorDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PendingShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PendingShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PendingShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PendingShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PendingShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PendingShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PendingShipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PendingShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PhysicalFormType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PhysicalFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PhysicalPackagingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PhysicalPackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PickupDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PickupDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PickupRequestSourceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PickupRequestSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PickupRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PickupRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PricingCodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PricingCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PrintedReference");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PrintedReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PrintedReferenceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PrintedReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PriorityAlertDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PriorityAlertDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PriorityAlertEnhancementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PriorityAlertEnhancementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ProcessShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ProcessShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ProcessShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ProcessShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ProcessTagReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ProcessTagReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ProcessTagRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ProcessTagRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PurposeOfShipmentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.PurposeOfShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RadioactiveContainerClassType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RadioactiveContainerClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RadioactiveLabelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RadioactiveLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RadioactivityDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RadioactivityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RadioactivityUnitOfMeasure");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RadioactivityUnitOfMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RadionuclideActivity");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RadionuclideActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RadionuclideDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RadionuclideDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RateDimensionalDivisorType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RateDimensionalDivisorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RateDiscount");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RateDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RateDiscountType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RateDiscountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RatedWeightMethod");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RatedWeightMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RateElementBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RateElementBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RateRequestType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RateTypeBasisType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RateTypeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Rebate");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Rebate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RebateType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RebateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RecipientCustomsId");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RecipientCustomsId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RecipientCustomsIdType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RecipientCustomsIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RecommendedDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RecommendedDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RecommendedDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RecommendedDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RegulatoryControlType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RegulatoryControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RegulatoryLabelContentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RegulatoryLabelContentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RegulatoryLabelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RegulatoryLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RelativeVerticalPositionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RelativeVerticalPositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RequestedPackageLineItem");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RequestedPackageLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RequestedShipment");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RequestedShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RequestedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RequestedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RequiredDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RequiredDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RequirementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RequirementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ReturnAssociationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ReturnAssociationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ReturnedRateType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ReturnedRateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ReturnedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ReturnedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ReturnEMailAllowedSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ReturnEMailAllowedSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ReturnEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ReturnEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ReturnInstructionsDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ReturnInstructionsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ReturnShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ReturnShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ReturnType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Rma");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Rma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RotationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.RotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SecondaryBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.SecondaryBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentAuthorizationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentAuthorizationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentConfigurationData");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentConfigurationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentDryIceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentDryIceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentDryIceProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentDryIceProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentDryIceProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentDryIceProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentEventNotificationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentEventNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentEventNotificationSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentEventNotificationSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentLegRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentLegRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentManifestDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentManifestDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentNotificationAggregationType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentNotificationAggregationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentNotificationFormatSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentNotificationFormatSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentNotificationRoleType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentNotificationRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentOperationalDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentOperationalDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentRateDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentRating");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentReply");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShipmentSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocument");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentDispositionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentDispositionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentDispositionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentDispositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentEMailDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentEMailGroupingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentEMailGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentEMailRecipient");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentEMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentFormat");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentGroupingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentImageType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentNamingType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentNamingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentPart");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentPart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentPrintDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentPrintDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentStockType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentStorageDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentStorageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentStorageDetailType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ShippingDocumentStorageDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SignatureOptionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.SignatureOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SignatureOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.SignatureOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SmartPostAncillaryEndorsementType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.SmartPostAncillaryEndorsementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SmartPostIndiciaType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.SmartPostIndiciaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SmartPostShipmentDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.SmartPostShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SmartPostShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.SmartPostShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SmartPostShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.SmartPostShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SpecialRatingAppliedType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.SpecialRatingAppliedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "StringBarcode");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.StringBarcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "StringBarcodeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.StringBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Surcharge");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Surcharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SurchargeLevelType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.SurchargeLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SurchargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.SurchargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Tax");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Tax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "TaxesOrMiscellaneousChargeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.TaxesOrMiscellaneousChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "TaxpayerIdentification");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.TaxpayerIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "TaxType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.TaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "TinType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.TinType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "TrackingId");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.TrackingId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "TrackingIdType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.TrackingIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "TransitTimeType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.TransitTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "UploadDocumentIdProducer");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.UploadDocumentIdProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "UploadDocumentProducerType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.UploadDocumentProducerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "UploadDocumentReferenceDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.UploadDocumentReferenceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "UploadDocumentType");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.UploadDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ValidatedHazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ValidatedHazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ValidatedHazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ValidatedHazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ValidatedHazardousContainer");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ValidatedHazardousContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ValidateShipmentRequest");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.ValidateShipmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "VariableHandlingChargeDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.VariableHandlingChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "VariableHandlingCharges");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.VariableHandlingCharges.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "VersionId");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.VersionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Volume");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Volume.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "VolumeUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.VolumeUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "WebAuthenticationCredential");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.WebAuthenticationCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "WebAuthenticationDetail");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.WebAuthenticationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Weight");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "WeightUnits");
            cachedSerQNames.add(qName);
            cls = com.fedex.ship.stub.WeightUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.fedex.ship.stub.ProcessTagReply processTag(com.fedex.ship.stub.ProcessTagRequest processTagRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v21/processTag");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processTag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processTagRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ship.stub.ProcessTagReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ship.stub.ProcessTagReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ship.stub.ProcessTagReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.ship.stub.ProcessShipmentReply processShipment(com.fedex.ship.stub.ProcessShipmentRequest processShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v21/processShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {processShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ship.stub.ProcessShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ship.stub.ProcessShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ship.stub.ProcessShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.ship.stub.ShipmentReply deleteTag(com.fedex.ship.stub.DeleteTagRequest deleteTagRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v21/deleteTag");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteTag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteTagRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ship.stub.ShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ship.stub.ShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ship.stub.ShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.ship.stub.ShipmentReply deleteShipment(com.fedex.ship.stub.DeleteShipmentRequest deleteShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v21/deleteShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "deleteShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {deleteShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ship.stub.ShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ship.stub.ShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ship.stub.ShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fedex.ship.stub.ShipmentReply validateShipment(com.fedex.ship.stub.ValidateShipmentRequest validateShipmentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/ship/v21/validateShipment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validateShipment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {validateShipmentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fedex.ship.stub.ShipmentReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fedex.ship.stub.ShipmentReply) org.apache.axis.utils.JavaUtils.convert(_resp, com.fedex.ship.stub.ShipmentReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
