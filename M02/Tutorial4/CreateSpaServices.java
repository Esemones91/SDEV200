// Filename: CreateSpaServices
// Asgnmnt: M02 Ch4 Tutorial Exercise
// Written by Erick Semones
// Written on 8-30-2024

import java.util.Scanner;

public class CreateSpaServices 
{
    public static void main(String[] args)
    {
        SpaServices firstService = new SpaServices();
        SpaServices secondService = new SpaServices();
        SpaServices thirdService = new SpaServices("facial", 22.99);
        firstService = getData(firstService);
        // secondService = getData(secondService);

        System.out.println("First service details: " + 
        firstService.getServiceDescription() + " $" + 
        firstService.getPrice());
        System.out.println("Second service details: " + 
        secondService.getServiceDescription() + " $" + 
        secondService.getPrice());
        System.out.println("Third service details: ");
        System.out.println(thirdService.getServiceDescription() +
        " $" + thirdService.getPrice());
    }

    public static SpaServices getData(SpaServices service)
    {
        String serviceDescription;
        double price;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter service >> ");
        serviceDescription = keyboard.nextLine();
        
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();  // Consume the remaining newline

        service.setServiceDescription(serviceDescription);  // Set the description
        service.setServicePrice(price);  // Set the price

        return service;
    }
}
