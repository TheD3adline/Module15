package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        String[] stringArr = {"Test", "B", "A", "F", "Ze"};

        Arrays.sort(stringArr);

        for(String string : stringArr) {
            System.out.println(string);
        }
        */

        Student[] students = new Student[3];
        students[0] = new Student("Michael", "Fessler", 36);
        students[1] = new Student("Peter", "Pan", 71);
        students[2] = new Student("Hahn", "Franz", 42);

        Arrays.sort(students);

        for(Student student : students) {
            System.out.println(student);
        }
    }
}
