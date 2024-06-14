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
public class HomePage extends JFrame implements ActionListener {
    
    private JButton btnlogin = new JButton("Login");
    private JButton btnwelcome = new JButton("Welcome");
    private JLabel lhome = new JLabel("Home Page.");

    
    HomePage(){
       
       setTitle("Home Page");
       setSize(500,500);
       setLayout(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       btnlogin.setBounds(100, 200, 100, 50);
       btnlogin.addActionListener(this);
       btnlogin.setFocusable(false);
        
       btnwelcome.setBounds(300, 200, 100, 50);
       btnwelcome.addActionListener(this);
       btnwelcome.setFocusable(false);

       lhome.setBounds(150, 100, 400, 50);
       lhome.setFont(new Font("Arial",Font.PLAIN,30));
       
       
        add(btnlogin);
        add(btnwelcome);
        add(lhome);
        
        setVisible(true);

       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        
        if (e.getSource() == btnlogin)
        {
            new LoginPage();
        }
        else if (e.getSource() == btnwelcome)
        {
            new WelcomePage();
        }
    }
}
