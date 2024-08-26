// File name: ChiliToGo2
// Written by Erick Semones
// Written on 8-25-2024
// Asgnmnt: Ex 8b

/*This program accepts the number of adult and child meals
 * ordered. It subtracts the meal cost from the price. Then
 * it displays the total money collected from adult meals,
 * child meals, and all meals.*/



 import java.util.Scanner;

public class ChiliToGo2 
{
    public static void main(String[] args) 
    {
        double adultPrice = 7.00;
        double childPrice = 4.00;
        double adultCost = 4.35; // Material cost for adult meals
        double childCost = 3.10; // Material cost for child meals
        double adultProfit = adultPrice - adultCost;
        double childProfit = childPrice - childCost;
        int adultMeals;  // Number of adult meals
        int childMeals;  // Number of child meals
        double adultTotal;
        double childTotal;
        double grandTotal;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of adult meals >>");
        adultMeals = input.nextInt();
        System.out.print("Please enter number of child meals >>");
        childMeals = input.nextInt();
        adultTotal = adultProfit * (double) adultMeals;
        childTotal = childProfit * (double) childMeals;
        grandTotal = adultTotal + childTotal;
        System.out.println
        ("Total money collected from adult meals: " + 
        adultTotal);
        System.out.println
        ("Total money collected from child meals: " +
        childTotal);
        System.out.println
        ("Total money collected from all meals: " +
        grandTotal);
    }        
}
