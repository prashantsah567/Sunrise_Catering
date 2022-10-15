package com.mycompany.sunrisecatering;

import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class SideDishesPanel extends JPanel {
    private final double SALAD_RATE = 6.50;
    private final double MIXED_VEG_RATE = 9.50;
    private final double POTATOES_RATE = 5.50;
    private final double RICE_DISHES_RATE = 7.75;
    private final double BEANS_RATE = 6.75;
    private final double BREAD_RATE = 4.00;
    
    DecimalFormat df = new DecimalFormat("#,##0.00");
    
    private JCheckBox salad = new JCheckBox("Salad ($"+df.format(SALAD_RATE)+")",false);
    private JCheckBox mixedVeg = new JCheckBox("Mixed Vegetables ($"+df.format(MIXED_VEG_RATE)+")",false);
    private JCheckBox potatoes = new JCheckBox("Potatoes ($"+df.format(POTATOES_RATE)+")",false);
    private JCheckBox riceDishes = new JCheckBox("RiceDishes ($"+df.format(RICE_DISHES_RATE)+")",false);
    private JCheckBox beans = new JCheckBox("Beans ($"+df.format(BEANS_RATE)+")",false);
    private JCheckBox bread = new JCheckBox("Bread ($"+df.format(BREAD_RATE)+")",false);
    
    public SideDishesPanel(){
        //setting gridlayout for the checkboxes
        setLayout(new GridLayout(6,1));
        //creating title 
        setBorder(BorderFactory.createTitledBorder("Side dishes"));
        //adding to the JPanel
        add(salad);
        add(mixedVeg);
        add(potatoes);
        add(riceDishes);
        add(beans);
        add(bread);
    }
    //method that return the rate of selected items
    public double getSideDishesRate()
    {
      double rate = 0.0;
      
      if(salad.isSelected()){
         rate = SALAD_RATE;
         if(mixedVeg.isSelected()) rate += MIXED_VEG_RATE;
         if(potatoes.isSelected()) rate += POTATOES_RATE;
         if(riceDishes.isSelected()) rate += RICE_DISHES_RATE;
         if(beans.isSelected()) rate += BEANS_RATE;
         if(bread.isSelected()) rate += BREAD_RATE;
      }
         
      else if(mixedVeg.isSelected()){
         rate = MIXED_VEG_RATE;
         if(salad.isSelected()) rate += SALAD_RATE;
         if(potatoes.isSelected()) rate += POTATOES_RATE;
         if(riceDishes.isSelected()) rate += RICE_DISHES_RATE;
         if(beans.isSelected()) rate += BEANS_RATE;
         if(bread.isSelected()) rate += BREAD_RATE;
      }
         
      else if(potatoes.isSelected()){
         rate = POTATOES_RATE;
         if(salad.isSelected()) rate += SALAD_RATE;
         if(mixedVeg.isSelected()) rate += MIXED_VEG_RATE;
         if(riceDishes.isSelected()) rate += RICE_DISHES_RATE;
         if(beans.isSelected()) rate += BEANS_RATE;
         if(bread.isSelected()) rate += BREAD_RATE;
      }
      else if(riceDishes.isSelected()){
         rate = RICE_DISHES_RATE;
         if(salad.isSelected()) rate += SALAD_RATE;
         if(mixedVeg.isSelected()) rate += MIXED_VEG_RATE;
         if(potatoes.isSelected()) rate += POTATOES_RATE;
         if(beans.isSelected()) rate += BEANS_RATE;
         if(bread.isSelected()) rate += BREAD_RATE;
      }
      else if(beans.isSelected()){
         rate = BEANS_RATE;
         if(salad.isSelected()) rate += SALAD_RATE;
         if(mixedVeg.isSelected()) rate += MIXED_VEG_RATE;
         if(potatoes.isSelected()) rate += POTATOES_RATE;
         if(riceDishes.isSelected()) rate += RICE_DISHES_RATE;
         if(bread.isSelected()) rate += BREAD_RATE;
      }
      else if(bread.isSelected()){
         rate = BREAD_RATE;
         if(salad.isSelected()) rate += SALAD_RATE;
         if(mixedVeg.isSelected()) rate += MIXED_VEG_RATE;
         if(potatoes.isSelected()) rate += POTATOES_RATE;
         if(riceDishes.isSelected()) rate += RICE_DISHES_RATE;
         if(beans.isSelected()) rate += BEANS_RATE;
      }
      return rate;
    }
}
