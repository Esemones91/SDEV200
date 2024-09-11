// Filename NumberInput
// Asgnmnt  M04 Ch7 Pg252
// Written by Erick Semones
// Written on 9-9-2024



import javax.swing.JOptionPane;

public class NumberInput 
{
    public static void main(String[] args) 
    {
        String inputString;
        int inputNumber;
        int result;

        final int FACTOR = 10;

        inputString = JOptionPane.showInputDialog(null, 
            "Enter a number");
        
        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * FACTOR;
        JOptionPane.showMessageDialog(null, inputNumber + " * " + 
            FACTOR + " = " + result);
    }
}
