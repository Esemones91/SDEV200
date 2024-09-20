// Filename DinnerPartyWithConstructor2
// ASgnmnt  M05 Ch9 Pg 341
// Written by erick Semones
// Written on 9-20-2024



public class DinnerPartyWithConstructor2 extends 
    PartyWithConstructor2 
{
    private int dinnerChoice;

    DinnerPartyWithConstructor2(int numGuests)
    {
        super(numGuests);
    }

    // Method to access value of dinnerChoice
    public int getDinnerChoice()
    {
        return dinnerChoice;
    }

    // Method to change the value of dinnerChoice
    public void setDinnerChoice(int choice)
    {
        dinnerChoice = choice;
    }

    // Specialized displayInvitation() method
    @Override 
    public void displayInvitation()
    {
        System.out.println("Please come to my dinner party!");
    }
}
