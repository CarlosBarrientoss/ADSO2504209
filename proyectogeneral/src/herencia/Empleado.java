package herencia;

public class Empleado extends  Persona {

public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpledo=++contadorEmpleado;
    }
 
 private int idEmpledo;
 private double sueldo;
 private static int contadorEmpleado;
 
public int getIdEmpledo() {
    return idEmpledo;
}
public double getSueldo() {
    return sueldo;
}
public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpledo=").append(idEmpledo);
        sb.append(", sueldo=").append(sueldo);
                sb.append(", Persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
