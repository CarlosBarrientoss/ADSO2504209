package sena.william_pena.matrix_exercises;

public class exercise3 {
    public static void main(String... args) {
        int[][] matrix = new int[4][4];
        int sumTotal = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10) + 1;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
                sumTotal += matrix[i][i];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println("");
        }

        System.out.println(String.format("\nEl total de la suma de la diagonal es: %d", sumTotal));
    }
}
