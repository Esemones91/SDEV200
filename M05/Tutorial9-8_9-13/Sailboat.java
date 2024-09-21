// Filename Sailboat
// Asgnmnt  M05 Ch9 Pg 355
// Written by Erick Semones
// Written on 9-20-2024



import javax.swing.JOptionPane;

public class Sailboat extends Vehicle 
{
    private int length;

    // define Sailboat constructor
    public Sailboat()
    {
        super("wind", 0);
        setLength();
    }

    // define setLength and getLength methods
    public void setLength()
    {
        String entry;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat length in feet");
        length = Integer.parseInt(entry);
    }

    public int getLength()
    {
        return length;
    }

    // define set price method
    @Override
    public void setPrice()
    {
        String entry;
        final int MAX = 100_000;
        entry = JOptionPane.showInputDialog(null, "Enter sailboat price");
        price = Integer.parseInt(entry);

        // is the entered price too high?
        if(price > MAX)
        {
            price = MAX;
        }
    }

    // define new ToString method
    @Override
    public String toString()
    {
        return("The " + getLength() + 
            " foot sailboat is powered by " +
            getPowerSource() + " ; it has " + getWheels() +
            " wheels and costs $" + getPrice());
    }
}
