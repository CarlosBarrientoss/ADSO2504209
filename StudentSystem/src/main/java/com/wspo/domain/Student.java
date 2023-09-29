package com.wspo.domain;

public class Student {
    private int idStudent;
    private String nameStudent;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Student() {
    }

    public Student(int idStudent, String name, String lastName, String phoneNumber, String email) {
        this.idStudent = idStudent;
        this.nameStudent = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Student(String nameStudent, String lastName, String phoneNumber, String email) {
        this.nameStudent = nameStudent;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String text = """
                Student (id = %d, name = %s, lastName = %s, phoneNumber = %s, email = %s)
                """;

        return String.format(text, this.idStudent, this.nameStudent, this.lastName, this.phoneNumber, this.email);
    }
}
