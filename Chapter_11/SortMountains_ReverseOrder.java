/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */

//Driver Class
public class SortMountains_ReverseOrder {
    public static void main(String[] args) {
        new SortMountains_ReverseOrder().go();
    }
    
    public void go(){
        List<Mountains> mountains = new ArrayList<>();
        mountains.add(new Mountains("Longs", 14255));
        mountains.add(new Mountains("Elbert", 14433));
        mountains.add(new Mountains("Meroon", 14156));
        mountains.add(new Mountains("Castle", 14265));
        //System.out.println("as entered:\n"+mountains);
        
        //Sort mountains according to name - Ascending Order
        mountains.sort((m1, m2)-> m1.name.compareTo(m2.name));
        
        //Iterating over the mountains 
        System.out.println("Sort mountains according to name - Ascending Order: ");
        System.out.println(mountains.toString());
        
        System.out.println();
        
        //Sort mountains according to height - Descending/Reverse Order
        mountains.sort((m1, m2)-> m2.height - m1.height);
        System.out.println(mountains.toString());

    }
}

//Mountains Class
class Mountains{
    public String name;
    public int height;
    
    public Mountains(String name, int height){
        this.name = name;
        this.height = height;
    }
    
    @Override
    public String toString(){
        return name+" "+height;
    }
}
