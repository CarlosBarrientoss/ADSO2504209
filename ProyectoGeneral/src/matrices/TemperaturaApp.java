package matrices;

import java.util.Scanner;

public class TemperaturaApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double [][] temperatura = new double [24][7];

        //llenar la matriz con las temperatura
        for (int i = 0; i < temperatura.length; i++) {

            //llenando las columnas de cada fila
            for (int j = 0; j < temperatura[i].length; j++) {

                temperatura[i][j] = Math.random() * (20) + 20;

            }
        }

        //Creación del vector unidimensional para guardar el promedio de los dias
        double[]promedioDias = new double[7];

        for (int j = 0; j < promedioDias.length; j++) {
            
            double promedio = 0;
            
            for (int i = 0; i < temperatura.length; i++) {
                
                promedio += temperatura[i][j];
            }
            promedioDias[j] = promedio/ temperatura.length;
            //System.out.printf(" El promedio de temperatura del dia es: %.2f \n", promedioDias[j]);

        }

        String []  dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo"};
        for (int i = 0; i < promedioDias.length; i++) {
            System.out.printf(" El promedio de la temperatura del dia " + dias[i] + " es: %.2f \n", promedioDias[i]);


        }
        int i;
        do{
            System.out.println("Ingrese la hora a calcular el promedio de la temperatura de la semana. Ingrese ( 0 a 23 ) ");
            i = sc.nextInt();
        }while (i < 0 || i > 23);
        
        double promedioSemana = 0;
        for (int j = 0; j < temperatura[0].length; j++) {
            
            promedioSemana += temperatura[i][j];
            
        }
        promedioSemana /= temperatura[0].length;
        System.out.println("La temperatura promedio de la semana a una hora indicada  por el usuario " + i + " es: " + promedioSemana);
        

    }
}
