// filename JHelloFrame
// asgnmnt  M08 Ch14 Pg 565, Fig 14-25
// date     10/11/2024



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JHelloFrame extends JFrame implements ActionListener
{
   JLabel question = new JLabel("What is your name?");
   Font bigFont = new Font("Arial", Font.BOLD, 16);
   JTextField answer = new JTextField(10);
   JButton pressMe = new JButton("Press me");
   JLabel greeting = new JLabel("");
   final int WIDTH = 275;
   final int HEIGHT = 225;
   public JHelloFrame()
   {
      super("Hello Frame");
      setSize(WIDTH, HEIGHT);
      setLayout(new FlowLayout());
      question.setFont(bigFont);
      greeting.setFont(bigFont);
      add(question);
      add(answer);
      add(pressMe);
      add(greeting);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pressMe.addActionListener(this);
    }
   @Override
   public void actionPerformed(ActionEvent e)
   {
       String name = answer.getText();
       String greet = "Hello, " + name;
       greeting.setText(greet);
   }
}
