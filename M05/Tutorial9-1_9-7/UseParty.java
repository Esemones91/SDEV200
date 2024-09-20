// Filename UseParty
// Asgnmnt  M05 CH9 Pg 333
// Written by Erick Semones
// Written on 9-16-2024



import java.util.*;

public class UseParty 
{
    public static void main(String[] args) 
    {
        int guests;
        Party aParty = new Party();
        Scanner keyboard = new Scanner(System.in);

        //Prompt user input for number of guests
        System.out.print("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        aParty.setGuests(guests);
        System.out.println("THe party has " + aParty.getGuests() +
            " guests");
        
        // Display party invitation
        aParty.displayInvitation();
    }
}
