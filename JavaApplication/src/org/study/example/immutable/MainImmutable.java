package org.study.example.immutable;

public class MainImmutable {

    public static void main(String[] args) {
        Student student = new Student(1, "Jose");
        System.out.println("Student: id(" + student.getId() + "), name(" + student.getName() + ")");
    }
}
