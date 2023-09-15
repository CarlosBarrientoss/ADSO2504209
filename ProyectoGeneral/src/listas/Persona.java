public class Persona {
    private int id;
    private String nombre;
    private long telefono;
    private String correo;
    private static int cantidadPersona = 0;

    public Persona() {
        this.id = ++Persona.cantidadPersona;
    }

    public Persona(String nombre, long telefono, String correo) {
        this();
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId() {
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
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", telefono=").append(telefono);
        sb.append(", correo=").append(correo);
        sb.append(", =").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Luis", 3213123, "luis@gmail.com");

        System.out.println(persona1);
    }

    
}
