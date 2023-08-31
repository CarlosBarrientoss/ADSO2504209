import Herecia.Cliente;
import Herecia.Empleado;
import Herecia.Persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//        Persona persona1 = new Persona("Gabriel");
//        System.out.println("persona1 = " + persona1);

//        Empleado empleado1 = new Empleado(0, 13000, 1, "Gabriel");
//        System.out.println("empleado1 = " + empleado1);

        Cliente cliente1 = new Cliente(0, LocalDate.of(2002, 6, 16), true,"Gabriel");
        System.out.println("cliente1 = " + cliente1);



        
        
    }
}