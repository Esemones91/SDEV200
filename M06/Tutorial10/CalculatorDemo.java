
import java.io.IOException;
import java.util.Scanner;

public class CalculatorDemo 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner input = new Scanner(System.in);
        Process proc = Runtime.getRuntime().exec 
            ("cmd /c C:\\windows\\system32\\calc.exe");
        double num1 = 279.6;
        double num2 = 872.8;
        double answer = num1 + num2;
        double usersAnswer;

        System.out.print("What is the sum of " + num1 + " and " + 
            num2 + " ?>>");
        usersAnswer = input.nextDouble();

        if(usersAnswer == answer)
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Sorry the correct answer is " + answer);
        }
    }
}
