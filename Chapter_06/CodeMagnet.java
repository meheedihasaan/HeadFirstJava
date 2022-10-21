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
public class CodeMagnet {
    
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printList(a);
        
        if(a.contains("three")){
            a.add("four");
        }
        a.remove(2);
        printList(a);
        
        if(a.indexOf("four") != 4){
            a.add(4, "4.2");
        }
        printList(a);
        
        if(a.contains("two")){
            a.add("2.2");
        }
        printList(a);
    }
    
    public static void printList(ArrayList<String> list){
        for (String element : list) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
    
}
