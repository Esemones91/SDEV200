
import javax.swing.JOptionPane;

// Filename PlanMenu
// Asgnmnt  M06 Ch10 Pg 424
// Author   Erick Semones
// Date     9-25-2024



public class PlanMenu 
{
    public static void main(String[] args) 
    {
        Menu briefMenu = new Menu();
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
            guestChoice = "An invalid selection";
        }

        JOptionPane.showMessageDialog(null, 
            "You chose " + guestChoice);
    }
}
