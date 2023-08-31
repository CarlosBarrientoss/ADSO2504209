package herencia;

public class Persona {
    
    protected String nombre;
    protected char genero;
    protected String direccion;
    
    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.direccion = direccion;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Persona{" + "nombre=" + this.nombre + ", genero=" + this.genero + ", direccion=" + this.direccion + '}';
    }

    
    
    
}