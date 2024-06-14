/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JswingEvents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Pinky
 */
public class UI {
    private JButton btn;
    private JFrame frame;
    private JLabel lbl;
    private int count=0;
    
    
    UI(){
        frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
                
        
        lbl = new JLabel();
        lbl.setBounds(180, 190, 200, 250);
        
        btn = new JButton("Click Me!");
        btn.setBounds(250, 100, 100, 50);
        btn.setFocusable(false);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                count++;
                lbl.setText("Number of clicks" + count);
            }
        });
        
        frame.add(btn);
        frame.add(lbl);
    }
}
