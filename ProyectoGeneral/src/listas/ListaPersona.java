package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPersona {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Persona> listaPersonas = new ArrayList<>();

        boolean salir = false;

        while (!salir) {

            verMenu();
            try {
                salir = ejecutarOpciones(sc,listaPersonas);
            } catch (Exception e){
                System.out.println("Falla en la matrix: " + e.getMessage());
            }

        }

    }

    private static void verMenu(){
        System.out.println("""
                
                *** Lista de personas ***
                1. Agregar.
                2. Listar.
                3. Actulizar.
                4. Eliminar.
                5. Salir.
                """);
        System.out.println("Elige una opción: ?\n");

    }
    private static boolean ejecutarOpciones(Scanner sc, List<Persona> listaPersonas){

        int opcion = sc.nextInt();
        boolean salir = false;
        switch (opcion){
            case 1 -> {
                System.out.print("Ingresa el nombre: ");
                String nombre = sc.nextLine();

                sc.nextLine();

                System.out.print("Ingrese el telefono: ");
                long telefono = Long.parseLong(sc.nextLine());

                System.out.print("Ingresa el correo: ");
                String correo = sc.nextLine();


                Persona persona1 = new Persona(nombre,telefono,correo);
                listaPersonas.add(persona1);

                System.out.println("La lista de personas tiene " + listaPersonas.size() + " elementos");
                break;
            }
            case 2 ->{
                System.out.println("Lista de Personas");
                listaPersonas.forEach(System.out::println);
                break;
            }
            case 3 ->{
                System.out.println("Lista de Personas");
                listaPersonas.forEach(System.out::println);

                System.out.println("Elija un registro a actualizar");
                int numeroActualizar = sc.nextInt();

                System.out.print("Ingresa el nombre: ");
                String nombre = sc.nextLine();

                sc.nextLine();

                System.out.print("Ingrese el telefono: ");
                long telefono = Long.parseLong(sc.nextLine());

                System.out.print("Ingresa el correo: ");
                String correo = sc.nextLine();

                listaPersonas.get(numeroActualizar).setNombre(nombre);
                listaPersonas.get(numeroActualizar).setTelefono(telefono);
                listaPersonas.get(numeroActualizar).setCorreo(correo);

                System.out.println("Registro actualizado con exito");

                break;
            }
            case 4 ->{

            }
            case 5 ->{
                System.out.println("Gracias, hasta pronto");
                salir = true;
                break;
            }
            default -> {
                System.out.println("Opción invalida");
            }
        }
        return salir;
    }

}


