// Filename PreferredCustomer
// Asgnmnt  M05 Ch9 Fig 9-11
// Tested by Erick Semones
// Tested on 9-20-2024



public class PreferredCustomer extends Customer
{
   double discountRate;
   public PreferredCustomer(int id, double bal, double rate)
   {
      super(id, bal);
      discountRate = rate;
   }
   @Override
   public void display()
   {
      super.display();
      System.out.println("   Discount rate is " + discountRate);
   }
}
