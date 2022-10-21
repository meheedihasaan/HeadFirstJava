/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class ArrayList_Iterator {
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(6);
        arr.add(15);
        arr.add(29);
        arr.add(42);
        
        Iterator it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
  
}
