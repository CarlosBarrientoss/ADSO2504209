import java.util.Scanner;

import estructuradedatos.Controladores;
import estructuradedatos.Persona;

public class ArrayPrincipal {
    public static void main(String[] args) {

        Persona personas[] = new Persona[5];
        Scanner scanner = new Scanner(System.in);

        Controladores controlador = new Controladores();

        controlador.llenarArreglo(personas, scanner);
        controlador.mostrarArreglo(personas);
    }
}
