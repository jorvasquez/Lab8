package aplicacion;
import logicaDeNegocios.Cliente;
import logicaDeNegocios.Cuenta;
import logicaDeNegocios.CuentaAhorro;
import logicaDeNegocios.CuentaCorriente;
public class AplCuenta
{
    // instance variables - replace the example below with your own
    //private static sCantCuentas = 0;
    
    private static int sCantCuentas = 0;
    
    /**
     * Constructor for objects of class AplCuenta
     */
    public AplCuenta(){
    }

    //Sin el metodo main la aplicacion no se ejecuta
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente( "234", "Clark", "Kent" );
        Cliente cliente2 = new Cliente( "568", "Bruce", "Wayne" );

        Cuenta cuenta1 = new CuentaAhorro (cliente1, 3500);
        Cuenta cuenta2 = new CuentaCorriente (cliente2, 1700);
        cuenta1.depositar(1800);
        cuenta1.depositar(2200);
        cuenta1.retirar(350);
        cuenta2.retirar(500);

        System.out.println(cuenta1.cobrarComisiones());
        System.out.println(cuenta2.cobrarComisiones());
        System.out.println();
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        
    }    
}
