// filename CreateJFrameWithComponents
// asgnmnt  M08 Ch14 Pg 561
// author   Erick Semones
/// date    10/11/2024



import javax.swing.*;

public class CreateJFrameWithComponents extends JFrame
{
    public static void main(String[] args) 
    {
        JFrameWithComponents aFrame =
            new JFrameWithComponents();
        final int WIDTH = 350;
        final int HEIGHT = 100;

        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }    
}
