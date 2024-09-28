// Filename ExceptionDemo2
// Asgnmnt  M06 Ch10 Pg 407
// Written by Erick Semones
// Written on 9-23-2024

import javax.swing.JOptionPane;

public class ExceptionDemo2 
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
        catch(ArithmeticException exception)
        {
            JOptionPane.showMessageDialog(null, exception.getMessage());
            result = 0;
        }
        catch(NumberFormatException exception)
        {
            JOptionPane.showMessageDialog(null, 
                "This application accepts only digits!");
            numerator = 999;
            result = 1;
        }

        // step 5
        JOptionPane.showMessageDialog(null, numerator + " / " + 
            denominator + "\nresult is " + result);
    }   
}
