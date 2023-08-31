import herencia.Cliente;
import herencia.Empleado;
import herencia.Persona;
import java.util.Date;

public class HerenciaMain {
    public static void main(String[] args) {
        Persona persona = new Persona("carlos");
        
        //System.out.println(persona);
        
        
        Empleado empleado = new Empleado( 10000, "Alexx");
        System.out.println("USted es: " + empleado.toString());
        
        Cliente cliente = new Cliente(new Date(), false, "alwx", 'm', "Ave");
        System.out.println("Usted es: " + cliente.toString());
        Cliente cliente2 = new Cliente(new Date(), true, "brriam", 'm', "calle 2");
        System.out.println("Usted es: " + cliente2.toString());
        
    }
}
