package listas;

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
        this();  // llama al constructor vacio (con eso llenamos el id)
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId() {
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
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", telefono=").append(telefono);
        sb.append(", correo=").append(correo);
        sb.append(", Espacio en memoria=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    // public static void main(String[] args) {
    //     // Metodo main creado solo con propositos de prueba
    //     Persona persona1 = new Persona("Roberto", 123123, "asdasd");
    //     Persona persona2 = new Persona("Antonio", 99999, "tyututyu");

    //     System.out.println(persona1);
    //     System.out.println(persona2);
    // }

}
