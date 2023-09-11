package matrices;

import java.util.Scanner;

public class Fruta implements IMatriz{
    private String nombre;
    private double precio;
    private Fruta[][] matrizFrutas;

    public Fruta() {
        matrizFrutas = new Fruta[2][2];
    }
    

    public Fruta(String nombre, double precio) {
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

    public Fruta[][] getMatrizFrutas() {
        return matrizFrutas;
    }

    public void setMatrizFrutas(Fruta[][] matrizFrutas) {
        this.matrizFrutas = matrizFrutas;
    }

    @Override
    public void llenarMatriz(Scanner scanner) {
        for (int i = 0; i < matrizFrutas.length; i++) {
            for (int j = 0; j < matrizFrutas[i].length; j++) {

                System.out.print("Ingrese el nombre de la fruta: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese el precio de " + nombre + ": ");
                double precio = Double.parseDouble(scanner.nextLine());

                matrizFrutas[i][j] = new Fruta(nombre, precio);
            }
        }
    }

    @Override
    public void mostrarMatriz() {
        for (int i = 0; i < matrizFrutas.length; i++) {
            for (int j = 0; j < matrizFrutas[i].length; j++) {
                System.out.print("["+i+","+j+"]<->(Nombre: " + matrizFrutas[i][j].nombre + ",Precio: " + matrizFrutas[i][j].precio + ")   ");
            }
            System.out.println();
        }
    }    
}
