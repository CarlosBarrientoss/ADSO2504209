import java.util.Scanner;

import estructuradedatos.Controladores;
import estructuradedatos.Persona;

public class ArrayPrincipal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de elementos en el vector");
        int cantidad = Integer.parseInt(scanner.nextLine());

        Persona personas[] = new Persona[cantidad];

        Controladores controlador = new Controladores();

        controlador.llenarArreglo(personas, scanner);
        // controlador.mostrarArreglo(personas);

        // controlador.buscarNombre(personas, scanner);
        controlador.buscarCedula(personas, scanner);

        scanner.close();
    }
}
