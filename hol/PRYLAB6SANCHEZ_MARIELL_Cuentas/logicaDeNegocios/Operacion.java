package logicaDeNegocios;
import java.util.*;
import java.text.*;

/**
 * La clase operacion lleva un control de las 
 * operaciones que realiza el clientr
 * @author Mariell S Sanchez Peraza 
 * @version 19/09/2018
 */
public class Operacion
{
    // instance variables - replace the example below with your own
    private int numero;
    private String tipo;
    private double monto;
    private Date fechaOperacion;

    /**
     * Constructor for objects of class Operacion
     */
    public Operacion(int pNumero, String pTipo, double pMonto)
    {
        // initialise instance variables
        setNumero(pNumero);
        setTipo(pTipo);
        setMonto(pMonto);
        setFechaOperacion();
    }
    public void setNumero(int pNumero)
    /** Fija el numero de operaciones
     * 
     */
    {
        numero = pNumero;
    }
    public void setTipo(String pTipo)
    /** Fija el tipo de operacion
     * 
     */
    {
        tipo = pTipo;
    }
    public void setMonto(double pMonto)
    /** Fija el monto de la operacion
     * 
     */
    {
        monto = pMonto;
    }
    public void setFechaOperacion()
    /** Fija la fecha de la operaciones
     * 
     */
    {
        Calendar calendario;
        calendario = Calendar.getInstance();
        fechaOperacion = (Date) calendario.getTime();
    }
    public int getNumero()
    /** Devuelve el numero de operaciones
     * 
     */
    {
        return numero;
    }
    public String getTipo()
    /** Devuelve el tipo de operacion
     * 
     */
    {
        return tipo;
    }
    public double getMonto()
    /** Devuelve el monto
     * 
     */
    {
        return monto;
    }
    public String getFechaOperacion()
    /** Devuelve la fecha de operacion
     * 
     */
    {
        SimpleDateFormat mascara=new SimpleDateFormat("dd/MM/yy");
        return mascara.format(fechaOperacion);
    }
    public  String toString()
    /** Imprime en pantalla la informacion
     * 
     */
    {
        String msg;
        msg = "\t"+getNumero()+"\t"+getFechaOperacion()+"\t"+getTipo()+"\t"+ getMonto()+"\t"+"\n";
	return msg;
	}
}
