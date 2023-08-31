package herencia;

public class Persona {
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String dirrecion;

    public Persona (){}
    
    public Persona(String nombre){
        
    }
    
    public Persona(String nombre, char genero, int edad, String dirrecion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.dirrecion = dirrecion;
    }

    public String getNombre() {
        return nombre;
    }


    public char getGenero() {
        return genero;
    }


    public int getEdad() {
        return edad;
    }


    public String getDireccion() {
        return dirrecion;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", genero=" + genero + ", dirrecion=" + dirrecion + "]";
    }
    



}
