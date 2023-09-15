package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticaListas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear lista
        List<Integer> enteros = new ArrayList<>();

        // llenar lista con 3 elementos (CREATE)
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el numero " + (i+1));
            enteros.add(i, Integer.parseInt(scanner.nextLine()));
        }

        // Mostrar lista actual (READ)
        System.out.println("\nLa lista actual es:");
        for (int i = 0; i < enteros.size(); i++) {
            System.out.println("Numero " + i + ": " + enteros.get(i));
        }

        // Cambiando el elemento en la posicion 1 (empezando en cero) (UPDATE)
        System.out.print("Ingrese el nuevo valor para la posicion 2: ");
        enteros.set(1, Integer.parseInt(scanner.nextLine()));

        // Mostrar lista actual (READ)
        System.out.println("\nLa lista actual es:");
        for (int i = 0; i < enteros.size(); i++) {
            System.out.println("Numero " + i + ": " + enteros.get(i));
        }

        // Eliminando el primer elemento de la lista (DELETE)
        enteros.remove(0);

        // Mostrar lista actual (READ)
        System.out.println("\nLa lista actual es:");
        for (int i = 0; i < enteros.size(); i++) {
            System.out.println("Numero " + i + ": " + enteros.get(i));
        }
    }
}
