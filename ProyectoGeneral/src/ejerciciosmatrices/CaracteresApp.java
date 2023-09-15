package ejerciciosmatrices;

import java.util.Scanner;
import java.lang.Character;

public class CaracteresApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		char[] vocales = {'a','A','e','E','i','I','o','O','u','U'};

		// Llenar arreglo --------------------------------------------------
        String[][] palabras = new String[3][4];
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length; j++) {

                System.out.print("Ingrese la palabra " + i + "," + j + ": ");
                palabras[i][j] = scanner.nextLine();
            }
        }

		// Contar en base a criterios -----------------------------------------
        int contSobreCuatroChar = 0;
        int contInicioAlfabetico = 0;
        int contTresCharOMas = 0;

        for (String[] fila : palabras) {
            for (String celda : fila) {
				if (tieneCioncoOMasCaracteres(celda)) {
					contSobreCuatroChar++;
				}

				if (tieneInicialAlfabetico(celda)) {
					contInicioAlfabetico++;
				}

				if (tieneTresOMasVocales(celda, vocales)) {
					contTresCharOMas++;
				}
            }
        }
		// Mostrar el arreglo de palabras ------------------------------------
        System.out.println();
		imprimirMatriz(palabras);

		// Mostrar contadores -------------------------------------------------
        System.out.println();
		System.out.println("Hay " + contSobreCuatroChar + " palabras con 5 o mas caracteres");
		System.out.println("Hay " + contInicioAlfabetico + " palabras que inician con caracter alfabetico");
		System.out.println("Hay " + contTresCharOMas + " palabras con al menos 3 vocales");

		verificador(palabras, vocales);
    }

	static void verificador(String[][] palabras, char[] vocales) {
		String[][] longitud5 = new String[3][4];
		String[][] empiezaVocal = new String[3][4];
		String[][] alMenos3 = new String[3][4];

		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < palabras[i].length; j++) {
				if (tieneCioncoOMasCaracteres(palabras[i][j])) {
					longitud5[i][j] = palabras[i][j];
				}
				else
				{
					longitud5[i][j] = "-------";
				}
				if (tieneInicialAlfabetico(palabras[i][j])) {
					empiezaVocal[i][j] = palabras[i][j];
				}
				else
				{
					empiezaVocal[i][j] = "-------";
				}
				if (tieneTresOMasVocales(palabras[i][j], vocales)) {
					alMenos3[i][j] = palabras[i][j];
				}
				else
				{
					alMenos3[i][j] = "-------";
				}
			}
		}
		System.out.println("***** cinco chars *****");
        System.out.println();
		imprimirMatriz(longitud5);
		System.out.println("***** empieza alfabetico *****");
        System.out.println();
		imprimirMatriz(empiezaVocal);
		System.out.println("***** 3 vocales *****");
        System.out.println();
		imprimirMatriz(alMenos3);

	}

	static void imprimirMatriz(String[][] matriz) {
		for (String[] fila : matriz) {
			for (String celda : fila) {
				System.out.printf("%-15s" , celda);
			}
			System.out.println();
		}
	}

	static boolean tieneCioncoOMasCaracteres(String palabra) {
		return palabra.length() >= 5;
	}
	static boolean tieneInicialAlfabetico(String palabra) {
		char c = palabra.charAt(0);
		return Character.isLetter(c);
		// return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
	}

	static boolean tieneTresOMasVocales(String palabra, char[] vocales) {
		int coincidencias = 0;
		for (int i = 0; i < palabra.length(); i++) {
			for (char vocal : vocales) {
				if (vocal != palabra.charAt(i)) {
					continue;
				}
				coincidencias++;
				break;
			}
			if (coincidencias >= 3) {
				return true;
			}
		}
		return false;
	}
}
