// filename JResortCalculator
// asgnmnt  M08 Ch14 Pg 577
// author   Erick Semones
// date     10/12/2024



import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class JResortCalculator 
    extends JFrame implements ItemListener
{
    // fields
    final int BASE_PRICE = 200;
    final int WEEKEND_PREMIUM = 100;
    final int BREAKFAST_PREMIUM = 20;
    final int GOLF_PREMIUM = 75;
    int totalPrice = BASE_PRICE;

    // check boxes
    JCheckBox weekendBox = new JCheckBox
        ("Weekend Premium: $" + WEEKEND_PREMIUM, false);
    JCheckBox breakfastBox = new JCheckBox
        ("Breakfast: $" + BREAKFAST_PREMIUM, false);
    JCheckBox golfBox = new JCheckBox
        ("Golf: $" + GOLF_PREMIUM, false);
    
    // labels
    JLabel resortLabel = new JLabel("Resort Price Calculator");
    JLabel priceLabel = new JLabel("The price for your saty is");

    // text box
    JTextField totPrice = new JTextField(4);

    JLabel optionExplainLabel = new JLabel
        ("Base price for a stay is $" + BASE_PRICE + " .");
    JLabel optionExplainLabel2 = new JLabel
        ("Check the options you want.");
    
    public JResortCalculator()
    {
        super("Resort Price Estimator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        add(resortLabel);
        add(optionExplainLabel);
        add(optionExplainLabel2);
        add(weekendBox);
        add(breakfastBox);
        add(golfBox);
        add(priceLabel);
        add(totPrice);

        totPrice.setText("$ " + totalPrice);
        weekendBox.addItemListener(this);
        breakfastBox.addItemListener(this);
        golfBox.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent event)
    {
        Object source = event.getSource();
        int select = event.getStateChange();

        if(source == weekendBox)
        {
            if(select == ItemEvent.SELECTED)
            {
                totalPrice +=  WEEKEND_PREMIUM;
            }
            else
            {
                totalPrice -= WEEKEND_PREMIUM;
            }
        }
        else if(source == breakfastBox)
        {
            if(select == ItemEvent.SELECTED)
            {
                totalPrice += BREAKFAST_PREMIUM;
            }
            else 
            {
                totalPrice -= BREAKFAST_PREMIUM;
            }
        }
        else // if(source == golfBox) by default
        {
            if(select == ItemEvent.SELECTED)
            {
                totalPrice += GOLF_PREMIUM;
            }
            else
            {
                totalPrice -= GOLF_PREMIUM;
            }
        }

        totPrice.setText("$ " + totalPrice);
    }

    public static void main(String[] args) 
    {
        JResortCalculator aFrame = new JResortCalculator();
        final int WIDTH = 300;
        final int HEIGHT = 200;
        
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);
    }
}
