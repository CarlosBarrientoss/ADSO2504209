package Herecia;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(int idEmpleado, double sueldo, int contadorEmpleado, String nombre){
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public int getIdEmpleado(){
        return idEmpleado;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public int getContadorEmpleado(){
        return contadorEmpleado;
    }
    public void setContadorEmpleado(){
        this.contadorEmpleado = contadorEmpleado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", Persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
