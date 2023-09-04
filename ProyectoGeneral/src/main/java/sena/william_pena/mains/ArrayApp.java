package sena.william_pena.mains;

import sena.william_pena.dataStructures.Controller;
import sena.william_pena.dataStructures.IPersonArray;
import sena.william_pena.dataStructures.Person;

import java.util.Scanner;

public class ArrayApp {
    public static void main(String... args){
        Scanner in = new Scanner(System.in);
        Controller controller = new Controller();
        Person[] people = new Person[5];

        controller.fillArray(people, in);
        controller.showPeople(people);
    }
}
