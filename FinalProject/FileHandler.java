// Filename FileHandler
// Asgnmnt  M08 Final Project
// Written by Erick Semones
// Written on 9-15-2024

/* The FileHandler class operates the file input/output functions
 * like saving and loading inventory data. It also performs 
 * exception handling so that the overall program can catch
 * exceptions with minimal disruptions. */

import java.io.*;
import java.util.ArrayList;
 
public class FileHandler 
{
    private static final String FILE_NAME = "Inventory.txt";
 
     // Save inventory data to a file
    public static void saveInventory(ArrayList<Item> inventory) 
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) 
        {
            for (Item item : inventory) 
            {
                writer.write(item.getName() + "," + 
                            item.getCategory() + "," + 
                            item.getQuantity() + "," +
                            item.getReorderLvl() + "," +
                            item.getPrice());
                 
                            writer.newLine();
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error saving inventory data: " + e.getMessage());
        }
    }
 
    // Load inventory data from a file
    public static ArrayList<Item> loadInventory() 
    {
        ArrayList<Item> inventory = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) 
        {
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                
                if (parts.length == 5) 
                {
                    String name = parts[0];
                    String category = parts[1];
                    int quantity = Integer.parseInt(parts[2]);
                    int reorderLvl = Integer.parseInt(parts[3]);
                    double price = Double.parseDouble(parts[4]);
 
                    inventory.add(new Item(name, category, quantity, reorderLvl, price));
                }
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Inventory file not found: " + e.getMessage());
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading inventory data: " + e.getMessage());
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Error parsing inventory data: " + e.getMessage());
        }
 
        return inventory;
    }
}
 