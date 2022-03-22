package com.company;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Michael", "Fessler", 36);
        Student student2 = new Student("Michael", "Fessler", 36);

        System.out.println(student1.equals(student2));
    }
}
