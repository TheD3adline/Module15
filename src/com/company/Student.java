package com.company;

public class Student {

    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //Method to compare the contents of 2 objects of the same class

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (!(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;

        if(age != other.age) {
            return false;
        } else if(!(firstName.equals(other.firstName))) {
            return false;
        } else if(!(lastName.equals(other.lastName))) {
            return false;
        }

        return true;
    }

    //Method to print the content of this class into a String

    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
