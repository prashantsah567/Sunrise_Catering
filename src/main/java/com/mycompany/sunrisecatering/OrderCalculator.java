package com.mycompany.sunrisecatering;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class OrderCalculator extends JFrame{

    private GreetingPanel greetingpanel; //panel for greeting
    private MainDishesPanel maindishespanel; //panel for main dishes
    private SideDishesPanel sidedishespanel; //panel for the side dishes
    private DessertsPanel dessertpanel; //panel for the dessert 
    private JButton calculate; //calculate button for the order calculator frame
    private JButton exit; //exit button for the order calculator frame
    private JPanel buttonpanel; // JPanel for the calculate and exit button
    
    public OrderCalculator(){
        //set the title for the frame
        super("Order Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //initializing all the panel classes
        greetingpanel = new GreetingPanel();
        maindishespanel = new MainDishesPanel();
        sidedishespanel = new SideDishesPanel();
        dessertpanel = new DessertsPanel();
        
        //method that builds the panel for order calculator with two buttons
        buildButtonPanel();
        
        //adding the JPanels to the content pane
        add(greetingpanel, BorderLayout.NORTH);
        add(maindishespanel, BorderLayout.WEST);
        add(sidedishespanel, BorderLayout.CENTER);
        add(dessertpanel, BorderLayout.EAST);
        add(buttonpanel, BorderLayout.SOUTH);
        
        //to set all components together
        pack();
        setVisible(true);
    }
    
    private void buildButtonPanel(){
        //initializing button and adding background color and event listener to it
        calculate = new JButton("Calculate");
        calculate.setForeground(Color.blue);
        calculate.addActionListener(new CalculateBtnListerner());
        exit = new JButton("Exit");
        exit.setForeground(Color.red);
        exit.addActionListener(new ExitBtnListener());
        
        //adding the buttons to the panel
        buttonpanel = new JPanel();
        buttonpanel.add(calculate);
        buttonpanel.add(exit);  
    }
    
    //inner class to handle the calculate button click event
    private class CalculateBtnListerner implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        double mainDishRate, sideDishRate, dessertRate, totalCharge, taxRate = 6.00,tax;
        //decimalformat to format the output
        DecimalFormat df = new DecimalFormat("#,##0.00");
        //getting the rate for each item from the method on each panel classes
        mainDishRate = maindishespanel.getMainDishesRate();
        sideDishRate = sidedishespanel.getSideDishesRate();
        dessertRate = dessertpanel.getDessertRate();
        //calculating the total charge
        totalCharge = mainDishRate+sideDishRate+dessertRate;
        tax = (totalCharge*taxRate)/100;
        
        JOptionPane.showMessageDialog(null, "Subtotal: $"+df.format(totalCharge)+"\nTax: $"+ df.format(tax)
                +"\nTotal: $"+df.format(totalCharge+tax));
        }  
    }
    
    //inner class to handle the exit button click event
    private class ExitBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        System.exit(0);
        }   
    }
    
    
}
