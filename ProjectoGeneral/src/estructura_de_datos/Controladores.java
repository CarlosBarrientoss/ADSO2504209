package estructura_de_datos;

import java.util.Scanner;

public class Controladores implements IArregloPersona {

    public static boolean nombreValido(String nombre){
        return nombre.matches("^[a-zA-Z\\s]+$");
    }
    public static boolean CedulaValida (String cedula){
        return cedula.matches("\\d+");
    }
    @Override
    public void llenarArreglo(Personas persona[], Scanner consola) {
        for (int i = 0; i<persona.length; i++){
            System.out.println("Ingrese el nombre en la posicion 1: " + (i+1) + " ");
            String nombre = consola.nextLine();
            System.out.println("Ingrese la cedula para "+ nombre+":");
            int cedula = consola.nextInt();
            consola.nextLine();
            persona[i] = new Personas(nombre, cedula);
            
            while (!nombreValido(nombre)){
                System.out.println("Ingrese un  nombre valido");
                nombre = consola.nextLine();
            }
            System.out.println("Ingrese la cedula para: " nombre+":");
           
        }
        
    }

    @Override
    public void mostrarArreglo(Personas persona[]) {
        for(Personas nombre : persona){
            System.out.println("nombre persona el: " + nombre);
        }
    }
}
