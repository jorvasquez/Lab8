package logicaDeNegocios;
import java.util.*;

/**
 * La clase es clase extendida de la clase Cuenta
 * Esta se encarga de definir una cuenta de ahorro para de esta manera 
 * diferenciarla de la super clase.
 * @author Mariell S Sanchez Peraza 
 * @version 19/09/2018
 */
public class CuentaAhorro extends Cuenta
{
    // instance variables - replace the example below with your own
    private static int scantCuentas = 0;
    private double cuotaMantenimiento;

    public CuentaAhorro(Cliente pDuenio, double pMonto )
    /** Constructor de la clase CuentaAhorro
     * 
     */
    {
        super ("Cuenta de Ahorro", ++scantCuentas, pDuenio, pMonto);
	setCuotaMantenimiento (300);//cuota de mantenimiento por omisión	
    } 
    
    public String cobrarComisiones() 
    /** Hace un cobro de la comicion realizada
     * 
     */
    {
        String msg = " ";
	Calendar calendario;
	calendario = Calendar.getInstance();
	int dia = calendario.get(Calendar.DAY_OF_MONTH);
	if (dia == 1) {
	    retirar(cuotaMantenimiento);
	    numOperaciones = 0; // Se reinicia para el mes siguiente 
	                       // el número de operaciones
	    msg = " Se cobró por comisión : " + cuotaMantenimiento;
	}
	return msg;
    }

    
    public double getcuotaMantenimiento()
    /** Devuelve la cuota de matenimiento
     * 
     */
    {    
        return cuotaMantenimiento;
    }
    
    public void setCuotaMantenimiento(int pCuota)
    /** Define/Fija la cuota de matenimiento
     * 
     */
    {
        cuotaMantenimiento = pCuota;
    }

    public int getCantCuentas()
    /** Devuelve la cantidad de cuentas
     * 
     */
    {
        return scantCuentas;
    }    

}    