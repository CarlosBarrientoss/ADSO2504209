package sena.jonathan_avendano.Listas;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPersonas {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        List<Personas> listaPersonas = new ArrayList<>();
        boolean salir = false;
        while(!salir){
            verMenu();
            try{
              salir =  ejercutarOpciones(consola, listaPersonas);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }

        }
    }
    private static  void verMenu(){
        System.out.println("""
                *** lista de personas *** \n 1. Agregar \n 2. listar \n 3. Eliminar \n 4. Actualizar \n 5. Salir""");
        System.out.println("Elige una opcion: ");
    }
    private static boolean ejercutarOpciones(Scanner consola, List<Personas> ListaPersonas){
        int opcion  = Integer.parseInt(consola.nextLine());
        boolean salir = false;
        switch (opcion){
            case 1:{
                System.out.println("Ingrese el nombre: ");
                String nombre = consola.nextLine();

                System.out.println("Ingrese el telefono: ");
                long telefono = Long.parseLong(consola.nextLine());

                System.out.println("Ingrese su correo: ");
                String correo = consola.nextLine();

                Personas persona1 = new Personas(nombre, telefono, correo);
                ListaPersonas.add(persona1);

                System.out.println("La lista de personas tiene " + ListaPersonas.size() + "elementos");
            }
            case 2:{
                System.out.println("Lista de personas: ");
                ListaPersonas.forEach(System.out::println);
                break;

            }
            case 3:{
                var tamanio = ListaPersonas.size();
                System.out.println("tamanio = " + tamanio);
                ListaPersonas.clear();
                tamanio = ListaPersonas.size();
                System.out.println(tamanio);
            }
            case 4:{
                System.out.println("Listas de personas");
                ListaPersonas.forEach(System.out::println);
                System.out.println("Elija un registro a actualizar");
                int numeroActualizar = Integer.parseInt(consola.nextLine());

                System.out.println("Ingrese el nombre");
                String nombre = consola.nextLine();
                System.out.println("Ingrese el telefono: ");
                long telefono = Long.parseLong(consola.nextLine());
                System.out.println("Ingrese el correo: ");
                String correo = consola.nextLine();


            }
            case 5:{
                System.out.println("Chao mor");
                break;
            }
            default:
                System.out.println("Opcion invalida");
        }
        return salir;
    }
}
