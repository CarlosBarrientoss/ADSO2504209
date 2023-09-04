package sena.william_pena.dataStructures;

import java.util.Scanner;

public class Controller implements IPersonArray{

    public Controller() {
    }

    @Override
    public void fillArray(Person[] people, Scanner in) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el nombre de la persona " + (i + 1) + ": ");
            String name = in.nextLine();
            people[i] = new Person(name);
        }
    }

    @Override
    public void showPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
