package logicaDeNegocios;
//import java.util.*;
import java.text.*;
import java.util.Date.*;
import java.sql.*;


/**
 * Write a description of class Prestamo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prestamo
{
    // instance variables - replace the example below with your own
    private Date fechaPrestamo;
    private Date fechaEntrega;
    
    /**
     * Constructor for objects of class Prestamo
     */
    public Prestamo()
    {
        // initialise instance variables
        setFechaPrestamo(pFPrest);
        setFechaEntrega(pFEntr);
        //Formato debe estar en ss-MM-yyyy
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private void setFechaPrestamo(String pFPrest){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String dateInString = pFPrest;
        try {
             Date date = formatter.parse(dateInString);
             per.setFecha_nacimiento(date);
        } catch (ParseException e) {
             e.printStackTrace();
        }
    }
    private void setFechaEntrega(String pFEntr){
        //pFEntr
    }
}
