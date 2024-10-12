// filename JDemoFrameThatCloses
// asgnmnt  M08 Ch14 Pg 550
// author   Erick Semones
// date     10/11/2024



import javax.swing.*;

public class JDemoFrameThatCloses extends JFrame
{
    public static void main(String[] args) 
    {
        
        JFrame aFrame = new JFrame("This is a frame");
        final int WIDTH = 300;
        final int HEIGHT = 250;

        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
