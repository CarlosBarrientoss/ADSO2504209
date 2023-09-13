import java.util.Scanner;

public class MatrizCuadradaApp {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la matriz :");

        int size = Integer.parseInt(entrada.nextLine());

        int[][] matriz = new int[size][size];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);         
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%6s","[" + matriz[i][j] +"]");
            }
            System.out.println("");
        }


        int acumulador = 0;

        for (int i = 0; i < size; i++) {
            acumulador += matriz[i][i];
        }

        System.out.println("La suma de la diagonal del matriz es " + acumulador);
    }


}
