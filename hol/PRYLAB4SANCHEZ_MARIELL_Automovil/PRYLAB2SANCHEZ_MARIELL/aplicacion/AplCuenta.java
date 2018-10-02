package aplicacion;
import logicaDeNegocios.Cuenta;

public class AplCuenta
{
    // instance variables - replace the example below with your own
    //private static sCantCuentas = 0;
    
    private int x;
    private static int sCantCuentas = 0;
    
    /**
     * Constructor for objects of class AplCuenta
     */
    public AplCuenta(){
    }

    //Sin el método main la aplicación no se ejecuta
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Will Smith",2000);
        Cuenta cuenta2 = new Cuenta("Mark Hamill",5000);
        System.out.println(cuenta1.depositar(2000));
        System.out.println(cuenta1.retirar(500));
        System.out.println();
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        }
}