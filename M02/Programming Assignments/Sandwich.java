// Filename SAndwich
// Asgnmnt M02 Ch 4 Ex 1a
// Written by Erick Semones
// Wirrten on 8-31-2024



public class Sandwich 
{
    String mainIngredient = "tuna";
    String breadType = "wheat";
    double price = 4.99;

    public void setMainIngredient(String protein)
    {
        this.mainIngredient = protein;
    }

    public void setBreadType(String bread)
    {
        this.breadType = bread;
    }

    public void setPrice(double cost)
    {
        this.price = cost;
    }

    public String getMainIngredient()
    {
        return mainIngredient;
    }

    public String getBreadType()
    {
        return breadType;
    }

    public double getPrice()
    {
        return price;
    }
}