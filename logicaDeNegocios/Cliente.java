package logicaDeNegocios;
import java.util.*;

/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
  private String cedula;
  private String nombre;
  private String direccion;
  private ArrayList<Prestamo> prestamos;
  public Cliente(String pNombre, String pCedula, String pDireccion)
  {
    setNombre(pNombre);
    setCedula(pCedula);
    setDireccion(pDireccion);  
    prestamos=new ArrayList<>();
  }
   public boolean equals(Object o){
    if (o==this){
      return true;
    }
    if (o==null){
      return false;
    }
    if (this.getClass()!=o.getClass()){
      return false;
    }
    Cliente cliente= (Cliente) o;
    return (this.cedula.equals(cliente.getCedula()));
  }
  public void registrarNuevoPrestamo(Libro pLibro){
    Prestamo prestamo= new Prestamo(pLibro);
    prestamos.add(prestamo);
   }
  public String consultarLirosConAtraso(){
    if(prestamos!=null){
      Date fechaEntrega;
      String msg="Prestamos con atraso:\n";
      for(int n=0; n<prestamos.size();n++){
          fechaEntrega=prestamos.get(n).getFechaEntregaDate();
          if (fechaEntrega.compareTo(obtenerFechaActual())>0){//si no lo registra entonces en con <0
             msg+=prestamos.get(n).toString();
          }
       }
      if (msg.equals("Prestamos con atraso:\n")){
        return "No hay prestamos con atraso";
       }
      return msg;
    }
    return "No hay prestamos de libros pendientes";
  }
  public Date obtenerFechaActual(){
    Date fechaActual;
    Calendar calendario;
    calendario = Calendar.getInstance();
    fechaActual =(Date) calendario.getTime();
    return fechaActual;
  }
  public void setCedula(String pCedula){
    cedula=pCedula;
  }
  public String getCedula(){
    return cedula; 
  }
  public void setNombre(String pNombre){
    nombre=pNombre;
   }
  public String getNombre(){
    return nombre; 
   }
  public void setDireccion(String pDireccion){
    direccion=pDireccion;
   }
  public String getDireccion(){
    return direccion; 
   }
}
