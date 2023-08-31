
import herencia.Cliente;
import herencia.Empleado;
import herencia.Persona;
import java.util.Date;


public class HerenciaMain {
    public static void main(String[] args) {
//        Persona persona1=new Persona("francisco");
//        System.out.println("persona1 = " + persona1);
//       
//        Persona persona2=new Persona("nicol",'M' , 12, "roma");
//        System.out.println("persona2 = " + persona2);
//       
//        Empleado empleado1=new Empleado( 234, "faro");
//        System.out.println("empleado = " + empleado1);
//        
//        Empleado empleado2=new Empleado( 2321, "ddad");
//        System.out.println("empleado = " + empleado2);
//        
        Cliente cliente1= new Cliente("pepito", 'M', 18, "RUSIA ",  new Date(), "si");
        System.out.println("cliente1 = " + cliente1);
       
    }
}
