import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPersona {
    public static void main(String[] args) {
        
    
    Scanner entrada = new Scanner(System.in);
    List<Persona> listaPersonas = new ArrayList<>();

    boolean salir = false;

    while (!salir){
        verMenu();
        try{
        salir = ejecutarOpciones(entrada, listaPersonas);
        } catch(Exception e){
            System.out.println("Ocurrio un error " + e.getMessage());
        }
        System.out.println();
      }
    }
    private static void verMenu(){
        System.out.println("""
            **** Lista Persona ****
            [1] Agregar
            [2] Listar
            [3] Actualizar
            [4] Eliminar
            [5] Salir
            Elige una opcion
            """);
    }

    private static boolean ejecutarOpciones(Scanner entrada, List<Persona> listaPersonas){
        boolean salir = false;
        int  opcion = Integer.parseInt(entrada.nextLine());
        switch (opcion){

            case 1:
                System.out.println("Ingrese el nombre de la persona");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese el telefono de la persona");

                long telefono = Long.parseLong(entrada.nextLine());

                System.out.println("Ingrese el correo de la persona");
                String correo = entrada.nextLine();

                Persona persona1 = new Persona(nombre, telefono, correo);
                
                listaPersonas.add(persona1);

                System.out.println("La cantidad de personas en la lista es " + listaPersonas.size());
                break;


            case 2:
                System.out.println("Lista de personas");
                listaPersonas.forEach(System.out::println);
                break;

            case 3:
                for (int i = 0; i < listaPersonas.size(); i++) {
                    System.out.println("Indice = " + (i + 1) + " " +listaPersonas.get(i));
                }
                System.out.println("Introduzca el indice de la persona que desea actualizar");
                int indice = Integer.parseInt(entrada.nextLine()) - 1;
                System.out.println("Ingrese el nombre de la persona que desea actualizar");
                String nombreNuevo = entrada.nextLine();
                System.out.println("Ingrese el telefono de la persona que desea actualizar");

                long telefonoNuevo = Long.parseLong(entrada.nextLine());

                System.out.println("Ingrese el correo de la persona que desea actualizar");
                String correoNuevo = entrada.nextLine();
                
                if (!nombreNuevo.toLowerCase().equals("mantener")){
                    listaPersonas.get(indice).setNombre(nombreNuevo);
                }
                if (telefonoNuevo > 0){
                    listaPersonas.get(indice).setTelefono(telefonoNuevo);
                }   
                if (!correoNuevo.toLowerCase().equals("mantener")){
                    listaPersonas.get(indice).setCorreo(correoNuevo);
                }
                
                
                break;
            
            case 4:
                for (int i = 0; i < listaPersonas.size(); i++) {
                    System.out.println("Indice = " + i + " " +listaPersonas.get(i));
                }
                System.out.println("Ingrese el indice de la persona que desea eliminar");
                int indiceEliminar = Integer.parseInt(entrada.nextLine());

                listaPersonas.remove(indiceEliminar);
                
                break;

            case 5:
                System.out.println("Hasta la vista baby...");
                salir = true;
                break;

            default:

            System.out.println("Opcion invalida " + opcion);
                break;

        }
        return salir;

    }
}
