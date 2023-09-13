package ejerciciosmatrices;

import java.util.Scanner;

public class TemperaturaApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double[][] temperaturas = new double[24][7];

        // Llenar matriz
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas[i].length; j++) {
                temperaturas[i][j] = Math.random() * (20) + 20;
            }
        }
        // Creacion del vector unidimensional para guardar el promedio de los dias
        double[] promedioDias = new double[7];

        for (int j = 0; j < promedioDias.length; j++) {
            double promedio = 0;
            for (int i = 0; i < temperaturas.length; i++) {
                promedio += temperaturas[i][j];
            }
            promedioDias[j] = promedio / temperaturas.length;
            // System.out.printf("El promedio de temperatura el dia %d es: %.2f \n" , (j+1), promedioDias[j]);
        }

        String[] dias = {"Lunes", "Martes", "Miercoes", "Jueves", "Viernes", "Sabado", "Domingo"};

        for (int i = 0; i < promedioDias.length; i++) {
            System.out.printf("El promedio de temperatura el dia %s es: %.2f \n" , dias[i], promedioDias[i]);
        }

        int i;
        do {
            System.out.println("Ingrese la hora a calcular la temperatura promedio de la semana\na una hora indicada del dia - Ingrese: (0-23): ");
            i = Integer.parseInt(scanner.nextLine());
        } while (i < 0 || i > 23);

        scanner.close();

        double promedioSemana = 0;
        for (int j = 0; j < temperaturas[i].length; j++) {
            promedioSemana += temperaturas[i][j];
        }
        double promedio = promedioSemana / temperaturas[i].length;

        System.out.printf("El promedio de temperatura semanal a la hora " + i + " es: %.2f\n" , promedio);
    }
}
