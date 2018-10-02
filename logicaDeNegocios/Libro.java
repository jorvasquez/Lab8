package logicaDeNegocios;


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
    private int identificador = 0;
    private int cantidadEjemplares;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String pNombre, String pEditorial, int pAnnoPub, int pIdentificador, int pCantEjem)
    {
        // initialise instance variables
        setNombre(pNombre);
        setEditorial(pEditorial);
        setAnnoPublicacion(pAnnoPub);
        identificador++;
        setCantidadEjemplares(pCantEjem);
        

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
        
    private void setEditorial(String pEditorial){
        editorial = pEditorial;
    }
    
    private void setAnnoPublicacion(int pAnnoPub){
        annoPublicacion = pAnnoPub;
    }
    
    private void setCantidadEjemplares(int pCantEjem){
        cantidadEjemplares = pCantEjem;
    }
        
    
    private String getNombre(){
        return nombre;
    }
    
    private String getEditorial(){
        return editorial;
    }
    
    private int getAnnoPublicacion(){
        return annoPublicacion;
    }
    
    private int getIdentificador(){
        return identificador;
    }
    
    private int getCantidadEjemplares(){
        return cantidadEjemplares;
    }
}
