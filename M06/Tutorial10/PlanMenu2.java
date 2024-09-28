// filename PlanMenu2
// asgnmnt  M06 Ch10 Pg 242
// author   Erick Semones
// date     9-27-2024



import javax.swing.*;

public class PlanMenu2 
{
    Menu2 briefMenu = new Menu2();
    PickMenu2 entree = null;
    String guestChoice = new String();
    
    try
    {
        PickMenu2 selection = new PickMenu2(briefMenu);
        entree = selection;
        guestChoice = entree.getGuestChoice();
    }
    catch(MenuException error) 
    {
        guestChoice = 
    }
    catch(Exception error)
    {
        guestChoice = "An invalid selection";
    }

    JOptionPane.showMessageDialog(null, 
        "You chose " + guestChoice);
}
}
