package estructura_de_datos;

public class Persona {
    private String nombre;
    private int cedula;
    private double sueldo;
    private long celular;
    private char genero;

    public Persona(String nombre, int cedula, double sueldo, long celular, char genero){
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.celular = celular;
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
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
                ", cedula=" + cedula + '\'' +
                ", cedula=" + cedula + '\'' +
                ", cedula=" + cedula + '\'' +
                ", genero=" + genero +
                '}';
    }
}
