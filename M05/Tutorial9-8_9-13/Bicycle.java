
import javax.swing.JOptionPane;

public class Bicycle extends Vehicle
{
    // define bicycle constructor
    public Bicycle()
    {
        super("a person", 2);
    }

    // define custom set price method
    @Override
    public void setPrice()
    {
        String entry;
        final int MAX = 4_000;
        entry = JOptionPane.showInputDialog
            (null, "Enter bicycle price");
        price = Integer.parseInt(entry);
        
        // is the price too high?
        if(price > MAX)
        {
            price = MAX;
        }
    }

    // define new ToString method
    @Override
    public String toString()
    {
        return("The bicycle is powered by " +
            getPowerSource() + " ; it has " + getWheels() +
            " wheels and costs $" + getPrice());
    }
}
