// Filename UseDinnerParty
// Asgnmnt  M05 Ch9 Pg 333



import java.util.Scanner;

public class UseDinnerParty 
{
    public static void main(String[] args) 
    {
        int guests;
        int dinnerChoice;
        Party aParty = new Party();
        DinnerParty aDinnerParty = new DinnerParty();
        Scanner keyboard = new Scanner(System.in);

        //Prompt user input for number of guests
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        aParty.setGuests(guests);
        System.out.println("THe party has " + aParty.getGuests() +
            " guests");
        
        // Display party invitation
        aParty.displayInvitation();

        // Prompt user input for number of diner party guests
        System.out.print("Enter number of guests for the dinner party >> ");
        guests = keyboard.nextInt();
        aDinnerParty.setGuests(guests);

        // Prompt user input for dinner choice
        System.out.print
            ("Enter a number for menu option--1 for chicken or 2 for beef >>");
        dinnerChoice = keyboard.nextInt();
        aDinnerParty.setDinnerChoice(dinnerChoice);
        System.out.println("The dinner party has " +
            aDinnerParty.getGuests() + " guests");
        System.out.println("Menu option " +
            aDinnerParty.getDinnerChoice() + " will be served");

        // Display party invitation
        aDinnerParty.displayInvitation();
    } 
}
