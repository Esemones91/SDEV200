// Filename Inventory
// Asgnmnt  Final Project
// Author   Erick Semones
// Date     9-7-2024

/* The Inventory class manages a collection
 * of Item objects. */



import java.util.ArrayList;

 public class Inventory 
 {
    private ArrayList<Item> items;
    
    // Constructor
    public Inventory()
    {
        items = new ArrayList<>();
    }

    // Add Item Method
    // This method adds items to the inventory list
    public void addItem(Item item)
    {
        items.add(item);
    }

    // Update Item Method
    // This method updates the quantity and reorder level of individual items
    public void updateItem(Item item)
    {
        for(Item i : items)
        {
            if(i.getName().equals(item.getName()))
            {
                i.setQuantity(item.getQuantity());
                i.setReorderLvl(item.getReorderLvl());
                i.setPrice(item.getPrice()); 
                return;
            }
        }
        System.out.println("Item not found");
    }

    // Delete Item Method
    // This method deletes item entries in the inventory list
    public void deleteItem(String itemName)
    {
        items.removeIf(i -> i.getName().equals(itemName));
    }

    // Get Items
    // This method retrieves a list of items
    public ArrayList<Item> getItems()
    {
        return items;
    }
    
    // Get Low Stock Items Method
    // This method retrieves a list of items that are below their reorder level
    public ArrayList<Item> getLowStockItems()
    {
        ArrayList<Item> lowStockItems = new ArrayList<>();
        for(Item i : items)
        {
            if(i.getQuantity() < i.getReorderLvl())
            {
                lowStockItems.add(i);
            }
        }
        return lowStockItems;
    }
}
