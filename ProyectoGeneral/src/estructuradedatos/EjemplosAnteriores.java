// Estos ejemplos fueron escritos durante clase pero
// fueron eliminados para escribir otros ejemplos
package estructuradedatos;

import java.util.Scanner;

public class EjemplosAnteriores {
    public static void ejemplo1() {
        int numeros[] = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        System.out.println("Posición 3: " + numeros[3]);
        System.out.println("Posición 1: " + numeros[1]);
        System.out.println("Posición 2: " + numeros[2]);
        System.out.println("Posición 4: " + numeros[4]);
        System.out.println("Posición 0: " + numeros[0]);
    }

    public static void ejemplo2() {
        String[] nombres = new String[5];

        nombres[0] = "Roberto";
        nombres[1] = "Ricardo";
        nombres[2] = "Antonio";
        nombres[3] = "Kenan";

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre en la posición " + i + ": " + nombres[i]);
        }

        System.out.println("");

        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
    }
    public static void ejemplo3() {
        Persona[] personas = new Persona[5];

        personas[0] = new Persona("Kel");
        personas[1] = new Persona("Drake");
        personas[2] = new Persona("Josh");
        personas[3] = new Persona("Vash");
        personas[4] = new Persona("Lucas");

        for (int i = 0; i < personas.length; i++) {
            System.out.println("La persona " + i + " es: " + personas[i].toString());
        }

        System.out.println("");

        for (Persona persona : personas) {
            System.out.println("La persona es: " + persona.toString());
        }
    }
    public static void ejemplo4() {
        Persona[] personas = new Persona[5];
        Scanner scanner = new Scanner(System.in);

        // Llenar el arreglo de objetos
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Indique el nombre de la persona " + (i + 1) + ": ");
            personas[i] = new Persona(scanner.nextLine());
        }
        
        // Mostrar arreglo de objetos
        for (Persona persona : personas) {
            System.out.println("La persona es: " + persona.toString());
        }
    }
    public static void ejemplo5() {
        Persona personas[] = new Persona[5];
        Scanner scanner = new Scanner(System.in);

        llenarArreglo(personas, scanner);        
        mostrarArreglo(personas);
    }
    public static void llenarArreglo(Persona[] personas, Scanner scanner) {
        // Llenar el arreglo de objetos
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Indique el nombre de la persona " + (i + 1) + ": ");
            personas[i] = new Persona(scanner.nextLine());
        }
    }
    public static void mostrarArreglo(Persona personas[]) {
        // Mostrar arreglo de objetos
        for (Persona persona : personas) {
            System.out.println("La persona es: " + persona.toString());
        }
    }
}
