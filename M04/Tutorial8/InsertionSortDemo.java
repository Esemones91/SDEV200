// Filename InsertionSortDemo
// Asgnmnt  M04 Ch8 Pg 299
// Written by Erick Semones
// Written on 9-14-2024



import java.util.Scanner;

public class InsertionSortDemo 
{
    public static void main(String[] args) 
    {
        int[] someNums = new int[5];
        Scanner keyboard = new Scanner(System.in);  
        int a, b, temp;
        
        // Input the numbers
        for(a = 0; a < someNums.length; ++a)
        {
            System.out.print("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }

        // Insertion sort loop
        for(a = 1; a < someNums.length; ++a) 
        {
            temp = someNums[a];  // Store the value to be inserted
            b = a - 1;

            // Shift elements to the right to make room for temp
            while(b >= 0 && someNums[b] > temp)
            {
                someNums[b + 1] = someNums[b];
                --b;
            }

            // Insert temp at its correct location
            someNums[b + 1] = temp;

            // Display the array after each insertion
            display(someNums, a);
        }

        keyboard.close();  // Close the scanner to avoid resource leaks
    }

    // Display the current state of the array
    public static void display(int[] someNums, int iteration)
    {
        System.out.print("Iteration " + iteration + ": ");
        for(int x = 0; x < someNums.length; ++x)
        {
            System.out.print(someNums[x] + " ");
        }
        System.out.println();  // Move to the next line after printing the array
    }
}
