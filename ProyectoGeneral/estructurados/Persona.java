package estructurados;

public class Persona {

    private String nombre;
    private int cedula;
    private double sueldo;
    private  long celular;
    private char genero;

    public Persona(String nombre, int cedula,double sueldo,long celular, char genero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.celular = celular;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula(){
        return cedula;
    }

    public void setCedula(int cedula){
        this.cedula = cedula;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append("cedula='").append(cedula).append('\'');
        sb.append("sueldo='").append(sueldo).append('\'');
        sb.append("celular='").append(celular).append('\'');
        sb.append("genero='").append(genero).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
