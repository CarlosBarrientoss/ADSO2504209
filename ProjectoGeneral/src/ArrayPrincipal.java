import estructura_de_datos.Controladores;
import estructura_de_datos.Persona;

import java.util.Scanner;

public class ArrayPrincipal {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("por favor ingrese el tamaño del vector; ");
        int tamanio = Integer.parseInt(consola.nextLine());


        Persona persona[]= new Persona[1];

        Controladores controlador = new Controladores();


        controlador.llenarArreglo(persona, consola);
        controlador.buscarNombre(persona);
        controlador.mostrarArreglo(persona);
        controlador.buscarCedula(persona);


        consola.close();
    }


}
