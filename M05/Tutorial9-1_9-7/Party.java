// Filename Party
// Asgnmnt  M05 Ch9 Pg 333
// Written by Erick Semones
// Written on 9-16-2024



public class Party
{
    private int guests;

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