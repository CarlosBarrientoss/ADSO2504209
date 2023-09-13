import java.util.Scanner;

public class MatrizCaracteres {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palabras[][] = new String[3][4];

        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length; j++) {
                System.out.println("Ingrese una palabra [" + i + "," + j + "]");
                String palabra = entrada.nextLine();
                palabras[i][j] = palabra;
            }
        }
        
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length; j++) {
                System.out.print("[" + palabras[i][j] +"]");
            }
            System.out.println("");
        }

        int contadorCincoOMas = 0;
        int contadorInicioAlfabetico = 0;
        int contadorContiene3Vocales = 0;

        for (String[] fila : palabras) {
            for (String celda : fila) {
                
                contadorCincoOMas += celda.length() >= 5 ? 1 : 0;
                           
            }
        }

        // En proceso

    }
}
