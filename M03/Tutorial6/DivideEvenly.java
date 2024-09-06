// Filename DivideEvenly
// Asgnmnt  M03 Ch6 Tutorial Assignment
// Written by Erick semones
// Written on 9-6-2024



public class DivideEvenly 
{
    public static void main(String[] args) 
    {
        final int LIMIT = 100;
        int var;

        System.out.println(LIMIT + " is evenly divided by ");

        for(var = 1; var < LIMIT; ++var)
        {
            if(LIMIT % var == 0)
            {
                System.out.print(var + " ");
            }
        }
        
        System.out.println();
    }
}
