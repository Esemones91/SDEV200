// Filename DinnerParty2
// Asgnmnt  M05 Ch9 Pg 338
// Written by Erick Semones
// Written on 9-16-2024



public class DinnerParty2 extends Party  
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
