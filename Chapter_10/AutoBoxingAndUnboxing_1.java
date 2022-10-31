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
        //Autoboxing: Primitive int to Wrapper Integer Class
        Integer a = new Integer(10);    //wrapped
        //Unboxing: Wrapper Integer class to Primitive int
        System.out.println(a.intValue()); //unwrapped
        
        //Autoboxing: Primitive double to Wrapper Double Class
        Double b = new Double(15.67);
        //Unboxing: Wrapper Double Class to Primitive double
        System.out.println(b.doubleValue());
        
        //Autoboxing: Privitive char to Wrapper Character Class
        Character c = new Character('m');
        //Unboxing: Wrapper Character Class to Primitive char
        System.out.println(c.charValue());
    }
    
}
