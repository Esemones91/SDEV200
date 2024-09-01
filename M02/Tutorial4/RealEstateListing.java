public class RealEstateListing 
{
    private int listingNumber;
    private double price;
    private HouseData houseData;
    
    public RealEstateListing(int num, double price, String address, int sqFt)
    {
        this.listingNumber = num;
        this.price = price;
        this.houseData = new HouseData(address, sqFt);
    }

    public void display()
    {
        System.out.println("Listing number #" + listingNumber);
        System.out.println("Selling for $" + price);
        System.out.println("Address: " + houseData.streetAddress);
        System.out.println(houseData.sqFt + " square feet");
    }

    private class HouseData
    {
        private String streetAddress;
        private int sqFt;

        public HouseData(String address, int sqFt)
        {
            this.streetAddress = address;
            this.sqFt = sqFt;
        }
    }
}
