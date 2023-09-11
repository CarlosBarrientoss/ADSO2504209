import estructura_de_datos.Controladores;
import estructura_de_datos.Persona;

import java.util.Scanner;

public class ArrayPrincipal {
    public static void main(String[] args) {


        Persona persona[]= new Persona[5];
        Scanner consola = new Scanner(System.in);
        Controladores controlador = new Controladores();


        controlador.llenarArreglo(persona, consola);
        controlador.mostrarArreglo(persona);


        consola.close();
    }


}
