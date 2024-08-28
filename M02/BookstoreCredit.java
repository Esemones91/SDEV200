// Filename: BookstoreCredit.java
// Asgnmnt: M02 Ex5
// Written by Erick Semones
// Written on 8-28-2024

/* This program takes input from the user
 * as student name and grade point average.
 * Then it display the student's name, GPA, 
 * and bookstore credit. */

import java.util.Scanner;

 public class BookstoreCredit 
{
    public static void displayCredit(double gradePointAvg)
    {
        double storeCredit = gradePointAvg * 10;
        System.out.println("Bookstore credit: $" + storeCredit);
    }
    public static void main(String[] args) 
    {
        String studentName = "";
        double gradePointAvg = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student's name >> ");
        studentName = input.nextLine();
        System.out.print("Enter that student's grade point average >> ");
        gradePointAvg = input.nextDouble();
        System.out.println("Student name: " + studentName);
        System.out.println("Grade Point Average: " + gradePointAvg);
        displayCredit(gradePointAvg);

    }    
}
