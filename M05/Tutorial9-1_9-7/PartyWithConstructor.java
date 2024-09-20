// Filename PartyWithConstructor
// Asgnmnt  M05 Ch9 Pg 341
// Written by Erick Semones
// Written on 9-18-2024



public class PartyWithConstructor 
{
    private int guests;

    // Constructor to display a message
    public PartyWithConstructor()
    {
        System.out.println("Creating a party");
    }

    // Accessor method that fetches the value of guests.
    public int getGuests()
    {
        return guests;
    }

    // Mutator method that changes the value of guests
    public void setGuests(int numGuests)
    {
        guests = numGuests;
    }

    // Method to display a party invitation
    public void displayInvitation()
    {
        System.out.println("Please come to my party!");
    }
}
