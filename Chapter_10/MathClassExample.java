/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_10;

/**
 *
 * @author User
 */
public class MathClassExample {
    
    public static void main(String[] args) {
        //abs() returns the absolute value of a number
        int a = -43;
        System.out.println(Math.abs(a));
        
        float b = -18.09F;
        System.out.println(Math.abs(b));
        
        //max() returns the maximum number between two number
        int num1 = 10;
        int num2 = 12;
        System.out.println(Math.max(num1, num2));
        
        //min() returns the minimum number between two number
        System.out.println(Math.min(num1, num2));
        
        //floor() returns the floor value of a number
        double c = 12.3;
        System.out.println(Math.floor(c));
        
        //ceil() returns the ceil value of a number
        System.out.println(Math.ceil(c));
        
        //pow() return the value of base^pow
        int base = 2;
        int pow = 4;
        System.out.println(Math.pow(base, pow));
        
        //sqrt() returns the square root of a number
        int m = 16;
        System.out.println(Math.sqrt(m));
        
        //cbrt() returns the cube root of a number
        int n = 27;
        System.out.println(Math.cbrt(n));
    }
    
}
