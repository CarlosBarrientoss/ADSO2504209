package com.joshua.domain;

public class Students {

    private int id_student;

    private  String name;

    private String last_name;

    private String phone;

    private String email;

    public Students(){
    }
    public Students(int id_student){
        this.id_student = id_student;
    }
    public Students(String name, String last_name, String phone,String email) {
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
        this.email = email;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Students{");
        sb.append("id_student=").append(id_student);
        sb.append(", name='").append(name).append('\'');
        sb.append(", last_name='").append(last_name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

