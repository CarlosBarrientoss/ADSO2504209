package sena.william_pena.mains;

import sena.william_pena.inheritance.Client;
import sena.william_pena.inheritance.Employee;
import sena.william_pena.inheritance.Person;

import java.time.LocalDate;

public class InheritanceMainApp {
    public static void main(String... args){

        Person person1 = new Person("William Peña", 'M', 19, "Av 8E # 19 -8");
        System.out.println(person1.toString());
        System.out.println("");

        Employee employee1 = new Employee("William Peña", 'M', 19, "Av 8E # 19 -8", 3500000);
        System.out.println(employee1.toString());

        Client client1 = new Client("William Peña", 'M', 19, "Av 8E # 19 -8", LocalDate.of(2004, 3, 16), true);
        System.out.println(client1.toString());

        Client client2 = new Client("William Peña", 'M', 19, "Av 8E # 19 -8", LocalDate.of(2004, 3, 16), true);
        System.out.println(client2.toString());
    }
}
