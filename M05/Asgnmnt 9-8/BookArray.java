// Filename BookArray
// Asgnmnt  M05 Ch9 Ex 8d Pg 387
// Written by Erick Semones
// Written on 9-21-2024

import javax.swing.JOptionPane;

public class BookArray 
{
    public static void main(String[] args) 
    {
        Book[] books = new Book[10];
        int x;
        
        // choose your book type
        for(x = 0; x < books.length; ++x)
        {
            String userEntry;
            String bookType;
            String fictionTitle;
            String nonfictionTitle;

            userEntry = JOptionPane.showInputDialog(null, 
                "Please select the type of \n" +
                   "book you wish to enter: \n F - Fiction " +
                    "N - Nonfiction");
            bookType = userEntry;

            // which book did you choose?
            if(bookType.equalsIgnoreCase("F"))
            {
                fictionTitle = JOptionPane.showInputDialog(null,
                    "Enter your fiction book's title: ");
                books[x] = new Fiction(fictionTitle);
            }
            else 
            {
                nonfictionTitle = JOptionPane.showInputDialog(null, 
                    "Enter your nonfiction book's title: ");
                books[x] = new Nonfiction(nonfictionTitle);
            }
        }

        // display the array
        StringBuffer outString = new StringBuffer();

        for(x = 0; x < books.length; ++x)
        {
            outString.append("\n#" + (x + 1) + "");
            outString.append("Title: " + books[x].getTitle());
            outString.append(", Price: $" + books[x].getPrice());
        }

        JOptionPane.showMessageDialog(null, 
            "Our available books include:\n" + outString.toString());    
    }
}
