import Herencia.Cliente;
import Herencia.Empleado;
import Herencia.Persona;
import java.util.Date;

public class HerenciaPrincipal {

  public static void main(String[] args) {

    /*
     * Persona persona1 = new Persona("Elon Musk");
     * System.out.println("El nombre es " + persona1);
     * 
     * Persona persona2 = new Persona("RERR",'M',"Australia" );
     * System.out.println("Los datos son"+ persona2);
     */

    /*
     * Empleado empleado1 = new Empleado("Carlos", 121312);
     * System.out.println("empleado " + empleado1);
     * 
     * Empleado empleado2 = new Empleado("pepito perez", 2100000);
     * System.out.println("empleado2 " + empleado2);
     */

    Cliente cliente1 = new Cliente("Camilo Suarez", 'M', "calle 14", new Date(), "no");
    System.out.println("cliente1 = " + cliente1);

    Cliente cliente2 = new Cliente("Juan Garcia", 'F', "calle 12a", new Date(), "si");
    System.out.println("cliente2 = " + cliente2);
  }
}
