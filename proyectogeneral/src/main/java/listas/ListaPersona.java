
package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaPersona {
    public static void main(String[] args) {
         Scanner consola=new Scanner(System.in);
         List<Persona>listaPersonas=new ArrayList<>();
         
         boolean salir=false;
         while (!salir){
             verMenu();
             
             try{
             salir= ejecutarOpciones(consola,listaPersonas);
             
             }catch(Exception e){
                 System.out.println("ocurrio un error: "+ e.getMessage());
             }
             System.out.println();
             
         }
    }
    
    private static void verMenu(){
        System.out.println("***LISTAR PERSONAS***\n 1.Agregar \n 2.Listar \n 3.actualizar \n 4.eliminar \n 5.salir" );
        System.out.println("Elije una opcion: ?");
    }
    
    private static boolean ejecutarOpciones(Scanner consola, List<Persona> listaPersonas){
        int  opcion =Integer.parseInt(consola.nextLine());
        boolean salir=false;
        switch(opcion){
            case 1: {
                System.out.println("ingrese el nombre");
                String nombre=consola.nextLine();
                
                System.out.println("ingrese el telefono");
                long telefono=Long.parseLong(consola.nextLine());
                
                System.out.println("ingrese el correo");
                String correo=consola.nextLine();
                
               Persona persona1= new Persona(nombre, telefono, correo);
               listaPersonas.add(persona1);
               
                System.out.println("la lista de personas tiene "+ listaPersonas.size() + " elementos");
                break;
               
            }
            case 2:{
                System.out.println("Lista de personas");
                listaPersonas.forEach(System.out::println);
                break;
            }
            case 3:{
                System.out.println("persona que desea actualizar");
                listaPersonas.forEach(System.out::println);
                System.out.println("elija un numero que dea actualizar");
                int numeroActualizar = Integer.parseInt(consola.nextLine())-1;
                
                System.out.println("ingrese el nombre");
                String nombre=consola.nextLine();
                
                System.out.println("ingrese el telefono");
                long telefono=Long.parseLong(consola.nextLine());
                
                System.out.println("ingrese el correo");
                String correo=consola.nextLine();
                
                listaPersonas.get(numeroActualizar).setNombre(nombre);
                listaPersonas.get(numeroActualizar).setTelefono(telefono);
                listaPersonas.get(numeroActualizar).setCorreo(correo);
                
                System.out.println("registro modificado");
                break;
            }
            
            case 4: {
                System.out.println("ingrese el numero de la persona que desea eliminar");
                listaPersonas.forEach(System.out::println);
                System.out.println("elija el numero que desea elimicar");
                int numeroEliminar=Integer.parseInt(consola.nextLine())-1;
                

               listaPersonas.remove(numeroEliminar);
                System.out.println("el usuario fue elimnado");
               break;
               
            }
            case 5:{
                System.out.println("hasta pronto nena");
                salir= true;
                
                break;
                
            }
            
            default:
                System.out.println("opcion invalida"+ opcion);
            
            
            
        }
        return salir;
        
    }
    
    
}
