package herenciaclasecuenta;

public abstract class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private static int contador; // static para que el valor sea constante y no dependa de la ejecución

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.contador = contador;
    }
    
    // sí hacen falta los getters y setters, porque se modifica el saldo con el método de pagar intereses, y éste no está definido en la clase.
    // para poder aumentar los contadores
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Cuenta.contador = contador; // se podría quitar el nombre de la clase porque estamos en la misma, no?
    }
    
    
    public abstract void pagarIntereses();

}
