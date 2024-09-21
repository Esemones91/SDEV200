// Filename TestCUstomers
// Asgnmnt  M05 Ch9 Fig 9-12
// Tested by Erick Semones
// Tested on 9-20-2024



public class TestCustomers
{
   public static void main(String[] args)
   {
      Customer oneCust = new Customer(124, 123.45);
      PreferredCustomer onePCust = new
         PreferredCustomer(125, 3456.78, 0.15);
      oneCust.display();
      onePCust.display();
   }
}
