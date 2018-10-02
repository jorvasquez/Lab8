package logicaDeNegocios;
import java.util.*;


/**
 * La clase es clase extendida de la clase Cuenta
 * Esta se encarga de definir una cuenta de corriente para de esta manera 
 * diferenciarla de la super clase cuenta.
 * @author Mariell S Sanchez Peraza 
 * @version 19/09/2018
 */
public class CuentaCorriente extends Cuenta
{
    // instance variables - replace the example below with your own
    private static int scantCuentas = 0;
    private int operacionesExentas;
    private double cuotaOperaciones;

    /**
     * Constructor de la clase CuentaCorriente
     */
    public CuentaCorriente(Cliente pDuenio, double pMonto)
    {
        super ( "Cuenta Corriente", ++scantCuentas, pDuenio, pMonto );
	setOperacionesExentas(30);	//operaciones exentas por omisión
	setCuotaOperaciones(30);	//Cuota por operaciones por omisión
        // initialise instance variables
        //x = 0;
    }

    public String cobrarComisiones() 
    /** Hace un cobro de la comicion realizada
     * 
     */
    {
	String msg = " ";
	int operacNoExentas;
	double monto;
	Calendar calendario = Calendar.getInstance();
	int dia = calendario.get(Calendar.DAY_OF_MONTH);
	if ( dia == 1 ) {
		operacNoExentas = numOperaciones - getOperacionesExentas();
		if (operacNoExentas > 0) {
			monto = getCuotaOperaciones() * operacNoExentas;
			retirar(monto);
			msg = " Se cobró por comisión : " +monto;
		}
		numOperaciones = 0; // Se reinicia para el mes siguiente 
	}
	return msg;
    }

    
    private int getCantCuentas()
    /** Devuelve la cantidad de cuentas
     * 
     */
    {
        return scantCuentas;
    }
    
    private int getOperacionesExentas()
    /** Devuelve la cantidad de operaciones exentas
     * 
     */
    {
        return operacionesExentas;
    }
    
    private void setOperacionesExentas(int pValor)
    /** Fija la cantidad de operaciones exentas
     * 
     */
    {
        operacionesExentas = pValor;
    }
    
    private void setCuotaOperaciones(int pValor)
    /** Fija la cuota de operaciones 
     */
    {
        cuotaOperaciones = pValor;
    }

    private double getCuotaOperaciones()
    /** Devuelve la cantidad de cuota de operaciones 
     */
    {
        return cuotaOperaciones;
    }
}
