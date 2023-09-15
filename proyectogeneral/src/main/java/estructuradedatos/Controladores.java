
package estructuradedatos;

import java.util.Scanner;

public class Controladores implements IArregloPersona {
    
    //metodo para validar el nombre
    public static boolean nombreValido(String nombre){
        return nombre.matches("^[a-zA-Z\\s]+$");
    }
    
    public static boolean valiCedula(String cedula ){
        return cedula.matches("\\d+");
    }
    
    
    
    @Override
    public void llenarArreglo(Persona personas[], Scanner consola) {
           for(int i=0;i < personas.length; i++){
            System.out.println("ingrese el nombre de la persona= "+ (i+1)+ ":");
            String nombre=consola.nextLine();
            
            while(!nombreValido(nombre)){
                System.out.println("nombre no valido, ingrese un nombre valido");
                nombre=consola.nextLine();
            }
            
            
            System.out.println("ingresa la cedula para "+ nombre + ": ");
            String cedula=consola.nextLine();
            while(!valiCedula(cedula)){
            System.out.println("cedula no valida, por favor ingrese una cedula valida");
            cedula=consola.nextLine();
            }
            
            int cedulaa =Integer.parseInt(cedula);
            
            
            System.out.println("ingrese el sueldo= ");
            double sueldo=consola.nextDouble();
            System.out.println("ingrese su telefono= ");
            int celular=consola.nextInt();
            consola.nextLine();
            System.out.println("ingrese su genero= ");
            char genero=consola.nextLine().charAt(0);
            personas[i]=new Persona(nombre, cedulaa, sueldo,celular, genero);
           
        }
    }
    

    @Override
    public void mostrarArreglo(Persona personas[]) {
               for (Persona nombre : personas) {
            System.out.println("nombre persona = " + nombre);
        }
    }
    
}
