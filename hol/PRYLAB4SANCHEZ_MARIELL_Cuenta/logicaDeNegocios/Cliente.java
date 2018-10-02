package logicaDeNegocios;


/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private String cedula;
    private String nombre;
    private String apellido;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String pCedula, String pNombre, String pApellido)
    {
        // initialise instance variables
        setCedula(pCedula);
        setNombre(pNombre);
        setApellido(pApellido);
        }

    /**
    * An example of a method - replace this comment with your own
    */
   
    public void setCedula(String pCedula)
    {
        cedula = pCedula;
    }
    
    public void setNombre(String pNombre)
    {
        nombre = pNombre;
    }
    
    public void setApellido(String pApellido)
    {
        apellido = pApellido;
    }
    
    public String getCedula()
    {
        return cedula;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getApellido()
    {
        return apellido;
    }
    
    public String toString()
    {
        String msg = "";
        msg = "Cedula:  "+getCedula()+"\n";
        msg += "Nombre:  "+getNombre()+" "+getApellido()+"\n";
        return msg;
    }
    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        if (o == null){
            return false;
        }
        if (this.getClass() != o.getClass()){
            return false;
        }
        Cliente cliente = (Cliente) o;
        return this.cedula == cliente.getCedula();
    }
}
