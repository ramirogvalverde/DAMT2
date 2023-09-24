package herenciaclasecuenta;


public final class CuentaJoven extends Cuenta { // es final para que no se pueda crear clases derivadas de esta

    
    public CuentaJoven(String numeroCuenta, double saldo){
        super(numeroCuenta, saldo);
        Cuenta.setContador(Cuenta.getContador()+1);
    }
    public CuentaJoven(){
             Cuenta.setContador(Cuenta.getContador()+1);
    }

    @Override // en el insert code del ide no te muestra este método entre los override
    public void pagarIntereses() {
        super.setSaldo(super.getSaldo()*1.05);
    }


  
    
    
}
