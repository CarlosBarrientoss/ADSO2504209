import java.util.Scanner;

import estructuradedatos.Persona;
import estructuradedatos.Controladores;


public class ArrayPrincipal{
    
    public static void main (String[] args){
        
        Persona personas[] = new Persona[5];

        Scanner entrada = new Scanner(System.in);

        Controladores controlador = new Controladores();
        
        controlador.llenarArreglo(personas, entrada);
        
        controlador.mostrarArreglo(personas);

        controlador.buscar(personas);

        controlador.buscarCedula(personas);

        entrada.close();


    
    }
    
      
}