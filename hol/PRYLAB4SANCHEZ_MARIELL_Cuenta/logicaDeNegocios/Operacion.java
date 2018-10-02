package logicaDeNegocios;
import java.util.*;
import java.text.*;


/**
 * Write a description of class Operacion here.
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
    public void setNumero(int pNumero){
        numero = pNumero;
    }
    public void setTipo(String pTipo){
        tipo = pTipo;
    }
    public void setMonto(double pMonto){
        monto = pMonto;
    }
    public void setFechaOperacion(){
        Calendar calendario;
        calendario = Calendar.getInstance();
        fechaOperacion = (Date) calendario.getTime();
    }
    public int getNumero(){
        return numero;
    }
    public String getTipo(){
        return tipo;
    }
    public double getMonto(){
        return monto;
    }
    public String getFechaOperacion() {
        SimpleDateFormat mascara=new SimpleDateFormat("dd/MM/yy");
        return mascara.format(fechaOperacion);
    }
    public  String toString(){
        String msg;
        msg = "\t"+getNumero()+"\t"+getFechaOperacion()+"\t"+getTipo()+"\t"+ getMonto()+"\n";
	return msg;
	}
}
