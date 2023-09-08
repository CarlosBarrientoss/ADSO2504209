package estructura_de_datos;

import java.util.Scanner;

public class Controladores implements IArregloPersona {


    @Override
    public void llenarArreglo(Persona persona[], Scanner consola) {
        for (int i = 0; i<persona.length; i++){
            System.out.println("Ingrese el nombre en la posicion 1: " + (i+1) + " ");
            String nombre = consola.nextLine();
            System.out.println("Ingrese la cedula para "+ nombre+":");
            int cedula = consola.nextInt();
            consola.nextLine();
            persona[i] = new Persona(nombre, cedula);
        }
    }

    @Override
    public void mostrarArreglo(Persona persona[]) {
        for(Persona nombre : persona){
            System.out.println("nombre persona el: " + nombre);
        }
    }
}
