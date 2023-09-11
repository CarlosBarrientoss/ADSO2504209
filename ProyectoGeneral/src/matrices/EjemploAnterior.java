package matrices;

public class EjemploAnterior {

    public static void main(String[] args) {
        
    
        int[][] matrizEnteros = new int[3][3];

        matrizEnteros[0][0] = 1;
        matrizEnteros[0][1] = 2;
        matrizEnteros[0][2] = 3;

        matrizEnteros[1][0] = 4;
        matrizEnteros[1][1] = 5;
        matrizEnteros[1][2] = 6;

        matrizEnteros[2][0] = 7;
        matrizEnteros[2][1] = 8;
        matrizEnteros[2][2] = 9;

        for (int i = 0; i < matrizEnteros.length; i++) {
           for (int j = 0; j < matrizEnteros[i].length; j++) {
            matrizEnteros[i][j] = (int) (Math.random() * 10) + 1;}
           }
            
        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[i].length; j++) {
                System.out.print(String.format("%-11s", "["+ i + "," + j + "] = " + matrizEnteros[i][j] + " "));
            }
            System.out.println("");
        }        
           

        


        
        
        for (int[] filas : matrizEnteros) {
            for (int celdas : filas) {
                System.out.print(celdas + " ");
            }
            System.out.println("");
        }
}
}
