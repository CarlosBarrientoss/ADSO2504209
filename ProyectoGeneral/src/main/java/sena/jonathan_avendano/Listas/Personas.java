package sena.jonathan_avendano.Listas;

public class Personas {
    private int id;
    private String nombre;
    private long telefono;
    private String correo;
    private static int cantidadPersonas = 0;

    public Personas(){
        this.id = ++Personas.cantidadPersonas;

    }
    public Personas(String nombre, long telefono, String correo){
        this();
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
    public int getId(){
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public long getTelefono(){
        return telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo(){
        return correo;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Personas persona = new Personas("Tatan", 456787688, "duoa@gmail.com");
    }
}
