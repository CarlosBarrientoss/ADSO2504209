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
        int contadorVocales;

        for (String[] fila : palabras) {
            for (String celda : fila) {
                contadorCincoOMas += celda.length() >= 5 ? 1 : 0;
                if (celda.length() > 0 && Character.isLetter(celda.charAt(0))) {
                    contadorInicioAlfabetico++;
                } else {
                    contadorInicioAlfabetico =+ 0;
                    
                }
                    contadorVocales = 0;
                    
                    for (int i = 0; i < celda.length(); i++) {
                        char caracter = Character.toLowerCase(celda.charAt(i)); // Convertir a minúsculas para hacer la comparación
                        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                            contadorVocales++;
                            if (contadorVocales >= 3) {
                                break; // Detener la búsqueda tempranamente si ya hemos encontrado al menos tres vocales
                            }
                        }
                    }     
                    if (contadorVocales >= 3) {
                        contadorContiene3Vocales++;
                    } else {
                        contadorContiene3Vocales = contadorContiene3Vocales + 0;
                    }                   
                
            }
        }
        System.out.println("Hay " + contadorCincoOMas + " palabras con cinco o mas letras");
        System.out.println("Hay " + contadorInicioAlfabetico +  " con inicio alfabetico");
        System.out.println("Hay " + contadorContiene3Vocales + " palabras con 3 vocales");
    }
}
