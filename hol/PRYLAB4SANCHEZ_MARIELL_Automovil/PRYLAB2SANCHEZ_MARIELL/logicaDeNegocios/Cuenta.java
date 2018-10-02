package logicaDeNegocios;
import java.util.*;
import java.text.*;

/**
 *@author Mariell Sanchez Peraza
 * @version 14/08/2018 */
 
public class Cuenta
{
    // instance variables - replace the example below with your own
    private int numCuenta = 0;
    private String duenio = null;
    private double saldo = 0;
    private static int sCantCuentas = 0;
    private Date fechaCreacion;

    //Constructor for objects of class Cuenta
    public Cuenta (String pNombre,double pMonto){
        sCantCuentas++;
        setNumCuenta(sCantCuentas);
        depositar(pMonto);
        setDuenio(pNombre);
        setFechaCreacion();
    }

    //Métodos
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int pNumCuenta) {
        numCuenta = pNumCuenta;
    }
    
    public String depositar( double pMonto ) {
        saldo += pMonto;
        return "El saldo actual después del depósito es : "+ saldo;
    }
    
    private boolean validarRetiro( double pMonto ) {
        return pMonto <= saldo;
    }
    
    public String retirar( double pMonto ) {
        if( validarRetiro(pMonto) ) {
            saldo -= pMonto;
            return "El saldo actual después del retiro es : "+ saldo;
        }
        else
        return "No tiene suficiente dinero";
    }
    
    public String toString() {
        String msg;
        msg = "Cuenta Número: " + getNumCuenta() + "\n";
        msg += "Fecha Creación: " + getFechaCreacion() + "\n";
        msg += "Dueño: " + getDuenio() + "\n";
        msg += "Saldo: " + getSaldo() + "\n";
        return msg;
    }

    public String getDuenio(){
        return duenio;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setFechaCreacion(){
        Calendar calendario;
        calendario = Calendar.getInstance();
        fechaCreacion = calendario.getTime();
    }
    
    public void setDuenio(String pNombre){
        duenio = pNombre;
    }

    public String getFechaCreacion(){
        SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
        return mascara.format(fechaCreacion);
    }
}
