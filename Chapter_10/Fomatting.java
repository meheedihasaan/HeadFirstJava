/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_10;

/**
 *
 * @author User
 */
public class Fomatting {
    
    public static void main(String[] args) {      
        //Decimal Formatting
        System.out.println("Decimal Formatting: ");
        int a = 1233939003;
        String s1 = String.format("%,d", a);
        System.out.println(s1);
        System.out.println();
        
        //Hexadecimal Formatting
        System.out.println("Hexadecimal Formatting: ");
        int y = 42;
        System.out.printf("%x", y);
        System.out.println();
        System.out.println();
        
        //Float Formatting
        System.out.println("Float Formatting: ");
        double b = 13293299.8929893;
        String s2 = String.format("%,f.", b);
        System.out.println(s2);
        
        double c = 93993993.899939939939;
        System.out.printf("%,.3f", c);
        System.out.println();
        System.out.println();
        
        //Character Formatting
        System.out.println("Character Formatting: ");
        System.out.printf("%c", 42);
        System.out.println();
        
        String ch = String.format("%c", 45);
        System.out.println(ch);
        System.out.println();
        
        //Multiple Formatting in one line
        System.out.println("Multiple Number Formatting in a Line: ");
        double val1 = 1298.5689;
        int val2 = 3000;
        String m = String.format("I scored %.2f out of %,d", val1, val2);
        System.out.println(m);
        
        System.out.printf("I scored %.2f out of %,d", 1298.78483, 3000);
        System.out.println();
    }
    
}
