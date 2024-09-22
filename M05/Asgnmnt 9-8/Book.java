// Filename Book
// Asgnmnt  M05 Ch9 Ex8 Pg 387
// Written by Erick Semones
// Written on 9-21-2024

/* This is an abstract class that provides varables for a book's titla
 * and price. It includes a constructor that requires the title and
 * price, and it includes a get method for each variable as well as an
 * abstract method to set a book's price. */



public abstract class Book 
{
    protected String title;
    protected double price;

    public Book(String title)
    {
        this.title = title;
        setPrice();
    }

    // define the getter methods
    public String getTitle()
    {
        return title;
    }

    public double getPrice()
    {
        return price;
    }

    // set price is an abstract method
    public abstract void setPrice();
}

