package matrices;

public class Diagonal {
    public static void main(String[] args) {
       
        int [][] matriz = new int [5][5];
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]  = (int) (Math.random()*100)+1;
                if ( i ==j){
                suma += matriz[i][j];
        }
                
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + i + "-" + j +"] = " + matriz[i][j]+ " ");
                
            }
            System.out.println("");
        }

        System.out.println("la suma de los numeros endiagonal es: " + suma);
        
        
    }
    
    
}
