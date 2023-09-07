package estructuradedatos;

import java.util.Scanner;

public class Controladores implements IArregloPersona {

    @Override
    public void llenarArreglo(Persona personas[], Scanner entrada) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese la persona #" + (i + 1));
            personas[i] = new Persona(entrada.nextLine());
        }

    }

    @Override
    public void mostrarArreglo(Persona personas[]) {
        for (Persona persona : personas) {
            System.out.println("La persona es " + persona);
        }

    }



    
}
