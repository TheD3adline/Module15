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

    @Override //Overrides the standard compareTo method from Comparable.java interface and returns an integer to the sorting algorithm
    public int compareTo(Object o) {
        if(o instanceof Student) { //Checks if Object o even is of the same class as the requesting class
            Student other = (Student) o; //Instantiates a new instance of the class, other, and writes the contents of o into it
            if(this.age < other.age) { //Checks if age attribute of the requesting object is smaller than other (or o)
                return -1; //Returns -1 integer into the sorting algorithm if age of requesting object is smaller than age of other (or o), so the object with the lower age attribute is sorted BEFORE
            } else if(this.age > other.age) { //Checks if age attribute of the requesting object is larger than other (or o)
                return 1; //Returns 1 integer into the sorting algorithm if age of requesting object is larger than age of other (or o), so the object with the higher age attribute is sorted BEHIND
            } else //If age attribute of both objects is the same, returns 0 integer into the sorting algorithm, so the positions of both objects remain unchanged
                return 0;
        }
        //if Object o is not of the class Student
        return 0;
    }

    //Method to compare the contents of 2 objects of the same class

    @Override //Overrides standard equals method from Object.java class, returns boolean
    public boolean equals(Object obj) {
        if(this == obj) { //Checks if obj is the same instance as the object that is requesting the method, if so the contents can only be the same and there is no need for further comparison, then returns true
            return true;
        } else if (obj == null) { //Checks if obj is null, of so returns false
            return false;
        } else if (!(obj instanceof Student)) { //Checks if obj even is an instance of the same class as the requesting obj, if not returns false
            return false;
        }

        Student other = (Student) obj; //Instantiates a new instance of the class, other, and writes the contents of obj into it

        if(age != other.age) { //Checks if the age attribute differs, if it differs returns false
            return false;
        } else if(!(firstName.equals(other.firstName))) { //Checks if the firstName attribute (String) is the same, if it differs returns false
            return false;
        } else if(!(lastName.equals(other.lastName))) { //Checks if the lastName attribute (String) is the same, if it differs returns false
            return false;
        }

        return true; //If all the checks have passed until here, then every defined attribute of the two objects carries the same values while not being the same instance, returns true
    }

    //Method to print the content of this class into a String

    @Override //Overrides standard toString method from Object.java class
    public String toString() {
        return firstName + " " + lastName + ": " + age; //Returns a String value with these defined contents
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
