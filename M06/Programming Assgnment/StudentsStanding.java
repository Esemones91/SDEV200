// filename StudentsStanding
// asgnmnt  M06 Ex 11-7 Pg 483
// author   Erick Semones
// date     9-30-2024

/* Prompts user to enter student ID, name, and GPA. Then it 
 * saves student entries to different files whether their GPA
 * is above or below 2.0 */



import java.io.*;
import java.util.Scanner;

public class StudentsStanding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String studentID, firstName, lastName;
        double gpa;
        
        try (FileWriter goodStandingWriter = new FileWriter("GoodStanding.txt", true);
             FileWriter probationWriter = new FileWriter("AcademicProbation.txt", true)) {

            while (true) {
                // Collect student data
                System.out.println("Enter student ID (or type 'exit' to quit): ");
                studentID = input.nextLine();
                if (studentID.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.println("Enter first name: ");
                firstName = input.nextLine();

                System.out.println("Enter last name: ");
                lastName = input.nextLine();

                System.out.println("Enter GPA: ");
                gpa = input.nextDouble();
                input.nextLine(); // Consume newline

                // Output to appropriate file based on GPA
                String studentRecord = "ID: " + studentID + ", Name: " + firstName + " " + lastName + ", GPA: " + gpa + "\n";
                if (gpa >= 2.0) {
                    goodStandingWriter.write(studentRecord);
                    System.out.println("Student added to Good Standing list.");
                } else {
                    probationWriter.write(studentRecord);
                    System.out.println("Student added to Academic Probation list.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}