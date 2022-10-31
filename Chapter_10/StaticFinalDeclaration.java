/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_10;

/**
 *
 * @author User
 */
public class StaticFinalDeclaration {
    static final double PI = 3.1416;
    static final double ACCELERATION;
    
    //Static Final variable should be initialized while declaring or in static block before use.
    static{
        ACCELERATION = 9.8;
    }
    
    public static void main(String[] args) {
        System.out.println("The value of PI: "+PI);
        System.out.println("The value of ACCELERATION: "+ACCELERATION);
    }
    
}
