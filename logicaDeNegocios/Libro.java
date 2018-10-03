package logicaDeNegocios;
import java.util.ArrayList;

/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String editorial;
    private int annoPublicacion;
    private int identificador;
    private int cantidadEjemplares=1;
    private ArrayList<Autor> autores;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String pNombre,int identificador,Autor pAutor)
    {
      // initialise instance variables
      setNombre(pNombre);
      setIdentificador(identificador);
      autores.add(pAutor);
    }
  public void agregarAutor(Autor pAutor){
    for(int n=0; n<autores.size();n++){
      if (pAutor.equals(autores.get(n))){
          return;
      }
      }
    autores.add(pAutor);
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
    Libro libro= (Libro) o;
    return (this.nombre.equals(libro.getNombre()) && this.annoPublicacion==libro.getAnnoPublicacion()
    &&  this.editorial.equals(libro.getEditorial()));
  }

  /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private void setNombre(String pNombre){
       nombre = pNombre;
    }
    
  public String toString(){
    String msg="";
    msg+="Nombre del libro:"+nombre+'\n';
    msg+="Editorial:"+editorial+'\n';
    msg+="Año de publicacion:"+annoPublicacion+'\n';
    msg+="Identificador"+identificador+'\n';
    msg+="Cantidad de ejemplares:"+cantidadEjemplares+'\n';
    for(int n=0; n<autores.size();n++){
      msg+="Autor #"+n+": "+autores.get(n).toString();
    }    
    return msg;
    }
    public void setEditorial(String pEditorial){
        editorial = pEditorial;
    }
    
    public void setAnnoPublicacion(int pAnnoPub){
        annoPublicacion = pAnnoPub;
    }
    
    public void setCantidadEjemplares(int pCantEjem){
        cantidadEjemplares = pCantEjem;
    }
        
    
    public String getNombre(){
        return nombre;
    }
    
    public String getEditorial(){
      return editorial;
    }
    
    public int getAnnoPublicacion(){
        return annoPublicacion;
    }
    public void setIdentificador(int pIdentificador){
      identificador=pIdentificador;
    }
    public int getIdentificador(){
        return identificador;
    }
    
    public int getCantidadEjemplares(){
        return cantidadEjemplares;
    }
}
