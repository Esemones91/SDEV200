// filename JDemoFrame
// asgnmnt  M08 Ch14 Pg. 550
// author   Erick Semones
// date     10/1//2024



import javax.swing.*;

public class JDemoFrame extends JFrame
{
    public static void main(String[] args) 
    {
        JFrame aFrame = new JFrame("This is a frame");
        final int WIDTH = 300;
        final int HEIGHT = 250;

        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }    
}
