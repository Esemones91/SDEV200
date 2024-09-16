// Filename TwoDemensionalArrayDemo
// Asgnmnt  M04 Ch8 Pg 305
// Written by Erick Semones
// Written on 9-15-2024



import java.util.*;

public class TwoDimensionalArrayDemo 
{
    public static void main(String[] args) 
    {
        int[][] count = new int[3][3];
        Scanner input = new Scanner(System.in);
        int row, column;
        int r, c;
        final int QUIT = 99;
        
        System.out.print("Enter a row or " + QUIT + " to quit >");
        row = input.nextInt();

        while(row != QUIT)
        {
            System.out.print("Enter a column >");
            column = input.nextInt();
            if(row < count.length && column < count[row].length)
            {
                count[row][column]++;

                // Display row and columns
                for(r = 0; r < count.length; ++r)
                {
                    for(c = 0; c < count[r].length; ++c)
                    {
                        System.out.print(count[r][c] + " ");
                    }
                    System.out.println();
                }
            }

            // Display error message if row or column count is too high
            else
            {
                System.out.println("Invalid position selected");
            }
        
        // Prompt user for next row number
        System.out.print("Enter a row or " + QUIT + " to quit >");
        row = input.nextInt();
        }        
    }
}
