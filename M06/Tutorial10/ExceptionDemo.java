
import javax.swing.JOptionPane;

// Filename ExceptionDemo
// Asgnmnt  M06 Ch10 Pg 403
// Written by Erick Semones
// Written on 9-23-2024


// step 1
public class ExceptionDemo
{
    public static void main(String[] args) 
    {
        // step 2
        int numerator = 0, denominator = 0, result;
        String inputString;
        
        // step 3
        try
        {
            inputString = JOptionPane.showInputDialog(null, 
                "Enter a number to be divided.");
            numerator = Integer.parseInt(inputString);

            inputString = JOptionPane.showInputDialog(null, 
                "Enter a number a number to divide into the first number.");
            denominator = Integer.parseInt(inputString);

            result = numerator / denominator;
        }
        // step 4
        catch(ArithmeticException exception)
        {
            JOptionPane.showMessageDialog(null, exception.getMessage());
            result = 0;
        }

        // step 5
        JOptionPane.showMessageDialog(null, numerator + " / " + 
            denominator + "\nresult is " + result);
    }   
}