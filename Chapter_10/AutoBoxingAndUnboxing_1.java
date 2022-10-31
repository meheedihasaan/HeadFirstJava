/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_10;

/**
 *
 * @author User
 */
public class AutoBoxingAndUnboxing_1 {
    
    public static void main(String[] args) {
        //Autoboxing: Primitive int to Reference Integer
        Integer a = new Integer(10);    //wrapped
        //Unboxing: Reference Integer to Primitive int
        System.out.println(a.intValue()); //unwrapped
        
        //Autoboxing: Primitive double to Reference Double
        Double b = new Double(15.67);
        //Unboxing: Reference Double to Primitive double
        System.out.println(b.doubleValue());
        
        //Autoboxing: Privitive char to Character
        Character c = new Character('m');
        //Unboxing: Reference Character to Primitive char
        System.out.println(c.charValue());
    }
    
}
