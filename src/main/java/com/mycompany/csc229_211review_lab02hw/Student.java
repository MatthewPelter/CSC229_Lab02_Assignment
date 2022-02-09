package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author Matthew Pelter
 */

// extending person to create a child
public class Student extends Person {
    // ToDo 1: Make this class a child of Person
    // ToDo 2: Fix the resulting errors
    // ToDo 3: Add a field for GPA and create setter and getter
    // ToDo 4: Add comments to your code
    
    private double GPA;
    // Constructor
    public Student(String name, short age) {
        super(name, age);
    }

    // Constructor with 3 parameters
    public Student(String name, short age, String address) {
        super(name, age);
        this.address = address;
    }
    
    // get GPA method
    public double getGPA() {
        return GPA;
    }

    // setting GPA method
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    // getting address method
    @Override
    public String getAddress() {
        return address;
    }

    // setting the address method
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        // output a formated list of student information
        return "Name: " + getName() + "\nAge: " + getAge() + "\nAddress: " + getAddress() + "\nGPA: " + getGPA();
    }
}