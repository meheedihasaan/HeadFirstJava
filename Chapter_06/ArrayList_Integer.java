/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ArrayList_Integer {
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        for (int num : arr) {
            System.out.println(num);
        }
    }
    
}
