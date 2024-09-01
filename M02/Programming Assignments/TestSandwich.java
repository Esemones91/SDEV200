// Filename TestSandwich
// Asgnmnt M02 Ch 4 Ex 1b
// Written by erick Semones
// WRitten on 8-31-2024

/* This program works with the Sandwich class
 * to create a Sandwich object, prompt the user
 * for details, and displays the values of the
 * object.*/

import java.util.Scanner;

public class TestSandwich 
{
    public static void main(String[] args)
    {
        Sandwich firstOrder = new Sandwich();

        firstOrder = getData(firstOrder);

        System.out.print("First order details: " + 
        firstOrder.getMainIngredient() +
        firstOrder.getBreadType() + " $" + 
        firstOrder.getPrice());
    }

    public static Sandwich getData(Sandwich order)
    {
        String mainIngredient;
        String breadType;
        double price;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter main ingredient >> ");
        mainIngredient = keyboard.nextLine();

        System.out.print("Enter bread type >> ");
        breadType = keyboard.nextLine();
        
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();  // Consume the remaining newline

        order.setMainIngredient(mainIngredient);
        order.setBreadType(breadType);
        order.setPrice(price);

        return order;
    }
}
