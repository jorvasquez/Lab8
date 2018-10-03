package logicaDeNegocios;
//import java.util.*;
import java.text.*;
import java.util.*;


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
    private Libro libro;
  /**
   * Constructor for objects of class Prestamo
   */
  
  public Prestamo(Libro pLibro)
  {
    // initialise instance variables
    setFechaPrestamo();
    setFechaEntrega();
    setLibro(pLibro);
    //Formato debe estar en ss-MM-yyyy
  }
  public String toString(){
    String msg="";
    msg+="Fecha Entrega:"+getFechaEntrega()+'\n';
    msg+="Fecha Prestamo:"+getFechaPrestamo()+'\n';
    msg+="Libro:\n";
    msg+=libro.toString()+'\n';
    return msg;
   }
  public Libro getLibro(){
      return libro; 
  }
  public void setLibro(Libro pLibro){
      libro=pLibro; 
  }
  public void setFechaPrestamo() {
    Calendar calendario;
    calendario = Calendar.getInstance();
    fechaPrestamo =(Date) calendario.getTime();
  } 
  public String getFechaPrestamo() {
    SimpleDateFormat mascara=new SimpleDateFormat("dd/MM/yy");
   return mascara.format(fechaPrestamo);
  }
  public String getFechaEntrega() {
    SimpleDateFormat mascara=new SimpleDateFormat("dd/MM/yy");
    return mascara.format(fechaPrestamo);
  }
  public Date getFechaEntregaDate() {
    return fechaEntrega;
  }
  private void setFechaEntrega(){
    Calendar calendar = Calendar.getInstance();	
    calendar.setTime(fechaPrestamo); // Configuramos la fecha que se recibe	
    calendar.add(Calendar.DAY_OF_YEAR,15);  // numero de días a añadir, o restar en caso de días<0
    fechaEntrega=(Date) calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
  }
}
