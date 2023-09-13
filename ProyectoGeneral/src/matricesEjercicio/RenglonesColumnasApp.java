import java.util.Scanner;

public class RenglonesColumnasApp {
        public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de filas :");

        int filas = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese la cantidad de columnas :");

        int columnas = Integer.parseInt(entrada.nextLine());

        int[][] matriz = new int[filas][columnas];

        // llenar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);         
            }
        }

        // mostrar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] +"]");
            }
            System.out.println("");
        }

        // sumar filas
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
                suma += matriz[i][j];
            }
            System.out.printf("= %d\n", suma);
        }

        // sumar columnas
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.print("___");
        }
        System.out.println();
        // Luego recorrer por columna i sumar
        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            System.out.printf("%d ", suma);
        }
        System.out.println();
}
}