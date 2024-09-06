// Filename DivideEvenly2
// Asgnmnt  M03 Ch6 Tutorial Assignment
// Written by Erick semones
// Written on 9-6-2024



public class DivideEvenly2 
{
    public static void main(String[] args) 
    {
        // final int LIMIT = 100;
        int var;
        int number;

        for(number = 1; number <= 100; ++number)
        {
            System.out.println(number + " is evenly divisible by ");
            for(var = 1; var <= number; ++var)
            {
                if(number % var == 0)
                {
                    System.out.print(var + " ");
                }
            }
            System.out.println();
        }
    }
}
