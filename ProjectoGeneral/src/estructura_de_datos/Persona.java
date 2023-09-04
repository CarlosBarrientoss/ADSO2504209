package estructura_de_datos;

public class Persona {
    private String nombre;
    private int cedula;
    private int sueldo;
    private int celular;
    private char genero;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
