package matrices;

import java.util.Scanner;

public class Frutas implements IMatriz{

    String nombre;

    double precio;

    Frutas [][] matrizFrutas;

    public Frutas(){

        matrizFrutas = new Frutas [2][2];
    }
    public Frutas(String nombre, double precio){
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
    public void llenarMatriz(Scanner sc) {
        //Llenando los valores de la matriz
        for (int i = 0; i < matrizFrutas.length; i++) {
            for (int j = 0; j < matrizFrutas[i].length; j++) {
                System.out.println("Ingrese nombre de la fruta: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el precio de la fruta " + nombre + ":");
                double precio = Double.parseDouble(sc.nextLine());
                matrizFrutas [i][j] = new Frutas(nombre, precio);
            }
        }
    }

    @Override
    public void mostarMatriz() {
        // Mostrando los valores de la matriz
        for (int i = 0; i < matrizFrutas.length; i++) {
            for (int j = 0; j < matrizFrutas[i].length; j++) {
                System.out.print("Nombre: " + matrizFrutas[i][j] + " ");
                System.out.print("Precio: " + matrizFrutas[i][j] + " ");
            }
            System.out.println();
        }
    }
}

