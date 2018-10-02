package aplicacion;
import logicaDeNegocios.Cliente;
import logicaDeNegocios.Cuenta;

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
        Cliente cliente1 = new Cliente ("134","Bryan","Rojas");
        Cliente cliente2 = new Cliente ("356","Alberto","Hernandez");
        Cuenta cuenta1 = new Cuenta (cliente1, 3500);
        Cuenta cuenta2 = new Cuenta (cliente2, 1700);
        cuenta1.depositar(1700);
	cuenta1.depositar(2200);
	cuenta1.retirar(500);
	cuenta2.retirar(400);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
    }    
}
