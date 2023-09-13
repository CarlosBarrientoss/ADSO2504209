package sena.jonathan_avendano.matrix;

import java.util.Scanner;

public class Fruits implements IMatrix {
    private String name;
    private double price;
    private Fruits[][] fruitsMatrix;

    public Fruits() {
        fruitsMatrix = new Fruits[2][2];
    }

    public Fruits(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Fruits[][] getFruitsMatrix() {
        return fruitsMatrix;
    }

    public void setFruitsMatrix(Fruits[][] fruitsMatrix) {
        this.fruitsMatrix = fruitsMatrix;
    }

    @Override
    public String toString() {
        return String.format("Fruta: (nombre: %s, precio: %.1f)", this.name, this.price);
    }

    @Override
    public void fillMatrix(Scanner in) {
        for (int i = 0; i < fruitsMatrix.length; i++) {
            for (int j = 0; j < fruitsMatrix[i].length; j++) {
                System.out.print("Ingrese el nombre: ");
                String name = in.nextLine();
                System.out.print(String.format("Ingrese el precio de %s: ", name));
                double price = Double.parseDouble(in.nextLine());
                fruitsMatrix[i][j] = new Fruits(name, price);
            }
        }
    }

    @Override
    public void showMatrix() {
        for (int i = 0; i < fruitsMatrix.length; i++) {
            for (int j = 0; j < fruitsMatrix[i].length; j++) {
                System.out.print(fruitsMatrix[i][j] + " - ");
            }
            System.out.println("");
        }
    }
}
