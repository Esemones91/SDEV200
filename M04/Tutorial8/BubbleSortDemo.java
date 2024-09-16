// Filename BubbleSortDemo
// Asgnmnt  M04 Ch8 Pg 298
// Written by Erick Semones
// Written on 9-14-2024m



import java.util.Scanner;

public class BubbleSortDemo 
{
    public static void main(String[] args) 
    {
        int[] someNums = new int[5];
        int comparisonsToMake;
        Scanner keyboard = new Scanner(System.in);  
        int a, b, temp;
        
        // Input the numbers
        for(a = 0; a < someNums.length; ++a)
        {
            System.out.print("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }

        // Sort the numbers using bubble sort
        for(a = 0; a < someNums.length - 1; ++a) 
        {
            comparisonsToMake = someNums.length - 1 - a; // Reset comparison count for each pass

            for(b = 0; b < comparisonsToMake; ++b) 
            {
                if(someNums[b] > someNums[b + 1]) 
                {
                    // Swap elements
                    temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp;
                }
            }

            // Display array after each iteration of sorting
            display(someNums, a + 1);
        }

        keyboard.close();  // Close the scanner to avoid resource leak
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

