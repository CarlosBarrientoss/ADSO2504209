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

    public int getIdEmpleadi() {
        return this.idEmpleado;
    }

    public double getSuedlo() {
        return sueldo;
    }

    public void setSuedlo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", persona=").append(super.toString());
        sb.append("}");
        return sb.toString();
    }

}
