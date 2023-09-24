package herenciaclasecuenta;

public class UsoCuenta {

    public static void main(String[] args) {

        //  Cuenta micuenta1= new Cuenta(); al ser abstracta no puedo instanciarla
        //  Cuenta micuenta2= new CuentaCorriente();
        Cuenta[] misCuentas= new Cuenta[3];
        
        misCuentas[0]= new CuentaJoven();
        misCuentas[1]= new CuentaJoven("355353553",4000);
        misCuentas[2]= new CuentaMuyCorriente("330300300", 35000);
        
        
        for (Cuenta c : misCuentas) {
            
            System.out.println("La cuenta número: " + c.getNumeroCuenta() + " tiene un saldo de: " + c.getSaldo());
            
        }
        
        misCuentas[1].pagarIntereses();
        
        for (Cuenta c : misCuentas) {
            
            System.out.println("La cuenta número: " + c.getNumeroCuenta() + " tiene un saldo de: " + c.getSaldo());
            
        }
        
        System.out.println("Se han creado " + Cuenta.getContador() + " cuentas.");
    }

}
