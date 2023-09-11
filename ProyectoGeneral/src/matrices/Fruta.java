package matrices;

import java.util.Scanner;

public class Fruta implements IMatriz {
    private String nombre;
    private double precio;
    private Fruta[][] matrizFrutas;
    
    public Fruta(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Fruta(){
        matrizFrutas = new Fruta[2][2];
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

    public Fruta[][] getMatrizFrutas() {
        return matrizFrutas;
    }

    public void setMatrizFrutas(Fruta[][] matrizFrutas) {
        this.matrizFrutas = matrizFrutas;
    }

    @Override
    public void llenarMatriz(Scanner entrada) {
        for (int i = 0; i < matrizFrutas.length; i++) {
            for (int j = 0; j < matrizFrutas[i].length; j++) {
                System.out.println("Ingrese el nombre de la fruta");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese el precio de la fruta");
                double precio = Double.parseDouble(entrada.nextLine());

                matrizFrutas[i][j] =  new Fruta(nombre, precio);
            }
 
         }
        
    }

    @Override
    public void mostrarMatriz() {
        for (int i = 0; i < matrizFrutas.length; i++) {
            for (int j = 0; j < matrizFrutas[i].length; j++) {
                System.out.print("["+ i + "," + j + "] = ");
                System.out.print(" (Nombre: " + matrizFrutas[i][j].getNombre() + " ");
                System.out.print(" Precio: " + matrizFrutas[i][j].getPrecio() + ") ");
            }
            System.out.println("");
        }
        
    }

    
}
