// Filename AssignVolunteer2
// Asgnmnt M03 Ch4 Tutorial Assignment
// Written by Erick Semones
// Written on 9-2-2024



import java.util.Scanner;

public class AssignVolunteer2 
{
    public static void main(String[] args)
    {
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " +
        OTHER_CODE + " for anything else...");
        donationType = input.nextInt();

        if(donationType == CLOTHING_CODE)
        {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        }
        else
        {
            volunteer = OTHER_PRICER;
            message = "a non-clothing donation";
        }

        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println
            ("The volunteer who will price this item is " + volunteer);
    }   
}
