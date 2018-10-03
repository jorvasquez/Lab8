package logicaDeNegocios;
import java.util.ArrayList;

/**
* Write a description of class Biblioteca here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Biblioteca
{
private String nombre;
private ArrayList<Cliente> clientes;
private ArrayList<Libro> libros;
private ArrayList<Autor> autores;
/**
* Constructor for objects of class Biblioteca
*/
public Biblioteca(String pNombre)
{
  clientes=new ArrayList<Cliente>();
  setNombre(pNombre);
}
public void setNombre(String pNombre){
  nombre=pNombre;
}
public String getNombre(){
  return nombre;
}
public void registrarLibro(int pIdentificador ){

}
}

