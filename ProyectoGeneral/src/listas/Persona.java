package listas;

import matrices.Personas;

public class Persona {

    private int id;
    private String nombre;
    private long telefono;
    private String correo;
    private static int catidadPersona = 0;

    public Persona (){
        this.id = ++Persona.catidadPersona;
    }

    public Persona(String nombre, long telefono, String correo) {
        this();//Llama al constructor vacio
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", telefono=").append(telefono);
        sb.append(", correo='").append(correo).append('\'');
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {

        var persona1 = new Persona("Jose Mendoza", 312341933, "josda3008@hmail.com");
        System.out.println("Dirreccion de memoria: " + persona1);

        var persona2 = new Persona("Joshua Avendaño", 32165498, "Joshua@gmail.com");
        System.out.println("Dirreccion de memoria: " + persona2);
    }
}
