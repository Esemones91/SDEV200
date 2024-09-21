// Filename Vehicle
// Asgnmtn  M05 Ch9 Pg 355
// Written by Erick Semones
// Written on 9-20-2024



public abstract class Vehicle
{
    private String powerSource;
    private int wheels;
    protected double price;

    // define constructor
    public Vehicle(String powerSource, int wheels)
    {
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }

    // define getter methods
    public String getPowerSource()
    {
        return powerSource;
    }

    public int getWheels()
    {
        return wheels;
    }

    public double getPrice()
    {
        return price;
    }

    // define setter methods
    public void setPowerSource(String source)
    {
        powerSource = source;
    }

    public void setWheels(int numWheels)
    {
        wheels = numWheels;
    }

    // define abstract SetPrice method
    public abstract void setPrice();
}