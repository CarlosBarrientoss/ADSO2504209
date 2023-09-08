package estructura_de_datos;

public class Persona {
    private String nombre;
    private int cedula;
    private int sueldo;
    private int celular;
    private char genero;

    public Persona(String nombre, int cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getCedula(){
        return cedula;
    }
    public void setCedula(int cedula){
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", cedula=" + cedula +
                '}';
    }
}
