// Filename: SpaServices
// Asgnmnt M02 Ch4 Tutorial Exercise
// Written by Erick Semones
// Written on 8-30-2024



public class SpaServices
{
    private String serviceDescription;
    private double price;
    SpaServices()
    {
        this("XXX", 0);
    }
    SpaServices(String desc, double pr)
    {
        serviceDescription = desc;
        price = pr;
    }
    public void setServiceDescription(String service)
    {
        serviceDescription = service;
    }
    public void setServicePrice(double servicePrice)
    {
        price = servicePrice;
    }
    public String getServiceDescription()
    {
        return serviceDescription;
    }
    public double getPrice()
    {
        return price;
    }
}