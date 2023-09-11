/* Este archivo contiene ejemplos vistos en calse que en algún momento se eliminaron
 * para dar paso a otros ejemplos
 */
package matrices;

public class EjemplosMatricesAnteriores {
    public static void main(String[] args) {
        ejemplo1();
        ejemplo2();
        ejemplo3();
    }

    static void ejemplo3() {

    }

    static void ejemplo2() {
        int cantFilas = 10;
        int cantColumnas = 10;
        int[][] matrizEnteros = new int[cantFilas][cantColumnas];

        // Llenar matriz
        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[i].length; j++) {                
                matrizEnteros[i][j] = (int)(Math.random() * 10) + 1;
            }
        }
        // Mostrar matriz
        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[i].length; j++) {
                // System.out.print("[" +i+","+j+ "] = " + matrizEnteros[i][j] + "  ");
                System.out.print(String.format("%-11s", "[" +i+","+j+ "] = " + matrizEnteros[i][j]));
            }
            System.out.println();
        }
    }

    static void ejemplo1() {
        int cantFilas = 3;
        int cantColumnas = 3;
        int[][] matrizEnteros = new int[cantFilas][cantColumnas];

        matrizEnteros[0][0] = 11;
        matrizEnteros[0][1] = 12;
        matrizEnteros[0][2] = 13;

        matrizEnteros[1][0] = 21;
        matrizEnteros[1][1] = 22;
        matrizEnteros[1][2] = 23;

        matrizEnteros[2][0] = 31;
        matrizEnteros[2][1] = 32;
        matrizEnteros[2][2] = 33;

        // Recorriendo con doble for
        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[i].length; j++) {
                System.out.print("[" +i+","+j+ "] = " + matrizEnteros[i][j] + "   ");
            }
            System.out.println();
        }
        // Recorriendo con doble foreach
        for (int[] filas : matrizEnteros) {
            for (int celda : filas) {
                System.out.println("::"+celda);
            }
        }
        // Mostrando en forma de matriz
        for (int[] filas : matrizEnteros) {
            for (int celda : filas) {
                System.out.print(celda + "  ");
            }
            System.out.println("");
        }
    }
}
