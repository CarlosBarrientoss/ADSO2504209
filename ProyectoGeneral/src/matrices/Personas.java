package matrices;

import java.util.Scanner;

public class Personas implements IMatriz{

    String nombre;

    int edad;

    Personas [][]matrizPersona;

    public Personas (){

        matrizPersona = new Personas[2][2];
    }

    public Personas(String nombre, int edad){
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

    public Personas[][] getMatrizPersona() {
        return matrizPersona;
    }

    public void setMatrizPersona(Personas[][] matrizPersona) {
        this.matrizPersona = matrizPersona;
    }

    @Override
    public void llenarMatriz(Scanner sc) {
        //Llenando los valores de la matriz
        for (int i = 0; i < matrizPersona.length; i++) {
            for (int j = 0; j < matrizPersona[i].length; j++) {
                System.out.println("Ingrese el nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Ingrese la edad de " + nombre + ":");
                int edad = sc.nextInt();
                matrizPersona [i][j] = new Personas(nombre, edad);
                sc.nextLine();
            }
        }
    }

    @Override
    public void mostarMatriz() {
        // Mostrando los valores de la matriz
        for (int i = 0; i < matrizPersona.length; i++) {
            for (int j = 0; j < matrizPersona[i].length; j++) {
                System.out.print("Nombre: " + matrizPersona[i][j].getNombre() + " ");
                System.out.print("Edad: " + matrizPersona[i][j].getEdad() + " \"");
            }
            System.out.println();
        }
    }
}
