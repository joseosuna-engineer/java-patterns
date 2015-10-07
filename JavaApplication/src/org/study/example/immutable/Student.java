package org.study.example.immutable;

public class Student {

    private int id;
    private String name;

    private Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
