package sena.juanCeferino.estructuradedatos;
import java.util.Scanner;
public class arrayPrincipal {
    public static void main(String[] args) {
        Scanner into = new Scanner(System.in);
        Persona personas[] = new Persona[5];

        llenarArreglo(personas, into);
        mostrarArreglo(personas);
    }

    public static void llenarArreglo(Persona[] personas, Scanner into ) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingresa el nombre de la persona: " +  (i + 1 ) + ":" );
            personas[i] = new Persona(into.nextLine());
        }
    }

    public static void mostrarArreglo(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println("" + personas[i]);
        }
    }
}
