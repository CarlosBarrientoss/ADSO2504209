package ejerciciosmatrices;

import java.util.Scanner;

public class MatrizCuadradaApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz: ");
        int tamano = Integer.parseInt(scanner.nextLine());

        int[][] matriz = new int[tamano][tamano];

        // Llenar con numeros al azar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }

        // Mostrar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf( "%5s", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
        int acumulador = 0;
        for (int i = 0; i < tamano; i++) {
            acumulador += matriz[i][i];
        }

        System.out.println("La suma de la diagonal principal es: " + acumulador);
        scanner.close();
    }
}
