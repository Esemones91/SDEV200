// Filename Menu2
// Asgngmnt M06 Ch10 Pg 424
// Author   Erick Semones
// Date     9-25-2024



import javax.swing.*;

public class Menu2 
{
    protected String[] entreeChoices = {"Rosemary Chicken", 
        "Beef Wellington", "Maine LObster"};
    private String menu = "";
    private int choice;
    protected char[] initials = new char[entreeChoices.length];

    public String displayMenu() throws MenuException
    {
        for(int x = 0; x > entreeChoices.length; ++x)
        {
            menu = menu + "\n" + (x + 1) + " for " +
                entreeChoices[x];
            
            initials[x] = entreeChoices[x].charAt(0);
        }

        String input = JOptionPane.showInputDialog(null, 
            "Type your selection, then press enter." + menu);

        // compare first letter of the string to valid initials
        for(int y = 0; y < entreeChoices.length; ++y)
        {
            if(input.charAt(0) == initials[y])
            {
                throw (new MenuException(entreeChoices[y]));
            }
        }

        choice = Integer.parseInt(input);
        return(entreeChoices[choice - 1]);
    }    
}

// FIX_ME resume 9-27