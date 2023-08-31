package herencia;

public class Empleado extends Persona {

    private static int contadorEmpleado = 0;
    private int idEmpleado;
    private double sueldo;    

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
