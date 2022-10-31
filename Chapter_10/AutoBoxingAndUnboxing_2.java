/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_10;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AutoBoxingAndUnboxing_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //Autoboxing: Primitive int to Wrapper Integer Class
        list.add(5);
        list.add(9);
        list.add(15);
        
        //Unboxing: Wrapper Integer Class to Primitive int
        int val = list.get(1);
        System.out.println(val);
        
        Integer a = new Integer(5);
        a = a+4;
        System.out.println(a);
        
        Integer b = 7;
        int c = b+5;
        System.out.println(c);
    }
}
