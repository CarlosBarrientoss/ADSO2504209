package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        boolean esSalir = false;
        while (!esSalir) {
            verMenu();
            try {
                esSalir = ejecutarOpciones(scanner, personas);                
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            System.out.println();
        }

        scanner.close();
    }

    private static boolean ejecutarOpciones(Scanner scanner, List<Persona> personas) {
        int opcion = Integer.parseInt(scanner.nextLine());
        boolean esSalir = false;

        switch (opcion) {
            case 1: {
                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese el telefono: ");
                long telefono = Long.parseLong(scanner.nextLine());
                System.out.print("Ingrese el correo: ");
                String correo = scanner.nextLine();

                Persona nuevaPersona = new Persona(nombre, telefono, correo);
                personas.add(nuevaPersona);

                System.out.println("La cantidad de personas en la lista es: " + personas.size());
                break;
            }
            case 2: {
                System.out.println("Lista de personas");
                personas.forEach(System.out::println);
                break;
            }                
            case 3:{
                System.out.println("Modificar persona: \nMostrando lista de personas actuales");
                for (int i = 0; i < personas.size(); i++) {
                    System.out.println("["+(i+1)+"] " + personas.get(i).getNombre());
                }

                System.out.print("Ingrese el numero de la persona a modificar: ");
                int numero = Integer.parseInt(scanner.nextLine()) - 1;

                System.out.print("Ingrese el nombre: ");
                String nombreActualizado = scanner.nextLine();
                System.out.print("Ingrese el telefono: ");
                long telefonoActualizado = Long.parseLong(scanner.nextLine());
                System.out.print("Ingrese el correo: ");
                String correoActualizado = scanner.nextLine();

                // Condicionales para poder mantener los datos que no se deseen modificar
                if (!nombreActualizado.toLowerCase().equals("mantener")) {
                    personas.get(numero).setNombre(nombreActualizado);
                }
                if (telefonoActualizado > 0) {
                    personas.get(numero).setTelefono(telefonoActualizado);
                }
                if (!correoActualizado.toLowerCase().equals("mantener")) {
                    personas.get(numero).setCorreo(correoActualizado);
                }

                System.out.println("La informacion de la persona ha sido actualizada");

                break;
            }
            case 4:{
                System.out.println("Eliminar persona: \nMostrando lista de personas actuales");
                for (int i = 0; i < personas.size(); i++) {
                    System.out.println("["+(i+1)+"] " + personas.get(i).getNombre());
                }

                System.out.print("Ingrese el numero de la persona a eliminar: ");
                int numero = Integer.parseInt(scanner.nextLine()) - 1;
                personas.remove(numero);

                System.out.println("El registro de la persona ha sido eliminado");
                
                break;
            }
            case 5:{
                System.out.println("Hasta la vista baby...");
                esSalir = true;
                break;
            }
            default:
                System.out.println("Opcion invalida " + opcion);
                break;
        }

        return esSalir;
    }

    private static void verMenu() {
        System.out.print("""
                ***** Lista de personas *****
                [1] Agregar
                [2] Listar
                [3] Actualizar
                [4] Eliminar
                [5] Salir
                Elije una opcion: 
                """);
    }
}
