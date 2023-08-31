import java.util.Date;

import herencia.Cliente;
import herencia.Empleado;
import herencia.Persona;

public class HerenciaMain {    
    public static void main(String[] args) {

        System.out.println("");

        Persona persona1 = new Persona("Lucas Tañeda");
        System.out.println("Persona 1: " + persona1.getNombre());
        System.out.println("Persona 1: " + persona1);

        System.out.println("---------------------------------------");

        Persona persona2 = new Persona("Javier Santaolalla", 'M', "A la vuelta de la esquina");
        System.out.println("Persona 2: " + persona2.getNombre());
        System.out.println("Persona 2: " + persona2);

        System.out.println("---------------------------------------");

        Empleado empleado1 = new Empleado("Oliver Atom", 3520.0);
        System.out.println("Empleado 1: " + empleado1);

        System.out.println("---------------------------------------");

        Cliente cliente1 = new Cliente("Matt Ishida", 'M', "Digimundo", new Date(), false);
        System.out.println("cliente 1: " + cliente1);

        System.out.println("---------------------------------------");

        Cliente cliente2 = new Cliente("TK Takaishi", 'M', "Mundo digital", new Date(), true);
        System.out.println("cliente 2: " + cliente2);

        System.out.println("");
    }
}
