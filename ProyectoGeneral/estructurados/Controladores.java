package estructurados;

import java.util.Scanner;

public class Controladores implements  IArregloPersona {

    public static boolean nombreValido (String nombre){
        return nombre.matches("[a-zA-Z\\s]+$");
    }
    public static boolean cedulaValida (String cedula){
        return cedula.matches("\\d+");
    }

    @Override
    public void llenarArreglo(Persona personas[], Scanner consola) {
        //Llenar arreglos de objetos
        for (int i = 0; i < personas.length; i++){
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ":");
            String nombre = consola.nextLine();

            while  (!nombreValido(nombre)){
                System.out.println("Ingrese un nombre valido");
                nombre = consola.nextLine();
            }
            System.out.println("Ingrese la cedula de "+ nombre);
            String cedulaPorValidar = consola.nextLine();

            while (!cedulaValida(cedulaPorValidar)){
                System.out.println("Ingrese una cedula valida");
                cedulaPorValidar = consola.nextLine();
            }
            int cedula = Integer.parseInt(cedulaPorValidar);

            System.out.println("Ingrese el sueldo de " + nombre);
            double sueldo = consola.nextDouble();
            System.out.println("Ingrese el numero de celular de " + nombre);
            long celular = consola.nextLong();
            consola.nextLine();
            System.out.println("Ingrese el genero de" + nombre+ " M para masculino o F para femenino " );
            char genero = consola.nextLine().charAt(0);
            personas[i] = new Persona(nombre, cedula, sueldo, celular, genero);
        }
    }

    @Override
    public void mostrarArreglo(Persona personas[]) {
        for (Persona nombre : personas){
            System.out.println("nombre = " + nombre);
        }

    }

    @Override
    public void buscarNombre(Persona personas[]) {
        for (Persona nombre : personas){
            if(nombre.getNombre().equals("jose")){
                System.out.println("Nombre encontrado en el vector");
            }
        }
    }

    @Override
    public void burcarCedula(Persona personas[]) {
        for (Persona cedula : personas){
            if (cedula.getCedula() == 1004879232){
                System.out.println("Cedula encontrada en el vector");
            }
        }
    }


}
