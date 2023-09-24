package herenciaclasecuenta;

public abstract class CuentaCorriente extends Cuenta {
    
    //Para que, NO heredando el método pagarIntereses(), no de fallo, tiene que ser abstracta y por lo tanto, no instanciable

    //creo un constructor, pero es inservible porque la clase es abstracta
    
    public CuentaCorriente(String numeroCuenta, double saldo){
        super(numeroCuenta, saldo);
        
    }
    public CuentaCorriente(){
        
    }



}