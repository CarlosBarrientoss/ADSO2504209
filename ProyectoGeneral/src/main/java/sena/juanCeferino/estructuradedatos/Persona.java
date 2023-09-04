package sena.juanCeferino.estructuradedatos;
public class Persona {
    private String nombre;
    private  int cedula;
    private int sueldo;
    private int celular;
    private int genero;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("""
                Persona(nombre: %s)
                """, nombre);
    }
}
