/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
public class ArraylistExample {
    
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(3);
        list1.add(7);
        list1.add(5);
        
        //Randomly access list1's element by index
        System.out.println("Second element of list1 is : "+list1.get(1));
        
        //Get the size of list1
        System.out.println("List1 size : "+list1.size());
        
        //Sorting list1 in Ascending Order
        Collections.sort(list1);
        
        //Reset the third element of list1
        list1.set(2, 6);
        
        System.out.print("Elements of list1 : ");
        for (int i : list1) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(1);
        list2.add(8);
        list2.add(7);
        
        //Remove 2nd element of list2
        list2.remove(1);
        
        //Sorting list2 in Descending Order
        Collections.sort(list2, Collections.reverseOrder());
        
        //Add all the element of list2 to list1
        list1.addAll(list2);
        System.out.print("Element of list1 after adding all the elements of list2 to list1: ");        
        for (int i : list1) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        //Remove all the elements of list2 from list1
        list1.removeAll(list2);
        System.out.print("Element of list1 after removing all the elements of list2 to list1: ");       
        for (int i : list1) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
