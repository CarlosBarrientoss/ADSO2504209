import java.util.Scanner;

public class Frutas implements iMatriz {
        String nombre;
        double precio;
        Frutas[][] matrizFrutas;
     
        
    
        public Frutas() {
            matrizFrutas = new Frutas[2][2];
        }

        public Frutas( String nombre, double precio){
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }



        public void setNombre(String nombre) {
            this.nombre = nombre;
        }



        public double getPrecio() {
            return precio;
        }



        public void setPrecio(double precio) {
            this.precio = precio;
        }



        public Frutas[][] getMatrizFrutas() {
            return matrizFrutas;
        }



        public void setMatrizFrutas(Frutas[][] matrizFrutas) {
            this.matrizFrutas = matrizFrutas;
        }



        @Override
        public void llenarMatriz(Scanner consola ) {
                    
        for (int i = 0; i < matrizFrutas.length; i++) {
            for (int j = 0; j < matrizFrutas[i].length; j++) {
                
                System.out.println(" Ingrese el nombre de la fruta: ");
                String nombre = consola.nextLine();
                
                System.out.println(" Ingrese el valor de la fruta:" + nombre + ":");
                double precio = Double.parseDouble(consola.nextLine()); 
                
                matrizFrutas[i][j] = new Frutas( nombre, precio);
        }
    }
}


        @Override
        public void mostrarMatriz() {
            for (int i = 0; i < matrizFrutas.length; i++) {
                for (int j = 0; j < matrizFrutas[i].length; j++) {
                    System.out.print("[" + i + "," + j +"] " + matrizFrutas[i][j]);
                }
                System.out.println();
            }
        }

        @Override
        public String toString() {
            return "Frutas [nombre=" + nombre + ", precio=" + precio + "]";
        }
    
        }
    

