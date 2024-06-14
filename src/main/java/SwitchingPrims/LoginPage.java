/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwitchingPrims;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 *
 * @author Pinky
 */
public class LoginPage extends JFrame implements ActionListener{
    
     private JButton btnwelcome = new JButton("Welcome");
     private JButton btnhome = new JButton("Home");
     private JLabel llogin = new JLabel("Login Page");
    
    LoginPage(){
        setTitle("Login Page");
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btnwelcome.setBounds(100, 200, 100, 50);
        btnwelcome.setFocusable(false);
        
        btnhome.setBounds(300, 200, 100, 50);
        btnhome.setFocusable(false);
        
        btnwelcome.addActionListener(this);
        btnhome.addActionListener(this);
        
        llogin.setBounds(150, 100, 400, 50);
        llogin.setFont(new Font("Arial",Font.PLAIN,30));
        
        add(btnwelcome);
        add(btnhome);
        add(llogin);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if (e.getSource() == btnhome)
        {
            new HomePage();
        }
        else if (e.getSource() == btnwelcome)
        {
            new WelcomePage();
        }
        
    }
    
}
