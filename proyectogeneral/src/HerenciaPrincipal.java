import herencia.Empleado;
import herencia.Persona;
import herencia.Cliente;

public class HerenciaPrincipal {
    public static void main(String[] args) {
//        Persona persona1 = new Persona("Carlos");
//        Persona persona2 = new Persona("Luisa", 'F', 14, "Escobal");
//        System.out.println("persona 2:"+" " + persona2);


        Empleado empleado1= new Empleado("Luisa Tatiana", 725838);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1= new Cliente("keiber",'m',13, "San martin","1990-01-01", true );
        System.out.println("cliente1 = " + cliente1);
        
    }
}
