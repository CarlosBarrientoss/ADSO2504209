package estructura_de_datos;

import java.util.Scanner;

public class Controladores implements IArregloPersona {
    //metodo para validar el nombre
    public static boolean nombreValido(String nombre){
        return nombre.matches("^[a-zA-Z\\s]+$");
    }
    public static boolean cedulaValido(String cedula){
        return cedula.matches("\\d+");
    }


    @Override
    public void llenarArreglo(Persona persona[], Scanner consola) {
        for (int i = 0; i<persona.length; i++){

            System.out.println("Ingrese el nombre en la posicion 1: " + (i+1) + " ");
            String nombre = consola.nextLine();

            while (!nombreValido(nombre)){
                System.out.println("Nombre no valido. Ingrese uno valido: ");
                nombre = consola.nextLine();
            }

            System.out.println("Ingrese la cedula para "+ nombre+":");
            String cedulaPorVlidar = consola.nextLine();

            while (!cedulaValido(cedulaPorVlidar)){
                System.out.println("Cedula no valida. Por favor ingrese una valida: ");
                cedulaPorVlidar = consola.nextLine();
            }
            int cedula = Integer.parseInt(cedulaPorVlidar);

            System.out.println("Ingrese el sueldo para: "+nombre+": ");
            double sueldo = Double.parseDouble(consola.nextLine());

            System.out.println("Ingrese el celular de: "+nombre+": ");
            long celular = Long.parseLong(consola.nextLine());


            System.out.println("Ingrese el genero de: "+ nombre + ": ");
            char gemero = consola.nextLine().charAt(0);
            consola.nextLine();



            persona[i] = new Persona(nombre, cedula, sueldo, celular, gemero);
        }
    }

    @Override
    public void mostrarArreglo(Persona persona[]) {
        for(Persona nombre : persona){
            System.out.println("nombre persona el: " + nombre);
        }
    }
}
