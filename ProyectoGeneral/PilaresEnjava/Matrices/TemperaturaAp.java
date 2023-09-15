package Matrices;

import java.util.Scanner;

public class TemperaturaAp{

     public static void  main(String[] args) {
        Scanner consola = new Scanner(System.in);

        double[][] temperatura = new double[24][7];

        //Llenar la matriz con las tempaeraturas

        for (int i = 0; i < temperatura.length; i++) {
            //Llenar las columnas de cada fila
            for (int j = 0; j < temperatura[i].length; j++) {
                temperatura[i][j] = Math.random() * (20) + 20;
                // System.out.println("La temperatura es: " + temperatura[i][j]);
                
            }
        }

        //Creacion de vector unidimensional para guardar el promedio de los dias 

        double [] promedioDias = new double[7];
        
        for (int j = 0; j < promedioDias.length; j++){
           double promedio = 0;
            for ( int i = 0; i < temperatura.length; i++){
                promedio += temperatura[i][j];
        
            }
            promedioDias[j] = promedio / temperatura.length;
            // System.out.println("El promedio de la temperatura del dia es %.2f \n  " + promedioDias[j]);
        }

        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"} ;
            for (int i = 0; i < promedioDias.length; i++) {
            System.out.printf("El promedio de la temperatura del es: " + dias[i] + "es %.2f \n" , promedioDias[i]);
        }
        
        
        int i;
        do {
            System.out.println("Ingrese la hora para calcular el promedio de la temperatura de la semana a una hora indicada. Ingrese (0 a 23): ");
            i = Integer.parseInt((consola.nextLine()));
        
        }while( i < 0 || i > 23);

        double promedioSemana = 0;
        
        for (int j = 0; j < temperatura[0].length; j++) {
            promedioSemana += temperatura [i][j];
        
        }
        System.out.println("El promedi de la semna es: " + promedioSemana / temperatura[0].length );
    }
}    