import java.util.Scanner;

import estructuradedatos.Persona;
import estructuradedatos.Controladores;


public class ArrayPrincipal{
    
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del vector");
        int size = Integer.parseInt(entrada.nextLine());

        Persona personas[] = new Persona[size];
    

        Controladores controlador = new Controladores();
        
        controlador.llenarArreglo(personas, entrada);
        
        controlador.mostrarArreglo(personas);

        controlador.buscarNombre(personas, entrada);
        controlador.buscarCedula(personas, entrada);
        entrada.close();
    
    }
    
      
}