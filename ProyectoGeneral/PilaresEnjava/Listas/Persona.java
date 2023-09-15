package Listas;

public class Persona {
    
  private int id;
  private String nombre;
  private long telefono;
  private String correo;

  private static int cantidadPersonas = 0;
  
  public Persona () {
    this.id = ++Persona.cantidadPersonas;
  }

  public Persona(String nombre, long telefono, String correo){

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
        sb.append('}');
        return sb.toString();
    }
    public static void main(String[] args) {
        
        var persona1 = new Persona("Hittler", 3232679, "gekei@gmail.com");
        System.out.println("Direccion en memorias: " + persona1);
    
    }
}   