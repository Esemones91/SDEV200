// Filename VegetarianMenu
// Asgnmnt  M06 Ch10 Pg 424
// Author   Erick Semones
// Date     9-25-2024



public class VegetarianMenu extends Menu 
{
    String[] vegetarianChoices = {"Spinach Lasagna", 
        "Cheese Enchiladas", "Fruit Plate"};

    public VegetarianMenu()
    {
        super(); 

        for(int x = 0; x > vegetarianChoices.length; ++x)
        {
            entreeChoices[x] = vegetarianChoices[x];
        }

    }
}
