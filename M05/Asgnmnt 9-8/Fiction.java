// Filename Fiction
// Asgnmnt  M05 Ch9 Ex 8b Pg 387
// Written by Erick Semones
// Written on 9-21-2024

/* Fiction inherits from Book. This class includes a constructor that
 * calls a method to set a fiction book's price at $24.99 */



public class Fiction extends Book
{
    public Fiction(String title)
    {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice()
    {
        this.price = 24.99;
    }
}
