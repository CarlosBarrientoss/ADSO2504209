import herencia.Cliente;
import herencia.Empleado;
import herencia.Persona;

import java.util.Date;

public class HerenciaPrincipal {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Elon Musk");
        System.out.println("persona1 = " + persona1);
        System.out.println();

        Persona persona2 = new Persona("Nicola Tesla", 'M', "Australia");
        System.out.println("persona2 = " + persona2);
        System.out.println();

        Empleado empleado1 = new Empleado("Jeff", 1000000.00);
        System.out.println("empleado1 = " + empleado1);
        System.out.println();

        Cliente cliente1 = new Cliente("Mario",'M',"Colombia",new Date(),true);
        System.out.println("cliente1 = " + cliente1);
    }
}
