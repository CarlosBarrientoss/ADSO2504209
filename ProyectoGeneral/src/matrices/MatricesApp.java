package matrices;

import java.util.Scanner;

public class MatricesApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Persona persona = new Persona();
        llenarMatrizGeneral(persona, scanner);
        mostrarMatrizGeneral(persona);
        
        Fruta fruta = new Fruta();
        llenarMatrizGeneral(fruta, scanner);
        mostrarMatrizGeneral(fruta);
        
        scanner.close();
    }

    public static void llenarMatrizGeneral(IMatriz matriz, Scanner scanner) {
        matriz.llenarMatriz(scanner);
    }

    public static void mostrarMatrizGeneral(IMatriz matriz) {
        matriz.mostrarMatriz();
    }
}
