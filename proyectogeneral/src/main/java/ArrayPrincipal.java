
import estructuradedatos.Controladores;
import estructuradedatos.Persona;
import java.util.Scanner;

public class ArrayPrincipal{

    public static void main(String[] args) {
        
        Persona personas[]= new Persona[5];
        Scanner consola=new Scanner(System.in);
        
        Controladores controlador=new Controladores();
        controlador.llenarArreglo(personas, consola);
        controlador.mostrarArreglo(personas);
        consola.close();
        
        
        
//        llenarArreglo(personas, consola);
        
        
        
        
        
        
//        Persona personas[] = new Persona[5];
//       Scanner consola=new Scanner(System.in);

//        for(int i=0;i < personas.length; i++){
//            System.out.println("ingrese el nombre de la persona= "+ (i+1)+ ":");
//            personas[i]=new Persona(consola.nextLine());
//            
//        }
//        
//                for (Persona nombre : personas) {
//            System.out.println("nombre persona = " + nombre);
//        }
//        
//        
        /*
        Persona personas[] = new Persona[5];
        personas[0] = new Persona("jhon");
        personas[1] = new Persona("jairo");
        personas[2] = new Persona("willy");
        personas[3] = new Persona("tony");
         */
 /* mostarr con este for */
//        for (Persona nombre : personas) {
//            System.out.println("nombre = " + nombre);
//        }

        /*definir las pocisiones
        for (int i =0; i< personas.length; i++){
        System.out.println("personas = " + personas);
    }*/
//        String nombres[] = new String[5];
//        nombres[0] = "elon";
//        nombres[1] = "jeff";
//        nombres[2] = "juan";
//        nombres[3] = "jaime";
//        nombres[4]= "sol";
//        
//        for (int i=0; i <nombres.length;i++){
//            System.out.println("nombre de la poscion  = " + nombres[i]);
//        }
    }

//    public static void llenarArreglo(Persona personas[], Scanner consola) {
//
//        for (int i = 0; i < personas.length; i++) {
//            System.out.println("ingrese el nombre de la persona= " + (i + 1) + ":");
//            personas[i] = new Persona(consola.nextLine());
//
//        }
//    }
//
//    public static void mostrarArreglo(Persona personas[]) {
//        for (Persona nombre : personas) {
//            System.out.println("nombre persona = " + nombre);
//        }
//
//    }
    
    
}
