// filename PickMenu2
// Asgnmnt  M06 Ch10 Pg 424
// Author   Erick Semones
// Date     09-27-2024

import javax.swing.JOptionPane;

public class PickMenu2 
{
    private Menu2 briefMenu;
    private String guestChoice = new String();

    // constructor
    public PickMenu2(Menu2 theMenu) throws MenuException 
    {
        briefMenu = theMenu;

        setGuestChoice(); 
    }
    public void setGuestChoice() throws MenuException 
    {
        JOptionPane.showMessageDialog(null,
            "Choose from the folowing menu:");
        guestChoice = briefMenu.displayMenu();
    }

    public String getGuestChoice()
    {
        return(guestChoice);
    }
}
