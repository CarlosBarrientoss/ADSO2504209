package listas;

public class Personas {
    private int id;
    private String nombre;
    private long telefono;
    private String correo;
    private static int contadorPersona = 0;

    public Personas(){
        this.id = ++Personas.contadorPersona;
    }

    public Personas(String nombre, long telefono, String correo){
        this();//llama al constructor vacio
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Long getTelefono(){
        return telefono;
    }
    public void setTelefono(long telefono){
        this.telefono = telefono;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personas{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", telefono=").append(telefono);
        sb.append(", correo=").append(correo);
        sb.append('}');
        return sb.toString();
    }
    public static void main(String[] args) {
        Personas persona = new Personas("Gabriel",324234244 , "duarte@gmail.com");
    }
}
