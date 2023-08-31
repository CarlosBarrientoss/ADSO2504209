import java.util.Date;

import herencia.Cliente;
import herencia.Empleado;
import herencia.Persona;                      

public class HerenciaMain {                      
    public static void main(String[] args) {                      
     
        Persona persona1 = new Persona("Elon Musk");
        System.out.println("Persona 1 " + " " + persona1);

        System.out.println("*----------------------------------------------------------------------------------------* ");
         
        Persona persona2 = new Persona("Juan Carlos", 'M',"Avenida 14");
        System.out.println("Persona 2 " + " " + persona2);

        System.out.println("*----------------------------------------------------------------------------------------* ");
         
        Empleado empleado1 = new Empleado("Mateo Andres", 9999999);
        System.out.println("Empleado 1 " + empleado1);

        System.out.println("*----------------------------------------------------------------------------------------* ");

        Cliente cliente1 = new Cliente("Fualnito", 'M', "Avenida 562342",  new Date(), true);
        System.out.println("Cliente 1 " + cliente1);

        System.out.println("*----------------------------------------------------------------------------------------* ");
         
        Cliente cliente2 = new Cliente("Juanto", 'M', "Avenida 6666",  new Date(), true);
        System.out.println("Cliente 2 " + cliente2);
    }                      
}                      
