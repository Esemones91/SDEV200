// Filename UseDinnerParty2
// Asgnmnt  M05 Ch 9 Pg 338
// Written by Erick Semones
// Written on 9-18-2024



import java.util.*;

public class UseDinnerParty2 
{
    public static void main(String[] args) 
    {
        int guests;
        int dinnerChoice;
        Party aParty = new Party();
        DinnerParty2 aDinnerParty = new DinnerParty2();
        Scanner keyboard = new Scanner(System.in);

        //Prompt user input for number of guests
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        aParty.setGuests(guests);
        System.out.println("The party has " + aParty.getGuests() +
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

        // Clear the Scanner
        keyboard.close(); 
    }
}
