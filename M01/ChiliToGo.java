// Filename: ChiliToGo.java
// Written by Erick Semones
// Written on 08-25-2024
// Asgnmnt: Ex 8a

/*This program accepts the number of 
adult meals and child meals, and it
displays the total money collected 
for adult meals, child meals, and 
all meals. */



import java.util.Scanner;

public class ChiliToGo 
{
    public static void main(String[] args) 
    {
        int adultPrice = 7;
        int childPrice = 4;
        int adultMeals;  // Number of adult meals
        int childMeals;  // Number of child meals
        int adultTotal;
        int childTotal;
        int grandTotal;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of adult meals >>");
        adultMeals = input.nextInt();
        System.out.print("Please enter number of child meals >>");
        childMeals = input.nextInt();
        adultTotal = adultPrice * adultMeals;
        childTotal = childPrice * childMeals;
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
