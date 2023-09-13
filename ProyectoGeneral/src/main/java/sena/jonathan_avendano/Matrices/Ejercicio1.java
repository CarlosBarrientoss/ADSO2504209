package sena.jonathan_avendano.Matrices;

public class Ejercicio1 {
    public static void main(String[] args) {
                int[][] matriz = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
                int sumaDiagonal = 0;

                for (int i = 0; i < matriz.length; i++) {
                    sumaDiagonal += matriz[i][i];
                }

                System.out.println("La suma de la diagonal es: " + sumaDiagonal);
    }
}