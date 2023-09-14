
package herenciaclasecuenta;


public abstract class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private int contador;

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, double saldo, int contador) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.contador = contador;
    }
    
    
    
}
