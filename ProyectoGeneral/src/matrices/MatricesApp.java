package matrices;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class MatricesApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Personas persona = new Personas();
        llenarMatrizGeneral(persona, sc);
        mostrarMatrizGeneral(persona);

        Frutas fruta = new Frutas();
        llenarMatrizGeneral(fruta, sc);
        mostrarMatrizGeneral(fruta);
        //int [][] matrizEnteros = new int [10][10];

        /*matrizEnteros [0][0] = 1;
        matrizEnteros [0][1] = 2;
        matrizEnteros [0][2] = 3;

        matrizEnteros [1][0] = 4;
        matrizEnteros [1][1] = 5;
        matrizEnteros [1][2] = 6;

        matrizEnteros [2][0] = 7;
        matrizEnteros [2][1] = 8;
        matrizEnteros [2][2] = 9;

        //Llenando los valores de la matriz
        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[i].length; j++) {
                matrizEnteros [i][j] = (int) (Math.random() * 10) + 1;
            }
        }

        // Mostrando los valores de la matriz
        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[i].length; j++) {

                System.out.print("[" + i + "-" + j +"] = " + matrizEnteros[i][j] + " ");
            }

            System.out.println();
        }*/



    }

    public static void llenarMatrizGeneral(IMatriz persona, Scanner sc) {
        persona.llenarMatriz(sc);

    }

    public static void mostrarMatrizGeneral(IMatriz persona) {
        persona.mostarMatriz();
    }
}
