package matrices;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int [][]matriz = new int[5][5];
        int sumaDiagonal = 0;
        //Llenando la matriz
        for (int i = 0; i < matriz.length; i++) {

            //llenando las columnas de cada fila
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] =(int) (Math.random() * 100) + 1;

                // sumando la diagonal

                if (i == j){
                    sumaDiagonal += matriz[i][j];

                }

            }
        }
        //Mostrando los datos de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.printf("[" + i + "-" + j +"] = " + matriz[i][j] + " ");
            }

            System.out.println();
        }

        //Mostrando el resultado
        System.out.printf("La suma de la diagonal principal es: " + sumaDiagonal);
    }
}
