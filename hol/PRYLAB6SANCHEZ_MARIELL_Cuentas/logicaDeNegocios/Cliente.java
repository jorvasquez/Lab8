package logicaDeNegocios;


/**
 * La clase Cliente se encarag de asignarle un dueño a la cuenta
 * @author Mariell S Sanchez Peraza 
 * @version 19/09/2018
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
    * Fija la cedula del cliente
    */
      public void setCedula(String pCedula)
    {
        cedula = pCedula;
    }
    
    public void setNombre(String pNombre)
    /**
    * Fija el nombre del cliente
    */    
    {
        nombre = pNombre;
    }
    
    public void setApellido(String pApellido)
    /**
    * Fija el apellido del cliente
    */
    {
        apellido = pApellido;
    }
    
    public String getCedula()
    /**
    * Devuelve la cedula del cliente
    */
    {
        return cedula;
    }
    
    public String getNombre()
    /**
    * Devuelve el nombre del cliente
    */
    {
        return nombre;
    }
    
    public String getApellido()
    /**
    * Devuelve el apellido del cliente
    */
    {
        return apellido;
    }
    
    public String toString()
    /** Imprime en pantalla la informacion
     * 
     */
    {
        String msg = "";
        msg = "Cedula:  "+getCedula()+"\n";
        msg += "Nombre:  "+getNombre()+" "+getApellido()+"\n";
        return msg;
    }
    public boolean equals(Object o)
    /** Verifica que ningun objeto se repita
     * 
     */
    {
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
