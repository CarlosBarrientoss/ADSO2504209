package matrices;

import java.util.Scanner;

public class matricesApp{

    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        Persona persona = new Persona();
 
// llenarMatriz(persona, consola);
// mostrarMatriz(persona, consola);

Frutas fruta = new Frutas();
llenarMatriz(fruta, consola);
mostrarMatriz(fruta);



        // int[] [] matrizEntero = new int[10] [10];

// matrizEntero[0] [0] =1;
// matrizEntero[0] [1] =2;
// matrizEntero[0] [2] =3;

// matrizEntero[1] [0] =4;
// matrizEntero[1] [1] =5;
// matrizEntero[1] [2] =6;

// matrizEntero[2] [0] =7;
// matrizEntero[2] [1] =8;
// matrizEntero[2] [2] =9;

    }


public static void llenarMatriz(IMatriz persona, Scanner consola){
    persona.llenarMatriz(consola);
}
public static void mostrarMatriz(IMatriz persona){
    persona.mostrarMatriz();
}}