// Filename InsuredCar
// Asgnmnt  M05 Ch9 Pg 375
// Written by Erick Semones
// Written on 9-21-2024



import javax.swing.JOptionPane;


public class InsuredCar extends Vehicle implements Insured
{
    int coverage;

    public InsuredCar()
    {
        super("gas", 4);
        setCoverage();
    }

    public void setPrice()
    {
        String entry;
        final int MAX = 60_000;

        entry = JOptionPane.showInputDialog(null,
            "Enter car price");
        price = Integer.parseInt(entry);

        // is price too high?
        if(price > MAX)
        {
            price = MAX;
        }
    }

    public void setCoverage()
    {
        coverage = (int)(price * 0.9);
    }

    public int getCoverage()
    {
        return coverage;
    }

    public String toString()
    {
        return ("the insured car is powered by " + 
            getPowerSource() + "; it has " + getWheels() +
            " wheels, costs $" + getPrice() + 
            " and it insured for $" + getCoverage());
    }
}
