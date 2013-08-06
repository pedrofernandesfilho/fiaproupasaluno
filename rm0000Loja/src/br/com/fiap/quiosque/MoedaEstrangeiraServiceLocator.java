/**
 * MoedaEstrangeiraServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.quiosque;

public class MoedaEstrangeiraServiceLocator extends org.apache.axis.client.Service implements br.com.fiap.quiosque.MoedaEstrangeiraService {

    public MoedaEstrangeiraServiceLocator() {
    }


    public MoedaEstrangeiraServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MoedaEstrangeiraServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MoedaEstrangeira
    private java.lang.String MoedaEstrangeira_address = "http://localhost:9080/rm0000Quiosque/services/MoedaEstrangeira";

    public java.lang.String getMoedaEstrangeiraAddress() {
        return MoedaEstrangeira_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MoedaEstrangeiraWSDDServiceName = "MoedaEstrangeira";

    public java.lang.String getMoedaEstrangeiraWSDDServiceName() {
        return MoedaEstrangeiraWSDDServiceName;
    }

    public void setMoedaEstrangeiraWSDDServiceName(java.lang.String name) {
        MoedaEstrangeiraWSDDServiceName = name;
    }

    public br.com.fiap.quiosque.MoedaEstrangeira getMoedaEstrangeira() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MoedaEstrangeira_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMoedaEstrangeira(endpoint);
    }

    public br.com.fiap.quiosque.MoedaEstrangeira getMoedaEstrangeira(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.fiap.quiosque.MoedaEstrangeiraSoapBindingStub _stub = new br.com.fiap.quiosque.MoedaEstrangeiraSoapBindingStub(portAddress, this);
            _stub.setPortName(getMoedaEstrangeiraWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMoedaEstrangeiraEndpointAddress(java.lang.String address) {
        MoedaEstrangeira_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.fiap.quiosque.MoedaEstrangeira.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.fiap.quiosque.MoedaEstrangeiraSoapBindingStub _stub = new br.com.fiap.quiosque.MoedaEstrangeiraSoapBindingStub(new java.net.URL(MoedaEstrangeira_address), this);
                _stub.setPortName(getMoedaEstrangeiraWSDDServiceName());
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
        if ("MoedaEstrangeira".equals(inputPortName)) {
            return getMoedaEstrangeira();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://quiosque.fiap.com.br", "MoedaEstrangeiraService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://quiosque.fiap.com.br", "MoedaEstrangeira"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MoedaEstrangeira".equals(portName)) {
            setMoedaEstrangeiraEndpointAddress(address);
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
