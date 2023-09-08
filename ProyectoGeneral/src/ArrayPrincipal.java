import estructuradatos.Controladores;
import estructuradatos.Persona;

import java.util.Scanner;

public class ArrayPrincipal {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int tamanio = Integer.parseInt(consola.nextLine());

        Persona personas[] = new Persona[tamanio];

        Controladores controlador = new Controladores();

        controlador.llenarArreglo(personas, consola);
        controlador.mostrarArreglo(personas);
        controlador.buscarNombre(personas);
        controlador.burcarCedula(personas);

        consola.close();

        /*personas [0] = new Persona("Jose Mendoza");
        personas [1] = new Persona("Joshua Avendaño");
        personas [2] = new Persona("Alex Quintero");
        personas [3] = new Persona("Ediver Cristin");
        personas [4] = new Persona("Jhon Jairo");*/







    }

}
