package matrices;

import java.util.Scanner;

public class Persona implements IMatriz{
    
    private int edad;
    private String nombre;
    private Persona[][] matrizPersona;

    public Persona() {
        this.matrizPersona = new Persona[2][2];
    }
    

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[][] getMatrizPersona() {
        return matrizPersona;
    }

    public void setMatrizPersona(Persona[][] matrizPersona) {
        this.matrizPersona = matrizPersona;
    }

    @Override
    public void llenarMatriz(Scanner scanner) {
        for (int i = 0; i < matrizPersona.length; i++) {
            for (int j = 0; j < matrizPersona[i].length; j++) {

                System.out.print("Ingrese el nombre de la persona: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la edad de " + nombre + ": ");
                int edad = Integer.parseInt(scanner.nextLine());

                matrizPersona[i][j] = new Persona(edad, nombre);
            }
        }
    }

    @Override
    public void mostrarMatriz() {
        for (int i = 0; i < matrizPersona.length; i++) {
            for (int j = 0; j < matrizPersona[i].length; j++) {
                System.out.print("["+i+","+j+"]:");
                System.out.print("(Nombre: " + matrizPersona[i][j].nombre);
                System.out.print(",Edad: " + matrizPersona[i][j].edad + ")   ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
    }
}
