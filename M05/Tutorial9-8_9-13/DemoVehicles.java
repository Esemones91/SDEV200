// Filename DemoVehicles
// Asgnmnt  M05 Ch9 Pg 355
// Written by Erick Semones
// Written on 9-20-2024



import javax.swing.JOptionPane;

public class DemoVehicles 
{
    public static void main(String[] args) 
    {
        Sailboat aBoat = new Sailboat();
        Bicycle aBike = new Bicycle();
        
        JOptionPane.showMessageDialog(null,
            "\nVehicle description:\n" +
            aBoat.toString() + "\n" + aBike.toString());
    }
}
