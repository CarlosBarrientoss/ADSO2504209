package estructuradedatos;

import java.util.Scanner;

public class Controladores implements IArregloPersona {

    @Override
    public void llenarArreglo(Persona[] personas, Scanner scanner) {
        for (int i = 0; i < personas.length; i++) {

            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            while (!esNombreValido(nombre)) {
                System.out.println("Nombre no válido, ingrese de nuevo");
                System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
                nombre = scanner.nextLine();
            }

            System.out.print("Ingrese la cedula para " + nombre + ": ");
            String cedulaPorValidar = scanner.nextLine();
            while (!esCedulaValida(cedulaPorValidar)) {
                System.out.println("Cedula ingresada no valida, ingrese de nuevo");
                System.out.print("Ingrese la cedula para " + nombre + ": ");
                cedulaPorValidar = scanner.nextLine();
            }
            int cedula = Integer.parseInt(cedulaPorValidar);

            // Las lineas comentadas debajo se dejan como recordatorio de un ejemplo realizado
            // int cedula = Integer.parseInt(scanner.nextLine());
            // int cedula = scanner.nextInt();  // Aqui se presenta un error que no ocurre con el metodo
            // scanner.nextLine();              // del parsero, y se corrige llamando al next line

            System.out.print("Ingrese el sueldo para " + nombre + ": ");
            double sueldo = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese el celular para " + nombre + ": ");
            int celular = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el genero para " + nombre + ": ");
            char genero = scanner.nextLine().charAt(0);

            personas[i] = new Persona(nombre, cedula, sueldo, celular, genero);
        }
    }

    @Override
    public void mostrarArreglo(Persona personas[]) {
        for (Persona persona : personas) {
            System.out.println("La persona es: " + persona.toString());
        }
    }

    public static boolean esNombreValido(String nombre) {
        return nombre.matches("^[a-zA-Z\\s]+$");
    }
    public static boolean esCedulaValida(String cedula) {
        return cedula.matches("\\d+");
    }

    @Override
    public void buscarNombre(Persona[] personas, Scanner scanner) {

        System.out.print("Ingrese el nombre de la persona a buscar: ");
        String nombreABuscar = scanner.nextLine();

        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombreABuscar)) {
                System.out.println("Encontrado en el vector");
                System.out.println(persona);
            }
        }
    }

    @Override
    public void buscarCedula(Persona[] personas, Scanner scanner) {

        System.out.print("Ingrese el nombre de la persona a buscar: ");
        int cedulaABuscar = Integer.parseInt(scanner.nextLine());

        for (Persona persona : personas) {
            if (persona.getCedula() == cedulaABuscar) {
                System.out.println("Encontrado en el vector");
                System.out.println(persona);
            }
        }
    }    
}
