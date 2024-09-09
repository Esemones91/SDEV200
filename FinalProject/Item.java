// Filename Item
// Asgnmnt  Final Project
// Author   Erick Semones
// Date     9-7-2024
/* The Item class represents a single item in an
 * inventory list. It includes attributes: name,
 * category, quantity, reorder level, and price. 
 * It also contains a constructor, getter and
 * setter methods for each attribute, and a 
 * toString() method to fetch a string 
 * representation for easy display.*/



 public class Item
 {
    private String name;
    private String category;
    private int quantity;
    private int reorderLvl;
    private double price;

    // Item Constructor
    public Item(String name, String category, int quantity, int reorderLvl, double price)
    {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.reorderLvl = reorderLvl;
        this.price = price;
    }

    // Getters
    
    // Get Name Method
    // This method returns the value of name
    public String getName()
    {
        return name;
    }
    
    // Get Category
    // Thie method returns the value of category
    public String getCategory()
    {
        return category;
    }
    
    // Get Quantity Method
    // This method returns the value of quantity
    public int getQuantity()
    {
        return quantity;
    }
    
    // Get Reorder Level Method
    // This method returns the value of reorderLvl
    public int getReorderLvl()
    {
        return reorderLvl;
    }
    
    // Get Price Method
    // This method returns the value of price
    public double getPrice()
    {
        return price;
    }

    // Setters
    
    // Set Quanitty Method
    // This method sets the value for quantity
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    // Set Reorder Level Method
    // This method sets teh value for reorderLvl
    public void setReorderLvl(int reorderLvl)
    {
        this.reorderLvl = reorderLvl;
    }
    
    // Set Price Method
    // This method sets the value for price
    public void setPrice(double price)
    {
        this.price = price;
    }

    // ToString Method
    // This method retrieves a string representation of the Item class for display
    @Override 
    public String toString()
    {
        return String.format
            ("Name: %s, Category: %s, Quantity: %d, Reorder Level: %d, Price: %.2f",
            name, category, quantity, reorderLvl, price);
    }
}



