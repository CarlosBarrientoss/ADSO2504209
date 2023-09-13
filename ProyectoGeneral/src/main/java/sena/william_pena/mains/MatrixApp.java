package sena.william_pena.mains;

import sena.william_pena.inheritance.Person;
import sena.william_pena.matrix.Fruits;
import sena.william_pena.matrix.IMatrix;
import sena.william_pena.matrix.People;

import java.util.Scanner;

public class MatrixApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        People people = new People();
        fillMatrixGeneric(people, in);
        System.out.println("");
        showMatrixGeneric(people);
        System.out.println("\n\n");

        Fruits fruits = new Fruits();
        fillMatrixGeneric(fruits, in);
        System.out.println("");
        showMatrixGeneric(fruits);


    }

    public static void fillMatrixGeneric(IMatrix iMatrix, Scanner in) {
        iMatrix.fillMatrix(in);
    }

    public static void showMatrixGeneric(IMatrix iMatrix){
        iMatrix.showMatrix();
    }
}
