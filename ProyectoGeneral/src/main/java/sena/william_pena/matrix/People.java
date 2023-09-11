package sena.william_pena.matrix;

import java.util.Scanner;

public class People implements IMatrix{

    private String name;
    private int age;
    private People[][] peopleMatrix;

    public People() {
        peopleMatrix = new People[2][2];
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void fillMatrix(Scanner in) {
        for (int i = 0; i < peopleMatrix.length; i++) {
            for (int j = 0; j < peopleMatrix[i].length; j++) {
                System.out.print("Ingrese el nombre: ");
                String name = in.nextLine();
                System.out.print(String.format("Ingrese la edad de %s: ", name));
                int age = Integer.parseInt(in.nextLine());
                peopleMatrix[i][j] = new People(name, age);
            }
        }
    }

    @Override
    public void showMatrix() {
        for (int i = 0; i < peopleMatrix.length; i++) {
            for (int j = 0; j < peopleMatrix[i].length; j++) {
                System.out.print(peopleMatrix[i][j] + " - ");
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return String.format("Persona: (nombre: %s, edad: %d)", this.name, this.age);
    }
}
