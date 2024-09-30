// filename STudentsStanding
// asgnmnt  M06 Ch11 Ex 7b Pg 483
// author   Erick Semones
// date     9-30-2024



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StudentsStanding2 {

    public static void main(String[] args) {
        System.out.println("=== Students in Good Standing ===");
        displayRecords("GoodStanding.txt");

        System.out.println("\n=== Students on Academic Probation ===");
        displayRecords("AcademicProbation.txt");
    }

    // Method to read and display records from a file
    private static void displayRecords(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(", ");
                if (data.length == 3) {
                    String id = data[0].split(": ")[1];
                    String name = data[1].split(": ")[1];
                    double gpa = Double.parseDouble(data[2].split(": ")[1]);
                    double difference = gpa - 2.0;

                    System.out.printf("ID: %s, Name: %s, GPA: %.2f, Difference from 2.0: %.2f\n",
                                      id, name, gpa, difference);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
