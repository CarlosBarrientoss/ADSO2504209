package ejerciciosmatrices;

import java.util.Scanner;

public class RenglonesColumnasApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas: ");
        int cantidadFila = Integer.parseInt(scanner.nextLine());
        // int cantidadFila = 2;
        System.out.print("Ingrese la cantidad de columnas: ");
        int cantidadColumna = Integer.parseInt(scanner.nextLine());
        // int cantidadColumna = 3;

        int[][] matriz = new int[cantidadFila][cantidadColumna];

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
        System.out.println("========================================");
        
        // sumatoria filas
        int[] sumatoriaFilas = new int[cantidadFila];
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumatoriaFilas[i] += matriz[i][j];
            }
        }
        
        // sumatoria columnas
        int[] sumatoriaColumnas = new int[cantidadColumna];

        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumatoriaColumnas[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%5s", matriz[i][j]);

                if(j == matriz.length - 1) {
                    // System.out.print("\n");
                    // System.out.println("| = " + sumatoriaFilas[i] + "\n");
                }
            }

            System.out.print(" | " + sumatoriaFilas[i] + "\n");
        }
        System.out.println("--------------------------------");
        for (int col : sumatoriaColumnas) {
            System.out.printf("%5s", col);
        }

        scanner.close();
    }
}
