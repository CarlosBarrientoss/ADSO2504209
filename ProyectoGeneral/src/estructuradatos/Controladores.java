package estructuradatos;

import java.util.Scanner;

public class Controladores implements  IArregloPersona {

    @Override
    public void llenarArreglo(Persona personas[], Scanner consola) {
        //Llenar arreglos de objetos
        for (int i = 0; i < personas.length; i++){
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ":");
            personas[i] = new Persona(consola.nextLine());
        }
    }

    @Override
    public void mostrarArreglo(Persona personas[]) {
        for (Persona nombre : personas){
            System.out.println("nombre = " + nombre);
        }

    }
}
