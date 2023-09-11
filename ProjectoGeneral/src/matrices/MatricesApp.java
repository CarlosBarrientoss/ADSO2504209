    package matrices;

    import java.util.Scanner;

    public class MatricesApp {
        public static void main(String[] args) {
            Scanner consola = new Scanner(System.in);
            //Persona persona = new Persona();
            //llenarMatrizGeneral(persona, consola);
            //mostrarMatrizGeneral(persona);

            Frutas fruta = new Frutas();
            llenarMatrizGeneral(consola, fruta);
            mostrarMatrizGeneral(fruta);

            //int[][] matrizEnteros = new int[10][10];

           // matrizEnteros[0][0] = 1;
            //matrizEnteros[0][1] = 2;
            //matrizEnteros[0][2] = 3;

            //matrizEnteros[1][0] = 4;
            //matrizEnteros[1][1] = 5;
            //matrizEnteros[1][2] = 6;

            //matrizEnteros[2][0] = 7;
            //matrizEnteros[2][1] = 8;
            //matrizEnteros[2][2] = 9;

            }

        public static void llenarMatrizGeneral( Scanner consola, IMatriz fruta){
            //persona.llenarMatriz(consola);
            fruta.llenarMatriz(consola);
        }
        public static void mostrarMatrizGeneral(IMatriz fruta){
            //persona.mostrarMatriz();
            fruta.mostrarMatriz();
        }

    }


