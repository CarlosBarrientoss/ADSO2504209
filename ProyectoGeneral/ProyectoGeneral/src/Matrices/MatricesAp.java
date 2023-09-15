import java.util.Scanner;

public class MatricesAp {
    
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);

        // Personas persona = new Personas();
        // llenarMatrizGeneral(persona, consola);
        // mostrarMatrizGeneral(persona);
        Frutas fruta = new Frutas();
        llenarMatrizGeneral(fruta, consola);
        mostrarMatrizGeneral(fruta);

        //int [] [] matrizEnteros = new int[10] [10]; 
   
        // matrizEnteros [0][0] = 1;
        // matrizEnteros [0][1] = 2;
        // matrizEnteros [0][2] = 3;
        
        // matrizEnteros [1][0] = 4;
        // matrizEnteros [1][1] = 5;
        // matrizEnteros [1][2] = 6;
        
        // matrizEnteros [2][0] = 7;
        // matrizEnteros [2][1] = 8;
        // matrizEnteros [2][2] = 9;
    

        

        

        // for (int[] is : matrizEnteros) {
        //     for (int is2 : is) {
        //         System.out.print(is2 + " ");
        //     }
        //     System.out.println("");
        // }
   
   
   
    }


    public static void llenarMatrizGeneral (iMatriz persona, Scanner consola) {
        persona.llenarMatriz(consola);
    }

    public static void mostrarMatrizGeneral (iMatriz persona) {
        persona.mostrarMatriz();
    }

}
