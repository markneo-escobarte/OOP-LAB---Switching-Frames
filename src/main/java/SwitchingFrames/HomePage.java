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
public class HomePage {
    private JFrame f;
    private JButton btnlogin = new JButton("Login");
    private JButton btnwelcome = new JButton("Welcome");
    
    HomePage(){
        f = new JFrame();
        f.setTitle("Home Page");
        f.setSize(600,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        btnlogin.setBounds(120, 150, 80, 50);
        btnlogin.setFocusable(false);
        btnlogin.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
                f.dispose();
                new LoginPage();
                
            }
        });
        
        
        btnwelcome.setBounds(20, 150, 90, 50);
        btnwelcome.setFocusable(false);
        btnwelcome.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
                f.dispose();
                new WelcomePage();
                
            }
        });
        
        
        f.add(btnlogin);
        f.add(btnwelcome);
        f.setVisible(true);
        
        
        
    }

  
    
   
}
