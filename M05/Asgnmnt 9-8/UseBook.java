// Asgnmnt  M05 Ch9 Ex 8c Pg 387
// Written by Erick Semones
// Written on 9-21-2024

/* UseBook class creates a Fiction object and Nonfiction object.
 * It prompts the user to enter each book's title and price. Then
 * it displays each book's title and price. */



 import javax.swing.JOptionPane;

 public class UseBook 
{
    public static void main(String[] args) 
    {
        String fictionTitle;
        String nonfictionTitle;

        // Prompt user to enter fiction title and create object
        fictionTitle = JOptionPane.showInputDialog(null,
            "Enter your fiction book's title: ");
        Fiction fictionBook = new Fiction(fictionTitle);

        // Prompt user to enter nonfiction booik's title and create object
        nonfictionTitle = JOptionPane.showInputDialog(null, 
            "Enter your nonfiction book's title: ");
        Nonfiction nonfictionBook = new Nonfiction(nonfictionTitle);

        // Display fiction and nonfiction book values
        JOptionPane.showMessageDialog(null, 
            "Fiction Book: " + fictionBook.getTitle() + 
            "\nPrice: $" + fictionBook.getPrice());

        JOptionPane.showMessageDialog(null, 
            "Nonfiction Book: " + nonfictionBook.getTitle() + 
            "\nPrice: $" + nonfictionBook.getPrice());
    } 
}
