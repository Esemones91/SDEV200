// Filename MenuSearch
// Asgnmnt  M04 Ch8 Pg 311
// Written by Erick Semones
// Written on 9-15-2024



import java.util.Arrays;
import javax.swing.JOptionPane;

public class MenuSearch
{
    public static void main(String[] args) 
    {
        String[] menuChoices = new String[10];
        String entry = "", menuString = "";
        int x = 0;
        int numEntered = 0;
        int highestSub = menuChoices.length - 1;
        
        Arrays.fill(menuChoices, "zzzzzzz");

        // Prompt user to enter menu items via input dialog box
        menuChoices[x] = JOptionPane.showInputDialog(null, 
            "Enter an item for today's menu, or zzz to quit");
        
        // Loop to add menu items to menu choices array
        while(!menuChoices[x].equals("zzz") && x <= highestSub)
        {
            menuString = menuString + menuChoices[x] + "\n";
            ++x;

            if(x < highestSub)
            {
                menuChoices[x] = JOptionPane.showInputDialog(null, 
                    "Enter an item for today's menu, or zzz to quit");
            }

            numEntered = x;
        }

        // Display menu and allow user to make requests
        entry = JOptionPane.showInputDialog(null, 
            "Today's menu is:\n" + menuString +
                "Please make a selection:");
        
        // Sort the array
        Arrays.sort(menuChoices, 0, numEntered);

        // Use binarySearch() method to search the array
        x = Arrays.binarySearch(menuChoices, entry);
        if(x >= 0 && x < numEntered)
        {
            JOptionPane.showMessageDialog(null, "Excellent choice!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry = that item is not on tonight's menu");
        }
    }    
}
