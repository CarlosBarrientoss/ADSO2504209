package Matrices;

public class SumaDiagonal {

      public static void main(String[] args) {
        
        int[][] matriz = {

             {10, 5, 23,},
             {23, 5, 21},
             {12, 4, 18},
        
        };
       
        System.out.println("Por favor ingerese el tamaño de la matriz :");
        maTriz(matriz);
       
        int diagonalPrin = sumarDiagonal(matriz, "p");
        System.out.printf("La suma de la diagonal es: " + diagonalPrin);
    }


    static void maTriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numeroActual = matriz[i][j];
                System.out.printf("%5d", numeroActual);
            }
            System.out.println();
        }
    }

    static int sumarDiagonal(int[][] matriz, String diagonal) {
        int suma = 0;
        if (diagonal.equals("p")) {
            int j = 0, i = 0;
            while (j < matriz.length && i < matriz[0].length) {
                suma += matriz[i][j];
                j++;
                i++;
            }
        } 
            else {
                int x = 0, a = matriz.length - 1;
                while (x < matriz.length && a >= 0) {
                    suma += matriz[a][x];
                    x++;
                    a--;
             }
        }
            return suma;
    }
        
}
