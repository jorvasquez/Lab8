package logicaDeNegocios;


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
  public Cliente(String pNombre, String pCedula, String pDireccion)
  {
    setNombre(pNombre);
    setCedula(pCedula);
    setDireccion(pDireccion);  
  }
  public void registrarNuevoPrestamo(Libro pLibro){
    
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
