package estructuradedatos;

public class Persona {

    private String nombre;
   /* private int cedula;
    private double sueldo;
    private int celular;
    private char genero;*/

    public Persona(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
}
