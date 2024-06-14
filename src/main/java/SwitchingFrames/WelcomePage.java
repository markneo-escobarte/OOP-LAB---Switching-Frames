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
public class WelcomePage {
    private JFrame f;
    private JButton btnlogin = new JButton("Login");
    private JButton btnhome = new JButton("Home");
    
    WelcomePage(){
        f = new JFrame();
        f.setTitle("Welcome Page");
        f.setSize(600,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        btnlogin.setBounds(120, 150, 80, 50);
        btnlogin.setFocusable(false);
        btnlogin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.dispose();
                new LoginPage();
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

        
        
        f.add(btnlogin);
        f.add(btnhome);
        f.setVisible(true);
        
        
        
        
    }

  
        
}
