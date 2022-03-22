package com.company;

public class Student implements Comparable {

    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //Method to sort the contents of an array of this class

    //return 0: when handed over Object o must be sorted to the same spot as the Object that requests the method
    //return >0: when the requesting Object must be sorted BEHIND the handed over Object o
    //return <0: when the requesting Object must be sorted BEFORE the handed over Object o

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student) {
            Student other = (Student) o;
            if(this.age < other.age) {
                return -1;
            } else if(this.age > other.age) {
                return 1;
            } else
                return 0;
        }
        //if Object o is not of the class Student
        return 0;
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

    //Getters/Setters

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
