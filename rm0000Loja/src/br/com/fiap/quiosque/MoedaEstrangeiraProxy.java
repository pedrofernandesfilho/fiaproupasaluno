package br.com.fiap.quiosque;

public class MoedaEstrangeiraProxy implements br.com.fiap.quiosque.MoedaEstrangeira {
  private String _endpoint = null;
  private br.com.fiap.quiosque.MoedaEstrangeira moedaEstrangeira = null;
  
  public MoedaEstrangeiraProxy() {
    _initMoedaEstrangeiraProxy();
  }
  
  public MoedaEstrangeiraProxy(String endpoint) {
    _endpoint = endpoint;
    _initMoedaEstrangeiraProxy();
  }
  
  private void _initMoedaEstrangeiraProxy() {
    try {
      moedaEstrangeira = (new br.com.fiap.quiosque.MoedaEstrangeiraServiceLocator()).getMoedaEstrangeira();
      if (moedaEstrangeira != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)moedaEstrangeira)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)moedaEstrangeira)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (moedaEstrangeira != null)
      ((javax.xml.rpc.Stub)moedaEstrangeira)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.fiap.quiosque.MoedaEstrangeira getMoedaEstrangeira() {
    if (moedaEstrangeira == null)
      _initMoedaEstrangeiraProxy();
    return moedaEstrangeira;
  }
  
  public int converterDolar(int valor) throws java.rmi.RemoteException{
    if (moedaEstrangeira == null)
      _initMoedaEstrangeiraProxy();
    return moedaEstrangeira.converterDolar(valor);
  }
  
  
}