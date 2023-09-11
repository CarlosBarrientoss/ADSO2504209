package matrices;

import java.util.Scanner;

public class Persona implements IMatriz {

    Scanner consola = new Scanner(System.in);
    private String nombre;
    private int edad;
    private Persona[][] matrizPersona;

    public Persona() {
        matrizPersona = new Persona[2][2];
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona[][] getMatrizPersona() {
        return matrizPersona;
    }

    public void setMatrizPersona(Persona[][] matrizPersona) {
        this.matrizPersona = matrizPersona;
    }

    @Override
    public void llenarMatriz(Scanner consola) {
        for (int i = 0; i < matrizPersona.length; i++) {
            for (int j = 0; j < matrizPersona[i].length; j++) {
                System.out.println("Ingrese el nombre: ");
                String nombre = consola.nextLine();

                System.out.println("Ingresa la edad de: "+nombre+ ": ");
                int edad = Integer.parseInt(consola.nextLine());
                matrizPersona[i][j] = new Persona(nombre, edad);
            }
        }
    }

    @Override
    public void mostrarMatriz() {
        for (int i = 0; i < matrizPersona.length; i++) {
            for (int j = 0; j < matrizPersona[i].length; j++) {
                System.out.print("Nombre: " + matrizPersona[i][j].getNombre() + ". ");
                System.out.print("Edad: " + matrizPersona[i][j].getEdad() + ". ");
            }
        }
    }
}