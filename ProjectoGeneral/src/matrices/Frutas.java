package matrices;

import java.util.Scanner;

public class Frutas implements IMatriz{

    Scanner consola = new Scanner(System.in);
    private String nombre;
    private Double precio;
    private Frutas[][] matrizFruta;

    public Frutas(){
        matrizFruta = new Frutas[2][2];
    }

    public Frutas(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Frutas[][] getMatrizFruta() {
        return matrizFruta;
    }

    public void setMatrizFruta(Frutas[][] matrizFruta) {
        this.matrizFruta = matrizFruta;
    }


    @Override
    public void llenarMatriz(Scanner consola) {
        for (int i = 0; i < matrizFruta.length; i++) {
            for (int j = 0; j < matrizFruta[i].length; j++) {
                System.out.println("Ingrese el nombre: ");
                String nombre = consola.nextLine();

                System.out.println("Ingresa el precio de: "+nombre+ ": ");
                Double precio = Double.parseDouble(consola.nextLine());
                matrizFruta[i][j] = new Frutas(nombre, precio);
            }
        }
    }

    @Override
    public void mostrarMatriz() {
        for (int i = 0; i < matrizFruta.length; i++) {
            for (int j = 0; j < matrizFruta[i].length; j++) {
                System.out.print("Nombre: " + matrizFruta[i][j].getNombre() + ". ");
                System.out.print("Edad: " + matrizFruta[i][j].getPrecio() + ". ");
            }
        }
    }
}
