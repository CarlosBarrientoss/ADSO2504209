package sena.jonathan_avendano.mains;

import sena.jonathan_avendano.dataStructures.Controller;
import sena.jonathan_avendano.dataStructures.Person;

import java.util.Scanner;

public class ArrayApp {
    public static void main(String... args){
        Scanner in = new Scanner(System.in);
        Controller controller = new Controller();
        Person[] people = new Person[1];

        controller.fillArray(people, in);
        controller.showPeople(people);
        controller.searchByName("William", people);
        controller.searchById(1, people);
    }
}
