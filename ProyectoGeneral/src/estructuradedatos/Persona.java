package estructuradedatos;

public class Persona {
    private String nombre;
    private int cedula;
    private double sueldo;
    private int celular;
    private char genero;    

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int cedula, double sueldo, int celular, char genero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.celular = celular;
        this.genero = genero;
    }    

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return this.cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCelular() {
        return this.celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", cedula=").append(cedula);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", celular=").append(celular);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
    
    
}
