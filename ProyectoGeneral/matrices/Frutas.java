package matrices;

import java.util.Scanner;

public class Frutas implements IMatriz {
    private String nombre;
    private double precio;
    private Frutas[][] matrizFrutas;

    public Frutas() {
        matrizFrutas = new Frutas[3][3];
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
    public void llenarMatriz(Scanner consola) {
        for (int i = 0; i < matrizFrutas.length; i++) {
            for (int j = 0; j < matrizFrutas[i].length; j++) {
                System.out.println("Ingrese el nombre de la fruta en la posición [" + i + "][" + j + "]: ");
                String nombre = consola.nextLine();
                System.out.println("Ingrese el precio de la fruta en la posición [" + i + "][" + j + "]: ");
                double precio = Double.parseDouble(consola.nextLine());

                Frutas fruta = new Frutas();
                fruta.setNombre(nombre);
                fruta.setPrecio(precio);

                matrizFrutas[i][j] = fruta;
            }
        }
    }

    @Override
public void mostrarMatriz() {
    for (int i = 0; i < matrizFrutas.length; i++) {
        for (int j = 0; j < matrizFrutas[i].length; j++) {
            Frutas fruta = matrizFrutas[i][j];
            System.out.println("[" + i + "-" + j + "] Nombre: " + fruta.getNombre() + ", Precio: " + fruta.getPrecio());
        }
    }
}

        }
    

