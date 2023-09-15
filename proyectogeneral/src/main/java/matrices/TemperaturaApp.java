package matrices;

import java.util.Scanner;

public class TemperaturaApp {
    public static void main(String[] args) {
        
        Scanner consola= new Scanner(System.in);
        
         
        double[][] temperatura = new double [24] [7];
        
        //llenar la matriz con as temperaturas
        for (int i = 0; i < temperatura.length; i++) {
            //llenar las columnas de cada fila 
            for (int j = 0; j < temperatura[i].length; j++) {
                temperatura[i][j] =Math.random()*(20) +20;
            }         
        }
        
        //creacion del vector unidimensional para guardar el promodio
        
        double[] promedioDias= new double[7];
        for (int j = 0; j < promedioDias.length; j++) {
            double promedio=0;
            
            for (int i = 0; i < temperatura.length; i++) {
                promedio +=  temperatura[i][j];
                
            }
            promedioDias[j] = promedio/temperatura.length;
            
        }
        
        String[]dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        
          for (int i = 0; i < promedioDias.length; i++) {
              System.out.printf("El promedio de temperatura el dia " + dias[i]+ " es %.2f \n ", promedioDias[i]);
           
         }
          int i;
         do{System.out.println("ingrese la hora a calcular la temperatura promedio de la semana a una hora indicada ( 0 a 23");
            
           i=Integer.parseInt(consola.nextLine());
         
         }while(i < 0 ||  i > 23);
          
         double promedioSemana = 0;
         
            for (int j = 0; j < temperatura[0].length; j++) {
                promedioSemana=promedioSemana + temperatura[i][j];
 
        }
         promedioSemana/= temperatura[0].length;
         System.out.printf("la temperatura promedio a las " + i + " fue de %.2f° \n", promedioSemana);
         
         
          
    }
}














