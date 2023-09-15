package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPersona {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        List<Personas> listaPersonas = new ArrayList<>();
        boolean salir = false;

        while(!salir ){
            verMenu();
            try{
            salir = ejercutarOpciones(consola, listaPersonas);
            }catch(Exception e){
                System.out.println("ocurrio un error: "+ e.getMessage());
            }
            System.out.println();


        }
    }
    private static void verMenu(){
        System.out.println("""
                ****Lista de personas ****
                1. agregar.
                2. Listar.
                3. actualizar.
                4. eliminar.
                5. salir.
                """);
        System.out.println("Elija una optcion");
        
    }
    private static boolean ejercutarOpciones(Scanner consola, List<Personas> listaPersonas){
        int opcion = Integer.parseInt(consola.nextLine());
        boolean salir = false;
        switch(opcion ){
            case 1:{
                System.out.println("Ingresa el nombre:");
                String nombre = consola.nextLine();
                System.out.println("Ingrese su numero de telefono:");
                Long telefono = Long.parseLong(consola.nextLine());
                System.out.println("Ingrese su correo:");
                String correo = consola.nextLine();

                Personas persona1 = new Personas(nombre, telefono, correo);
                listaPersonas.add(persona1);
                System.out.println("La lista de personas tiene: " +listaPersonas.size()+" Elementos");
            }
            case 2: {
                System.out.println("Lista de personas:");
                listaPersonas.forEach(System.out::println);
                break;
            }
            case 3:{

                listaPersonas.forEach(System.out::println);
                System.out.println("Ingrese un dato a actualizar: ");
                int actualizar = Integer.parseInt(consola.nextLine())-1;
                System.out.println("Ingresa el nombre:");
                String nombre = consola.nextLine();
                System.out.println("Ingrese su numero de telefono:");
                Long telefono = Long.parseLong(consola.nextLine());
                System.out.println("Ingrese su correo:");
                String correo = consola.nextLine();

                listaPersonas.get(actualizar).setNombre(nombre);
                listaPersonas.get(actualizar).setTelefono(telefono);
                listaPersonas.get(actualizar).setCorreo(correo);
                System.out.println("se actualizo exitosamente");
                break;




            }
            case 4:{
                listaPersonas.forEach(System.out::println);
                System.out.println("la cantidad de registros que ha ingresado es de: " + listaPersonas.size());
                // System.out.println("Por favor ingrese el numero de registro que desea eliminar: ");
                // int eliminar = Integer.parseInt(consola.nextLine());
                listaPersonas.clear();
                System.out.println("Se elimino el registro correctamente");
                System.out.println("Los registros que quedan son: " + listaPersonas.size());
            }
            case 5:{
                System.out.println("Hasta pronto.");
                salir = true;
                break;
            }
            default:
            System.out.println("opcion invalida.");
        }
        return salir;



    }

}
