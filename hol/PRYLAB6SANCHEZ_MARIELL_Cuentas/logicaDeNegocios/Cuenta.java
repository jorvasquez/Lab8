package logicaDeNegocios;
import java.util.*;
import java.text.*;

/**
 * Es la super clase o clase padre de CuentaCorriente y CuentaAhorro 
 * @author Mariell S Sanchez Peraza 
 * @version 19/09/2018
 */
 
public abstract class Cuenta
{
    // instance variables - replace the example below with your own
    protected String tipoCuenta;
    protected int numCuenta = 0;
    protected Cliente duenio = null;
    protected double saldo = 0;
    protected Date fechaCreacion;
    protected ArrayList<Operacion> operaciones;
    protected int numOperaciones = 0;
    
    //Constructor for objects of class Cuenta
    public Cuenta (String pTipoCuenta, int pNumero,Cliente pDuenio,double pMonto)
    /** Constructor de la clase Cuenta
     * 
     */
    {
        setTipoCuenta (pTipoCuenta);
        operaciones = new ArrayList<Operacion>();
        depositar(pMonto);
        setDuenio(pDuenio);
        setFechaCreacion();
    }

    //Metodos
    
    /** Permite que CuentaCorriente y CuentaAhorro
     * 
     */
    public abstract String cobrarComisiones();
    
    
    /** Devuelve el tipo de cuenta
     * 
     */
    public String getTipoCuenta(){
        return tipoCuenta;
    }
    
    public void setTipoCuenta (String pTipoCuenta)
    /** Fija el tipo de cuenta
     * 
     */
    {
        this.tipoCuenta = pTipoCuenta;
    }
    
    public int getNumCuenta() 
    /** Devuelve el numero de cuenta
     * 
     */
    {
        return numCuenta;
    }

    public void setNumCuenta(int pNumCuenta) 
    /**Fija el numero de cuenta
     * 
     */
    {
        numCuenta = pNumCuenta;
    }
    
    public String depositar(double pMonto) 
    /**Metodo para fijar el monto del deposito
     * 
     */
    {
        saldo += pMonto;
        Operacion nuevaOperacion = new Operacion (++numOperaciones,"deposito",pMonto);
        operaciones.add(nuevaOperacion);
        return "El saldo actual es: "+ saldo;
    }
    
    private boolean validarRetiro(double pMonto)
    /**
     * Valida que el 
     */
    {
        return pMonto <= saldo;
    }
    
    public String retirar( double pMonto ) 
    /** Se asegura que el monto a retirar sea menor que el dinero en la cuenta
     * 
     */
    {
        if(validarRetiro(pMonto)){
            saldo -= pMonto;
            Operacion nuevaOperacion= new Operacion(++numOperaciones,"retiro", pMonto);
            operaciones.add(nuevaOperacion); 
            return "Saldo actual: "+saldo;
            } else{
                return "No tiene suficiente dinero";
        }
    }
    
    public String toString() 
    /** Imprime en pantalla la informacion
     * 
     */
    {
        String msg;
        msg = "Cuenta Numero: " + getNumCuenta() + "\n";
        msg = "Tipo: " + getTipoCuenta() + "\n";
        msg += "Fecha Creacion: " + getFechaCreacion() + "\n";
        msg += duenio.toString();
        msg += "Saldo: " + getSaldo() + "\n";
        msg += "Registro de Operaciones" + "\n";
        msg += "Número"+ "\t" + "\t" +"Fecha" + "\t" +"\t" + "Operación" + "\t" +"Monto"+"\n";
        for ( int i = 0; i < operaciones.size(); i++ )
        {
           Operacion unaOp= (Operacion) operaciones.get(i); 
           msg += unaOp.toString();
        }
        return msg;
    }

    public Cliente getDuenio()
    /** Devuelve el nombre del dueno
     * 
     */
    {
        return duenio;
    }
    
    public double getSaldo()
    /** Devuelve el saldo de la cuenta
     * 
     */
    {
        return saldo;
    }
    
    public void setFechaCreacion()
    /** Fija la fecha de creacion
     * 
     */{
        Calendar calendario;
        calendario = Calendar.getInstance();
        fechaCreacion = calendario.getTime();
    }
    
    public void setDuenio(Cliente pCliente)
    /** Fija el nombre del dueno
     * 
     */
    {
        duenio = pCliente;
    }

    public String getFechaCreacion()
    /** Devuelve ela fecha de creacion
     * 
     */
    {
        SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
        return mascara.format(fechaCreacion);
    }
    
    public boolean equals(Object o)
    /** Verifica que ningun objeto se repita
     * 
     */
    {
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
