package sena.william_pena.recess_exercises.first_section;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String name = in.nextLine();

        System.out.println(String.format("El nombre almacenado en la variable 'name' es: %s", name));
    }
}
