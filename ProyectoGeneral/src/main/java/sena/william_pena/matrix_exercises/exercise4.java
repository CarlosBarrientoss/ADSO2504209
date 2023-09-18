package sena.william_pena.matrix_exercises;

import java.util.Arrays;

public class exercise4 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int[] columnsSum = new int[4];
        int[] rowsSum = new int[4];
        int columnSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10) + 1;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            rowsSum[i] = Arrays.stream(matrix[i]).sum();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                columnSum += matrix[j][i];
            }
            columnsSum[i] = columnSum;
            columnSum = 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "    ");
                if((j + 1) == matrix[i].length){
                    System.out.print("=  " + rowsSum[i]);
                }
            }
            System.out.println("");
        }
        System.out.println("=    =    =    =");

        for (int i = 0; i < columnsSum.length; i++) {
            System.out.print(columnsSum[i] + "   ");
        }
    }
}
