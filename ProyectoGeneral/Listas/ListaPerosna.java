package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPerosna {
    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        List<Persona> listaPersonas = new ArrayList<>();
        
        boolean salir = false;

        while(!salir){
            verMenu();
            try {
            salir = ejecutarOpciones(consola, listaPersonas);
            } catch(Exception e) {
                System.out.println("Ocurrio un error" +e.getMessage() );
            }
            System.out.println("");
        }

    }

    private static void verMenu() {
        System.out.println("**** Lista de Personas **** \n 1. Agregar \n 2. Listar \n 3. Salir \n 4. Actualizar \n 5. Eliminar");

        System.out.println("Ingrese una opcion: ");
    }

    private static boolean ejecutarOpciones(Scanner consola, List<Persona> listaPersonas) {
        
        int opcion = Integer.parseInt(consola.nextLine());
        boolean salir = false;

        switch(opcion){
            case 1: {
                
                System.out.println("Ingresa el nombre: ");
                String nombre = consola.nextLine();
                
                System.out.println("Por favor ingrese su telefono: ");
                long telefono = Long.parseLong(consola.nextLine());
                
                System.out.println("Por favor ingrese su correo: ");
                String correo = consola.nextLine(); 
            
                Persona persona1 = new Persona(nombre, telefono, correo);
                listaPersonas.add(persona1);

                System.out.println("La lista de personas tiene: " + listaPersonas.size() + "Elementos");
                break;                
            }

            case 2: {
                System.out.println("Lista de personas ");
                listaPersonas.forEach(System.out:: println);
                break;
            }
            
            case 3: {
                System.out.println("Hasta luego, vuelva pronto ");
                salir = true;
                break;

            }
            case 4: {
                for (int i = 0; i < listaPersonas.size(); i++) {
                    System.out.println("Indice = " + i + listaPersonas.get(i));
                }
                System.out.println("Ingrese el indice de la persona que desea actualizar ");

                int indice = Integer.parseInt(consola.nextLine());
                System.out.println("Ingresa el nombre nuevo: ");
                String nombreNuevo = consola.nextLine();
                
                System.out.println("Por favor ingrese su telefono nuevo: ");
                long telefonoNuevo = Long.parseLong(consola.nextLine());
                
                System.out.println("Por favor ingrese su correo nuevo: ");
                String correoNuevo = consola.nextLine();

                listaPersonas.get(indice).setNombre(nombreNuevo);
                listaPersonas.get(indice).setCorreo(correoNuevo);
                listaPersonas.get(indice).setTelefono(telefonoNuevo);
                
                break;

            }
            case 5: {
                for (int i = 0; i < listaPersonas.size(); i++) {
                    System.out.println("Indice = " + i + listaPersonas.get(i));
                }
                System.out.println("Ingrese el indice de la persona que desea eliminar ");

                int indiceEliminar = Integer.parseInt(consola.nextLine());
                listaPersonas.remove(indiceEliminar);
                break;
            }
            default:
                System.out.println("La oprcion es invalida" + opcion);
        }
        return salir;
    }

    private static void add(Persona persona1) {
    }

}
