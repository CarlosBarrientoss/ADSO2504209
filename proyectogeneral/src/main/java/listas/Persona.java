
package listas;


public class Persona {
    private int id;
    private String nombre;
    private long telefono;
    private String correo;
    private static int cantidadPersona=0;
    
    public Persona(){
        this.id=++Persona.cantidadPersona;
    }
    
    public Persona(String nombre, long telefono, String correo){
        this();
        this.nombre=nombre;
        this.telefono=telefono;
        this.correo=correo;
        
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
    public void setCorreo(String correo){
        this.correo=correo;
    }

    public static void main(String[] args) {
        var persona1=new Persona("jhon", 313359296, "jjgalvis439@gmail.com");
        System.out.println("direccion en memoria= " + persona1);
        
        var persona2=new Persona("jhon", 313345976, "jjgalvis439@gmail.com");
        System.out.println("direccion en memoria= " + persona1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", telefono=").append(telefono);
        sb.append(", correo=").append(correo);
        sb.append(", correo=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    

    
}
