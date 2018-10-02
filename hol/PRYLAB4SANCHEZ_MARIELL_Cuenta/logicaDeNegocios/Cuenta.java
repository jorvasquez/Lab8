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
    private Cliente duenio = null;
    private double saldo = 0;
    private static int sCantCuentas = 0;
    private Date fechaCreacion;
    private ArrayList<Operacion> operaciones;
    private int numOperaciones = 0;
    

    //Constructor for objects of class Cuenta
    public Cuenta (Cliente pDuenio,double pMonto){
        operaciones = new ArrayList<Operacion>();
        sCantCuentas++;
        setNumCuenta(sCantCuentas);
        depositar(pMonto);
        setDuenio(pDuenio);
        setFechaCreacion();
    }

    //Metodos
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int pNumCuenta) {
        numCuenta = pNumCuenta;
    }
    
    public String depositar(double pMonto) {
        saldo += pMonto;
        Operacion nuevaOperacion = new Operacion (++numOperaciones,"deposito",pMonto);
        operaciones.add(nuevaOperacion);
        return "El saldo actual es: "+ saldo;
    }
    
    private boolean validarRetiro(double pMonto) {
        return pMonto <= saldo;
    }
    
    public String retirar( double pMonto ) {
        if(validarRetiro(pMonto)){
            saldo -= pMonto;
            Operacion nuevaOperacion= new Operacion(++numOperaciones,"retiro", pMonto);
            operaciones.add(nuevaOperacion); 
            return "Saldo actual: "+saldo;
            } else{
        return "No tiene suficiente dinero";
        }
    }
    
    public String toString() {
        String msg;
        msg = "Cuenta Numero: " + getNumCuenta() + "\n";
        msg += "Fecha Creacion: " + getFechaCreacion() + "\n";
        msg += duenio.toString();
        msg += "Saldo: " + getSaldo() + "\n";
        msg += "Registro de Operaciones" + "\n";
    msg += "Número"+ "Fecha" + "Operación" + "Monto"+"\n";
    for ( int i = 0; i < operaciones.size(); i++ )
    {
       Operacion unaOp= (Operacion) operaciones.get(i); 
       msg += unaOp.toString();
    }
        return msg;
    }

    public Cliente getDuenio(){
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
    
    public void setDuenio(Cliente pCliente){
        duenio = pCliente;
    }

    public String getFechaCreacion(){
        SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
        return mascara.format(fechaCreacion);
    }
    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        if (o == null){
            return false;
        }
        if (this.getClass() != o.getClass()){
            return false;
        }
        Cuenta cuenta = (Cuenta) o;
        return this.numCuenta == cuenta.getNumCuenta();
    }
}
