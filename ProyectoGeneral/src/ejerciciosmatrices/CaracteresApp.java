package ejerciciosmatrices;
// TODO: ejercicio sin terminar
import java.util.Scanner;

public class CaracteresApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] palabras = new String[3][4];
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length; j++) {
                
                System.out.print("Ingrese la palabra " + i + "," + j + ": ");
                palabras[i][j] = scanner.nextLine();
            }
        }

        int contadorCincoOMasCaracteres = 0;
        int contadorInicaAlfabetico = 0;
        int contadorContieneAlMenosTresVocales = 0;

        for (String[] fila : palabras) {
            for (String celda : fila) {
                contadorCincoOMasCaracteres += celda.length() >= 5 ? 1 : 0;
            }
        }
    }
}
