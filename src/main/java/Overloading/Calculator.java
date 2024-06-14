/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author Pinky
 */
public class Calculator {
    private int firstnum, secondnum, sumInt;
    private double firstNum, secondNum, sumDouble;
    private String firstname, lastName, concatenate;
    
    
    public void add(int firstnum, int secondnum){
        sumInt = firstnum + secondnum;
        System.out.println("The sum of two integer is "+ sumInt);
    }
    
     public void add(double firstNum, double secondNum){
        sumDouble = firstNum + secondNum;
        System.out.println("The sum of two double is "+ sumDouble);
    }
     
      public void add(String firstname, String lastname){
        concatenate = firstname + lastname;
        System.out.println("The sum of two string is "+ concatenate);
    }
}
