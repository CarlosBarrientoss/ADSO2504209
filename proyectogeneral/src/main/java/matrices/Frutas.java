
package matrices;

import java.util.Scanner;

public class Frutas implements IMatriz {
    private String nombre;
    private double precio;
    private Frutas[][] matrizFrutas;
    
    public Frutas(){
        matrizFrutas= new Frutas[2][2];      
    }

    public Frutas(String nombre, double precio ) {
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
    public void llenarmatriz(Scanner consola) {
               for (int i=0; i <matrizFrutas.length; i++){
                for (int j=0; j<matrizFrutas[i].length;j++){
                System.out.print("ingrese su nombre= ");
                String nombre= consola.nextLine();
                System.out.print("ingresa el precio "+ nombre + "=");
                double precio= Double.parseDouble(consola.nextLine());
               
                 matrizFrutas[i][j] = new Frutas(nombre, precio);
               
           }
       }    
    }

    @Override
    public void mostrarmatriz() {
        for (int i = 0; i < matrizFrutas.length; i++) {
            for (int j = 0; j < matrizFrutas[i].length; j++) {
                System.out.print("nombre: "+ matrizFrutas[i][j].getNombre()+ " ");
                System.out.println("precio: "+ matrizFrutas[i][j].getPrecio()+ " ");
//                System.out.println(matrizEnteros[i][j]);
            }
            System.out.println();
        }
    }
 
}
