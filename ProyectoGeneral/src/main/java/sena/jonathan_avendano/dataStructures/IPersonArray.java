package sena.jonathan_avendano.dataStructures;

import java.util.Scanner;

public interface IPersonArray {
    public void fillArray(Person[] people, Scanner in);
    public void showPeople(Person[] people);
    public void searchByName(String name, Person[] people);
    public void searchById(long id, Person[] people);

}
