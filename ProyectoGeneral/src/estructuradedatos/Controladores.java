package estructuradedatos;

import java.util.Scanner;

public class Controladores implements IArregloPersona {

    @Override
    public void llenarArreglo(Persona[] personas, Scanner scanner) {
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Indique el nombre de la persona " + (i + 1) + ": ");
            personas[i] = new Persona(scanner.nextLine());
        }
    }

    @Override
    public void mostrarArreglo(Persona personas[]) {
        for (Persona persona : personas) {
            System.out.println("La persona es: " + persona.toString());
        }
    }
    
}
