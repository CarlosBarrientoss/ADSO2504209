package matrices;

import java.util.Scanner;

public class TemperaturaApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        double[][] temperatura = new double[24][7];

        //llenar mattiz con las temperaturas
        for (int i = 0; i < temperatura.length; i++){
            //llenando las columnas de cada fila
            for (int j = 0; j<temperatura[i].length; j++){
                temperatura[i][j] = Math.random( ) * (20) + 20;

            }
        }

        //creacion del vector unidimencional para guardar el promedio de los dias

        double[] promedioDias = new double[7];
        for (int j = 0; j < promedioDias.length;j++){
            double promedio =0;
            for (int i = 0; i< temperatura.length;i++) {
                promedio += temperatura[i][j];
            }
            promedioDias[j] = promedio / temperatura.length;


        }
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        for (int i = 0; i<promedioDias.length;i++) {
            System.out.printf("El promedio de la temperatura de el "+ diasSemana[i] +": %.2f \n" ,promedioDias[i]);
        }

        int i;
        do {
            System.out.println("Ingresar la hora a calcular la temperatura promedio de la hora indicada: ");
            i = Integer.parseInt(consola.nextLine());
        }while (i<0|| i>23);

        double promedioSemana = 0;

        for (int j = 0; j < temperatura[0].length; j++) {
            promedioSemana += temperatura[i][j];


        }

        System.out.printf("La temperatura promedio de la semena a las horas fue de: %.2f", promedioSemana/temperatura[0].length );






    }
}
