package sena.william_pena.dataStructures;

import java.util.Optional;
import java.util.Scanner;

public class Controller implements IPersonArray{

    public Controller() {
    }

    @Override
    public void fillArray(Person[] people, Scanner in) {
        for (int i = 0; i < people.length; i++) {
            System.out.print("Ingresa los datos de la persona " + (i + 1) + ": \n");

            System.out.print("Nombre: ");
            String name = in.nextLine();

            System.out.print("Id: ");
            int id = Integer.parseInt(in.nextLine());

            System.out.print("Salario: ");
            int salary = Integer.parseInt(in.nextLine());

            System.out.print("Celular: ");
            int phoneNumber = Integer.parseInt(in.nextLine());

            System.out.print("Genero: ");
            String gender = in.next();

            people[i] = new Person(name, id, salary, phoneNumber, gender);
        }
    }

    @Override
    public void showPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    @Override
    public void searchByName(String name, Person[] people) {
        Person wantedPerson = null;

        for (Person person : people) {
            if (person.getName().equals(name)) {
                wantedPerson = person;
                System.out.println(String.format("Vector encontrado", wantedPerson.getName()));
            }
        }

    }

    @Override
    public void searchById(long id, Person[] people) {
        Person wantedPerson = null;

        for (Person person : people) {
            if (person.getId() == id) {
                wantedPerson = person;
                System.out.println(String.format("Vector encontrado", wantedPerson.getName()));
            }
        }
    }


}
