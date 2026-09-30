package com.campus.model;



public class Student {
    private int id;
    private String name;
    private int age;
    private String department;

    public Student(int id, String name, String department, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }
    
    public Student(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getAge() {
        return age;
    }                      

}
