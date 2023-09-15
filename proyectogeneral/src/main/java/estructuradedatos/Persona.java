package estructuradedatos;

public class Persona {

    private String nombre;
    private int cedula;
    private double sueldo;
    private int celular;
    private char genero;

    public Persona(String nombre, int cedula, double sueldo, int celular, char genero){
        this.nombre=nombre;
        this.cedula=cedula;
        this.sueldo=sueldo;
        this.celular=celular;
        this.genero=genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCedula() {
        return cedula;
    }
    
    public void setCedula(int cedula){
        this.cedula=cedula;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
////        sb.append("nombre=").append(cedula);
        sb.append("nombre=").append(sueldo);
        sb.append("nombre=").append(celular);
        sb.append("nombre=").append(genero);
        sb.append('}');
        return sb.toString();
    }
    
    
}
