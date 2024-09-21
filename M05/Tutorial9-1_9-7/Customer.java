// Filename Customer
// Asgnmnt  M05 Ch9 Fig 9-10
// Tested by Erick SEmones
// Tested on 9-20-2024



public class Customer
{
   private int idNumber;
   private double balanceOwed;
   public Customer(int id, double bal)
   {
      idNumber = id;
      balanceOwed = bal;
   }
   public void display()
   {
      System.out.println("Customer #" + idNumber +
         " Balance $" + balanceOwed);
   }
}
