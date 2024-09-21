// Filename VehicleDatabase
// Asgnmnt  M05 Ch9 Pg 362
// Written by Erick Semones
// Written on 9-21-2024



import javax.swing.*;

public class VehicleDatabase 
{
    public static void main(String[] args) 
    {
        Vehicle[] vehicles = new Vehicle[5];
        int x;
        
        // choose your vehicle type
        for(x = 0; x < vehicles.length; ++x)
        {
            String userEntry;
            int vehicleType;

            userEntry = JOptionPane.showInputDialog(null, 
                "Please select the type of \n" +
                   "vehicle you wish to enter: \n 1 - Sailboat " +
                    "2 - Bicycle");
            vehicleType = Integer.parseInt(userEntry);

            // which vehicle did you choose?
            if(vehicleType == 1)
            {
                vehicles[x] = new Sailboat();
            }
            else 
            {
                vehicles[x] = new Bicycle();
            }
        }

        // display the array
        StringBuffer outString = new StringBuffer();

        for(x = 0; x < vehicles.length; ++x)
        {
            outString.append("\n#" + (x + 1) + "");
            outString.append(vehicles[x].toString());
        }

        JOptionPane.showMessageDialog(null, 
            "Our available vehicles include:\n" + outString);
    }
}
