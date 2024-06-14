/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwitchingPrims;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WelcomePage extends JFrame implements ActionListener {
    
    private JButton btnlogin = new JButton("Login");
    private JButton btnhome = new JButton("Home");
    private JLabel lwelcome = new JLabel("Welcome Page.");
    
    
    WelcomePage(){
        setTitle("Welcome Page");
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btnlogin.setBounds(100, 200, 100, 50);
        btnlogin.addActionListener(this);
        btnlogin.setFocusable(false);
        
        btnhome.setBounds(300, 200, 100, 50);
        btnhome.addActionListener(this);
        btnhome.setFocusable(false);
        
        lwelcome.setBounds(150, 100, 400, 50);
        lwelcome.setFont(new Font("Arial",Font.PLAIN,30));
        
        add(btnlogin);
        add(btnhome);
        add(lwelcome);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if (e.getSource()== btnlogin)
        {
            new LoginPage();
        } 
        else if (e.getSource() == btnhome)
        {
          new HomePage();  
        }
        
    }
     
}
