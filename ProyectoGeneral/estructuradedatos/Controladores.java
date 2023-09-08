package estructuradedatos;

import java.util.Scanner;

public class Controladores implements IArregloPersona {

    public static boolean nombreValido(String nombre) {
        return nombre.matches("[a-zA-Z\\s] + $");

    }

    public static boolean cedulaValida(String cedula) {
        return cedula.matches("\\d+");
    }






    @Override
    public void llenarArreglo(Persona personas[], Scanner entrada) {
        for (int i = 0; i < personas.length; i++) {
            
            System.out.println("Ingrese la persona #" + (i + 1));
            String nombre = entrada.nextLine();

            while (!nombreValido(nombre)) {
            System.out.println(" Nombre no valido, Ingresa un nombre valido: ");
            nombre = entrada.nextLine();
            }

          
            System.out.println("Ingrese la cedula " + nombre + " : ");
            String cedulaValida = entrada.nextLine();
             
            while (!cedulaValida(cedulaValida)) {
                System.out.println( "Cedula no valida, ingrese su cedula valida: ");
                cedulaValida = entrada.nextLine();
      }
        int cedula = Integer.parseInt(cedulaValida);
            
            entrada.nextLine();
            
            System.out.println("Ingrese el sueldo " + nombre + " : ");
            double sueldo = Double.parseDouble(entrada.nextLine());
            
            System.out.println("Ingrese el celular de " + nombre + " : ");
            int celular = Integer.parseInt(entrada.nextLine());
            
            System.out.println("Ingrese el genero de la persona " + nombre + " : ");
            char genero = entrada.nextLine().charAt(0);
            
            personas[i] = new Persona(nombre, cedula, sueldo, celular, genero);
            
        }


    }

    @Override
    public void mostrarArreglo(Persona personas[]) {
        for (Persona persona : personas) {
            System.out.println("La persona es " + persona);
        }

    }

    @Override
    public void buscar(Persona[] personas) {
          for (Persona nombre : personas) {
           if( nombre.equals("Carlos")){
            System.out.println("Encontrado el vector ");

           } 
        }
    }

    @Override
    public void buscarCedula(Persona[] personas) {
        for (Persona persona : personas) {
            if( persona.getCedula() == 12345){
                System.out.println("Su cedula es ");
            }
        }
        
    }



    
}
