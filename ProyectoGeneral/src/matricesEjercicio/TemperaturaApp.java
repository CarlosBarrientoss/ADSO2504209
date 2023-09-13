import java.util.Scanner;

public class TemperaturaApp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] temperatura = new double[24][7];
    

        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura[i].length; j++) {
                temperatura[i][j] = (int) (Math.random() * 20) + 20;
            }
        }


        // for (int i = 0; i < temperatura.length; i++) {
        //     for (int j = 0; j < temperatura[i].length; j++) {
        //         System.out.print(String.format("%-11s", "["+ i + "," + j + "] = " + temperatura[i][j] + " "));
                
        //     }
        //     System.out.println("");
        // }   
    

        
        //Creacion del vector unidimensional

        double[] promedioDias = new double[7];


        for (int j = 0; j < promedioDias.length; j++) {
            double promedio = 0;

            for (int i = 0; i < temperatura.length; i++){
                 promedio += temperatura[i][j];
            }
            promedioDias[j] =  promedio / temperatura.length;
        }   

        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        for (int i = 0; i < promedioDias.length; i++) {

            System.out.printf("El promedio de temperatura %s es %.2f \n" , dias[i], promedioDias[i]);
        }

        int i ;
        do{
            System.out.println("Ingrese la hora para calcular la temperatura promedio a una hora indicada . Ingrese (0 - 23)");
            i = Integer.parseInt(entrada.nextLine());
        } while(i < 0 || i > 23);

        double promedioSemana = 0;

        for (int j = 0; j < temperatura[i].length; j++) {
            promedioSemana += temperatura[i][j];
        }

        double promedio = promedioSemana / temperatura[i].length;

        System.out.printf("El promedio de temperatura a la hora " + i + " es  %.2f \n",  promedio);

    }
                
}
    
