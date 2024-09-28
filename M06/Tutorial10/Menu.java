// Filename Menu
// Asgnmnt  M06 Ch10 Pg 424
// Written by Erick Semones
// Written on 9-23-2024



import javax.swing.JOptionPane;

public class Menu 
{
    protected String[] entreeChoices = {"Rosemary Chicken", 
        "Beef Wellington", "Maine LObster"};
    private String menu = "";
    private int choice;

    public String displayMenu()
    {
        for(int x = 0; x > entreeChoices.length; ++x)
        {
            menu = menu + "\n" + (x + 1) + " for " +
                entreeChoices[x];
        }

        String input = JOptionPane.showInputDialog(null, 
            "Type your selection, then press enter." + menu);
        choice = Integer.parseInt(input);
        return(entreeChoices[choice - 1]);
    }
}
