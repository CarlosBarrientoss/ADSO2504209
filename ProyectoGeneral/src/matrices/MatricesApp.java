package matrices;
import java.util.Scanner;

public class MatricesApp {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Instancia de personas
        // Persona persona = new Persona();

        // llenarMatrizGeneral(persona, entrada);
        // mostrarMatrizGeneral(persona);

        // Instancia de frutas
        Fruta fruta = new Fruta();

        llenarMatrizGeneral(fruta, entrada);

        mostrarMatrizGeneral(fruta);



            entrada.close();
    }

    public static void llenarMatrizGeneral(IMatriz persona, Scanner entrada){
        persona.llenarMatriz(entrada);
    }

    public static void mostrarMatrizGeneral(IMatriz persona){
        persona.mostrarMatriz();
    }



}
