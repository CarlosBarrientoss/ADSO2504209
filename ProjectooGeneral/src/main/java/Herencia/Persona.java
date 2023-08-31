
package Herencia;

public class Persona {
    
    protected String nombre;
    protected char genero;
    protected String direccion;
   
    
    public Persona(){
        
    }
    
      public Persona(String nombre){
          this.nombre = nombre;
}
          
      

    public Persona(String name, char genero, String direccion) {
        this.nombre = name;
        this.genero = genero;
        this.direccion = direccion;
    }

    public String getName() {
        return this.nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + nombre + ", genero=" + genero + ", direccion=" + direccion + '}';
    }
    
    

    
  
    
}