// filname  JFrameWithComponents
// asgnmnt  M08 Ch14 Pg 561
// author   Erick Semones
// date     10/11/2024



import java.awt.*;
import javax.swing.*;

public class JFrameWithComponents extends JFrame
{
    JLabel label = new JLabel("Name?");
    JTextField field = new JTextField(12);
    JButton button = new JButton("OK");

    public JFrameWithComponents()
    {
        super("Frame With Components");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(label);
        add(field);
        add(button);
    }
}
