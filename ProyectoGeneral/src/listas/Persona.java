package listas;

public class Persona {
    
    private long id;
    private String nombre;
    private long telefono;
    private String correo;
    public static int cantidadPersona = 0;
    
    public Persona() {
        this.id = ++Persona.cantidadPersona;
    }

    public Persona(String nombre, long telefono, String correo) {
        
        this(); //Llama al constructor vacio
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public long getId (){
        return id;
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
        final StringBuilder sb = new StringBuilder("Persona \n");
        sb.append("id= ").append(id).append("\n");
        sb.append("nombre= ").append(nombre).append("\n");
        sb.append("telefono= ").append(telefono).append("\n");
        sb.append("correo= ").append(correo).append('\n');
        sb.append('\n');
        return sb.toString();
    }

    public static void main(String[] args) {
        var persona1 = new Persona("Joshua", 314150427, "joshuaavenver2011@gmail.com");
        System.out.println("persona1 = " + persona1);
    
    }
}
