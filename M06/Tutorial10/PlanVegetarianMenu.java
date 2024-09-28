// Filename PlanVegetarianmenu
// Asgnmnt  M06 Ch10 Pg424
// Author   Erick Semones
// Date     9-25-2024



import javax.swing.*;

public class PlanVegetarianMenu 
{
    public static void main(String[] args) 
    {
        VegetarianMenu briefMenu = new VegetarianMenu();
        PickMenu entree = null;
        String guestChoice = new String();
        
        try
        {
            PickMenu selection = new PickMenu(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        }
        catch(Exception error)
        {
            guestChoice = "An invalid vegetarian selection";
        }

        JOptionPane.showMessageDialog(null, 
            "You chose " + guestChoice);
    }
}
