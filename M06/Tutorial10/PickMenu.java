
import javax.swing.JOptionPane;

// Filename PickMenu
// Asgnmnt  M06 Ch10 Pg 424
// Author   Erick Semones
// DAte     9-25-2024



public class PickMenu 
{
    private Menu briefMenu;
    private String guestChoice = new String();

    // constructor
    public PickMenu(Menu theMenu)
    {
        briefMenu = theMenu;

        setGuestChoice();
    }
    public void setGuestChoice()
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
