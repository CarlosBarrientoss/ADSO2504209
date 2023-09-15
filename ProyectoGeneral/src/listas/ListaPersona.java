package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPersona {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        List<Persona> listaPersonas = new ArrayList<>();

        boolean salir = false;

        while (!salir){
            vermenu();
            try {
                salir = ejecutarOpciones(consola, listaPersonas);
            } catch(Exception e) {
                System.out.println("Ocurrio un error " + e.getMessage());
            }

        }


    }


    private static void vermenu(){
        System.out.println("""
                            **** Lista de personas ****
                            1. Agregar
                            2. Listar
                            3. Actualizar
                            4. Eliminar
                            5. salir
                            """);
        System.out.println("Elige una opcion");
    }
    private static boolean ejecutarOpciones(Scanner consola, List<Persona> listaPersona){

        int opcion = Integer.parseInt(consola.nextLine());
        boolean salir = false;

        switch (opcion){
            case 1:{
                System.out.print("Ingresa el nombre: ");
                String nombre = consola.nextLine();
                System.out.print("Ingresa el telefono: ");
                long telefono = Long.parseLong(consola.nextLine());
                System.out.print("Ingrese el correo electronico: ");
                String correo = consola.nextLine();

                Persona persona1 = new Persona(nombre,telefono,correo);
                listaPersona.add(persona1);

                System.out.println("\nLa lista de persona tiene " + listaPersona.size() + " elementos \n");
                break;
            }
            case 2:{
                System.out.println("""
                                    **** Lista de personas ***
                                    """);
                listaPersona.forEach(System.out::println);
                break;
            }
            case 3:{
                System.out.println("**** Actualizar ****");
                listaPersona.forEach(System.out::println);

                System.out.print("\n Ingrese la id de la persona a actualizar: ");
                int idActualizar = Integer.parseInt(consola.nextLine());
                boolean encontrado = false;

                for (Persona persona : listaPersona){
                    if (persona.getId() == idActualizar){
                        System.out.print("Ingresa el nuevo nombre: ");
                        String nuevoNombre = consola.nextLine();
                        System.out.print("Ingresa el nuevo telefono: ");
                        long nuevoTelefono = Long.parseLong(consola.nextLine());
                        System.out.print("Ingresa el nuevo correo electronico: ");
                        String nuevoCorreo = consola.nextLine();

                        persona.setNombre(nuevoNombre);
                        persona.setTelefono(nuevoTelefono);
                        persona.setCorreo(nuevoCorreo);

                        System.out.println("Persona actualizada con éxito.");
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado){
                    System.out.println("No se encontro ninguna persona co ese id");
                }
                break;
            }
            case 4:{
                System.out.println("**** Eliminar ****");
                listaPersona.forEach(System.out::println);

                System.out.println("Ingrese la id a eliminar");
                int idEliminar =Integer.parseInt(consola.nextLine());
                boolean encontrado = false;

                for (Persona persona : listaPersona){
                    if (persona.getId() == idEliminar){
                        listaPersona.remove(persona);
                        System.out.println("Persona eliminada con éxito.");
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado){
                    System.out.println("Usuario no encontrado");
                }
                break;
            }
            case 5:{
                System.out.println("**** Hasta pronto ****");
                salir = true;
                break;
            }
            default:
                System.out.println("Opcion invalida " + opcion);
        }

        return salir;
    }
}
