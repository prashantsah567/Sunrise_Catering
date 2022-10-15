package com.mycompany.sunrisecatering;

import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class DessertsPanel extends JPanel{
    private final double NONE = 0.0;
    private final double CHOCOLATE_RATE = 2.25;
    private final double APPLE_RATE = 1.50;
    private final double BUTTERSCOTCH_RATE = 2.50;
    
    DecimalFormat df = new DecimalFormat("#,##0.00");
    
    private JRadioButton none = new JRadioButton("None ($"+df.format(NONE)+")");
    private JRadioButton chocolate = new JRadioButton("Chocolate cake ($"+df.format(CHOCOLATE_RATE)+")");
    private JRadioButton apple = new JRadioButton("Apple pie ($"+df.format(APPLE_RATE)+")");
    private JRadioButton butter = new JRadioButton("Butterscotch pudding ($"+df.format(BUTTERSCOTCH_RATE)+")");
    
    private ButtonGroup btnGrp = new ButtonGroup();
    
    public DessertsPanel(){
        //adding to the button group
       btnGrp.add(none);
       btnGrp.add(chocolate);
       btnGrp.add(apple);
       btnGrp.add(butter);
       
       //setting the grid layout
       setLayout(new GridLayout(4,1));
       //adding border title
       setBorder(BorderFactory.createTitledBorder("Desserts"));
       //adding to the JPanel
       add(none);
       add(chocolate);
       add(apple);
       add(butter);

    }
    public double getDessertRate(){
        double rate=0.0;
        if(none.isSelected()) 
            rate = NONE;
        else if(chocolate.isSelected())
            rate = CHOCOLATE_RATE;
        else if(apple.isSelected())
            rate = APPLE_RATE;
        else if(butter.isSelected())
            rate = BUTTERSCOTCH_RATE;
        return rate;
    }
}
