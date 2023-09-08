package estructuradedatos;

import java.util.Scanner;

public class Controladores implements IArregloPersona {

    public static boolean nombreValido(String nombre){
        return nombre.matches("^[a-zA-Z\s]+$");
    }

    public static boolean cedulaValida(String cedula){
        return cedula.matches("\\d+");
    }

    public static boolean generoValido(String genero){
        return genero.matches("[mfMFoO]");
    }


    @Override
    public void llenarArreglo(Persona personas[], Scanner entrada) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese el nombre de la persona #" + (i + 1));
            String nombre = entrada.nextLine();
            while (!nombreValido(nombre)){
                System.out.println("Nombre no valido reingrese:");
                System.out.println("Ingrese el nombre de la persona #" + (i + 1));
                nombre = entrada.nextLine();
            }
            System.out.println("Ingrese la cedula de " + nombre);
            // int cedula = Integer.parseInt(entrada.nextLine());
            String cedulaValidar = entrada.nextLine(); // Mejor usar metodo de parseo en estos casos
            while (!cedulaValida(cedulaValidar)){
                System.out.println("Cedula invalida reingrese");
                System.out.println("Ingrese la cedula de " + nombre);
             cedulaValidar = entrada.nextLine(); 
            }
            int cedula = Integer.parseInt(cedulaValidar); // VALIDACION DE CEDULA DESPUES DE VALIDAR SE PARSEA A INT

            System.out.println("Ingrese el sueldo de " + nombre);
            double sueldo = Double.parseDouble(entrada.nextLine());
            System.out.println("Ingrese el celular de " + nombre);
            int celular = Integer.parseInt(entrada.nextLine());

            System.out.println("Ingrese el genero de " + nombre);
            String generoValidar = entrada.nextLine();

            while (!generoValido(generoValidar)){
                System.out.println("Ingrese un genero valido");
                System.out.println("Ingrese el genero de " + nombre);
                 generoValidar = entrada.nextLine();
            }
            char genero = generoValidar.charAt(0);
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
    public void buscarNombre(Persona[] personas, Scanner entrada) {
        System.out.println("Ingrese el nombre de la persona que desea buscar");
        String nombreBuscar = entrada.nextLine();
        for (Persona persona : personas) {

           if (persona.getNombre().equals(nombreBuscar)){
            System.out.println("Encontrado en el vector");
            System.out.println(persona);
           }
        }
    


    
}

    @Override
    public void buscarCedula(Persona[] personas, Scanner entrada) {
        System.out.println("Ingrese la cedula de la persona que desea buscar");
        int cedulaBuscar = Integer.parseInt(entrada.nextLine());
        for (Persona persona : personas) {
           if (persona.getCedula() == cedulaBuscar){
            System.out.println("Encontrado en el vector");
            System.out.println(persona);
           }; 
        }
    }

}