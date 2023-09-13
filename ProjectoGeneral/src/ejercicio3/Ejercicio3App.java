package ejercicio3;

public class Ejercicio3App {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int sumaDiagonal=0;

        //llenar mattiz con las temperaturas
        for (int i = 0; i < matriz.length; i++){
            //llenando las columnas de cada fila
            for (int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = (int) Math.random( ) * (20) + 20;
                System.out.print("\t["+matriz[i][j]+"}");
                if (i==j){
                    sumaDiagonal += matriz[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("La suma de la diagonal principal es de: "+ sumaDiagonal);

    }
}
