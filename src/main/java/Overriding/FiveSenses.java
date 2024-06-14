/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overriding;

/**
 *
 * @author Pinky
 */
public class FiveSenses extends Organs {
    
    @Override
    public void Taste(){
        System.out.println("for tasting");
    }
    
    public void Hear(){
        System.out.println("for hearing");
    }
    
    public void See(){
        System.out.println("for seeing");
    }
    
    public void Touch(){
        System.out.println("for touching");
    }
    
    public void Smell(){
        System.out.println("for smelling");
    }
}
