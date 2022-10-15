package com.mycompany.sunrisecatering;

import java.awt.*;
import javax.swing.*;

public class GreetingPanel extends JPanel {
    private JLabel label;
    
    public GreetingPanel(){
        label = new JLabel("Welcome to Sunrise Speciality Catering");
        label.setForeground(Color.MAGENTA);
        label.setFont(new Font("Verdana", Font.BOLD, 18));
        add(label);
    }
}