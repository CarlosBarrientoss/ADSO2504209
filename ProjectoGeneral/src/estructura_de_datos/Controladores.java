package estructura_de_datos;

import java.util.Scanner;

public class Controladores implements IArregloPersona {


    @Override
    public void llenarArreglo(Persona persona[], Scanner consola) {
        for (int i = 0; i<persona.length; i++){
            System.out.println("Ingrese el nombre en la posicion 1: " + (i+1) + " ");
            persona[i] = new Persona(consola.nextLine());
        }
    }

    @Override
    public void mostrarArreglo(Persona persona[]) {
        for(Persona nombre : persona){
            System.out.println("nombre persona el: " + nombre);
        }
    }
}
