
package herenciaclasecuenta;


public class CuentaMuyCorriente extends CuentaCorriente {
    
    public CuentaMuyCorriente(String numeroCuenta, double saldo ){
        super(numeroCuenta, saldo);
        Cuenta.setContador(Cuenta.getContador()+1);
    }
    public CuentaMuyCorriente(){
        Cuenta.setContador(Cuenta.getContador()+1);
    }
    
    @Override
    public void pagarIntereses(){
        super.setSaldo(super.getSaldo()*1.06);
        
    }; 
    
}
