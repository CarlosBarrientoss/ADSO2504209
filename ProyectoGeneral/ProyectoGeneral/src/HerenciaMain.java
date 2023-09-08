import java.util.Date;

import herencia.Cliente;
import herencia.Empleado;
import herencia.Persona;

public class HerenciaMain {

    public static void main(String[] args) {
        System.out.println("");

        Persona persona1 = new Persona(" Aldolfo Hittler ");
        System.out.println("Persona 1: " + persona1.getNombre());
        System.out.println("Persona 1: " + persona1);

        System.out.println("--------------------------------");

        Persona persona2 = new Persona(" Caballero de Geminis ", 'M', " Debajo de mi cama ");
        System.out.println("Persona 2: " + persona2);

        System.out.println("------------------------------");

        Empleado empleado1 = new Empleado("Adolfo", 350000);
        System.out.println("Empleado 1: " + empleado1);

        System.out.println("");

        Cliente cliente1 = new Cliente("German Garmendia", 'M', "Robando casas", new Date(), false);
        System.out.println("Cliente 1 : " + cliente1);

        System.out.println("------------------------------");

        Cliente cliente2 = new Cliente("Yamete Kudasai ", 'F', " En jupiter", new Date(), true);
        System.out.println("Cliente 2: " + cliente2);

        System.out.println("");
    }

}
