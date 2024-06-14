/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwitchingFrames;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 *
 * @author Pinky
 */
public class LoginPage {
    private JFrame f = new JFrame();
    private JButton btnwelcome = new JButton("Welcome");
    private JButton btnhome = new JButton("Home");
    
    
    LoginPage(){
        
        f.setTitle("Login Page");
        f.setSize(600,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        btnwelcome.setBounds(120, 150, 90, 50);
        btnwelcome.setFocusable(false);
        btnwelcome.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.dispose();
                new WelcomePage();
            }
        });
        
        
        btnhome.setBounds(20, 150, 80, 50);
        btnhome.setFocusable(false);
        btnhome.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.dispose();
                new HomePage();
            }
        });
        
        f.add(btnwelcome);
        f.add(btnhome);
        f.setVisible(true);

        
        
        
    }

  
        
}
