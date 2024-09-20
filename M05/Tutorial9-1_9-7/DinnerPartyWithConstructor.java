// Filename DinnerPartyWithConstructor
// Asgnmnt  M05 Ch9 Pg 341
// Written by Erick Semones
// Written on 9-18-2024

public class DinnerPartyWithConstructor extends PartyWithConstructor
{
    private int dinnerChoice;

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
