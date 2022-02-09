package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;

/**
 *
 * @author Matthew Pelter
 */
public class DriverClass {
	
	public static void main(String[] args) {
		// ToDo 5: Fix the error
		
		// ToDo 6: Fix the constructor of Student class
		
		// ToDo 7: Add a toString method for Student class
		
                // Creating student object
		Student std1 = new Student("James", (short)20);
		double GPA = -1;
                // initialize scanner
                Scanner scn = new Scanner(System.in);
                // input validation
                while(GPA < 0 || GPA > 4) { 
                    System.out.println("Please enter the GPA for the student: ");
                // get next double
                    GPA = scn.nextDouble();
                }
                std1.setGPA(GPA);  
                System.out.println(std1.getGPA());
		// ToDo 8: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
		
                //setting the address
                std1.setAddress("Earth");
                
                // toString output
		System.out.println(std1);
		
		// ToDo 9: add comments and explain your code
		
		// ToDo 10: submit using a pull request.
	}

}