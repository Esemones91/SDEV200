// Filename AssignVolunteer4
// Asgnmnt M03 Ch5 Tutorial



import java.util.Scanner;

public class AssignVolunteer4 
{
    public static void main(String[] args)
    {
        int donationType;
        String volunteer = "";
        String message = "";
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONIC_CODE = 3;
        final int OTHER_CODE = 4;
        final String CLOTHING_PRICER = "Regina";
        final String FURNITURE_PRICER = "Walter";
        final String ELECTRONIC_PRICER = "Lydia";
        final String OTHER_PRICER = "Marco";

        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter an integer... " );
        donationType = input.nextInt();

        switch(donationType)
        {
            case CLOTHING_CODE:
                volunteer = CLOTHING_PRICER;
                message = " a clothing donation";
                break;
            case FURNITURE_CODE:
                volunteer = FURNITURE_PRICER;
                message = " a furniture donation";
                break;
            case ELECTRONIC_CODE:
                volunteer = ELECTRONIC_PRICER;
                message = " an electronic donation";
                break;
            case OTHER_CODE:
                volunteer = OTHER_PRICER;
                message = " an other donation";
                break;
            default:
                message = " an invalid donation type";
        }

        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println
            ("The volunteer who will price this item is " + volunteer);
    }    
}
