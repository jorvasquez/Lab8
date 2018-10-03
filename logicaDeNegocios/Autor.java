package logicaDeNegocios;


/**
 * Write a description of class Autor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Autor
{
  // instance variables - replace the example below with your own
  private String nombre;
  private String nacionalidad="";
  private int identificador = 0;
  private static int scontadorDeIdentificadores = 0;
    
  public Autor(String pNombre, String pNac, int pIdentificador)
  {
    // initialise instance variables
    setNombre(pNombre);
    setNacionalidad(pNac);
    setIdentificador(scontadorDeIdentificadores);
    scontadorDeIdentificadores++;
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
    Autor autor= (Autor) o;
    return (this.nombre.equals(autor.getNombre()) && this.nacionalidad.equals(autor.getNacionalidad()));
  }
  /**
  * An example of a method - replace this comment with your own
  * 
  * @param  y   a sample parameter for a method
  * @return     the sum of x and y 
  */
  public String toString(){
    String msg="";
    msg+="Nombre: "+nombre+'\n';
    msg+="Nacionalidad: "+nacionalidad+'\n';
    msg+="Identificador: "+identificador+'\n';

    return msg;
    }
  private void setNombre(String pNombre){
    nombre = pNombre;
    }
        
  private void setNacionalidad(String pNac){
    nacionalidad = pNac;
    }
    
  private String getNombre(){
    return nombre;
  }
    
  private String getNacionalidad(){
    return nacionalidad;
  }
  private void setIdentificador(int pIdentificador){
    identificador=pIdentificador;
  }
  private int getIdentificador(){
    return identificador;
  }
}
