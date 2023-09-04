package sena.william_pena.dataStructures;

public class Person {
    private String name;
    private int id;
    private int salary;
    private long phoneNumber;
    private char gender;

    public Person() {
    }

    public Person (String name) {
        this.name = name;
    }

    public Person(String name, int id, int salary, int phoneNumber, char gender) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Persona( name: %s )", this.name);
    }
}
