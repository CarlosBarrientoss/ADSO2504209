package herencia;

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado( double sueldo, String nombre) {
        super(nombre);
        this.sueldo = sueldo;
  
        this.idEmpleado = ++Empleado.contadorEmpleado;

    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public static void setContadorEmpleado(int aContadorEmpleado) {
        contadorEmpleado = aContadorEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
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
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", Persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }


}
