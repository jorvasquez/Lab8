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
    private String nacionalidad;
    private int identificador = 0;
    
    public Autor(String pNombre, String pNac, int pIdentificador)
    {
        // initialise instance variables
        setNombre(pNombre);
        setNacionalidad(pNac);
        identificador++;
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
        
    private void setNacionalidad(String pNac){
        nacionalidad = pNac;
    }
    
    private String getNombre(){
        return nombre;
    }
    
    private String getNacionalidad(){
        return nacionalidad;
    }
    
    private int getIdentificador(){
        return identificador;
    }
}
