package com.mycompany.sunrisecatering;

import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class MainDishesPanel extends JPanel{
    //prices set as constant
    private final double BEEF_RATE = 70.00;
    private final double CHICKEN_RATE = 60.00;
    private final double SALMON_RATE = 20.00;
    private final double PASTA_RATE = 40.00;
    
    //initalizing radio buttons
    private JRadioButton beef;
    private JRadioButton chicken;
    private JRadioButton salmon;
    private JRadioButton pasta;
    //initializing button group
    private ButtonGroup btnGrp;
    
    //setting up the constructor
    public MainDishesPanel(){
        //creating a decimal formattor object
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        //setting up the buttons
        beef = new JRadioButton("Beef ($"+df.format(BEEF_RATE)+")");
        chicken = new JRadioButton("Chicken ($"+df.format(CHICKEN_RATE)+")");
        salmon = new JRadioButton("Salmon ($"+df.format(SALMON_RATE)+")");
        pasta = new JRadioButton("Pasta ($"+df.format(PASTA_RATE)+")");
        
        //grouping the button
        btnGrp = new ButtonGroup();
        btnGrp.add(beef);
        btnGrp.add(chicken);
        btnGrp.add(salmon);
        btnGrp.add(pasta);
        
        //setting gridlayout manager to JPanel
        setLayout(new GridLayout(4,1));
        
        //create a border to JPanel
        setBorder(BorderFactory.createTitledBorder("Main Dishes"));
        
        //adding to the Jpanel
        add(beef);
        add(chicken);
        add(salmon);
        add(pasta);
        
    }
    //to get the selected item rate
    public double getMainDishesRate()
    {
      double rate = 0.0;
      
      if(beef.isSelected())
         rate = BEEF_RATE;
      else if(chicken.isSelected())
         rate = CHICKEN_RATE;
      else if(salmon.isSelected())
         rate = SALMON_RATE;
      else if(pasta.isSelected())
         rate = PASTA_RATE;
      
      return rate;
    }
}
