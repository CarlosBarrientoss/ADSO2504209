package herencia;

public class Persona {

    protected String nombre;
    protected char genero;
    protected String dirreccion;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, String dirreccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.dirreccion = dirreccion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", genero=").append(genero);
        sb.append(", dirreccion='").append(dirreccion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
