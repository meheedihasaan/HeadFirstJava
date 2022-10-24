/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_08;

import java.util.ArrayList;

/**
 *
 * @author User
 */

class Duck{
    public String name;
    public int size;
    
    Duck(String name, int size){
        this.name = name;
        this.size = size;
    }
    
    public  void makeSound(){
        System.out.println(name+" is making sound.");
    }
}

public class ObjectIntoArrayList {
    
    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>();
        
        Duck duck1 = new Duck("Bob", 35);
        Duck duck2 = new Duck("Tony", 42);
        Duck duck3 = new Duck("Robby", 37);
        
        //Storing 
        ducks.add(duck1);
        ducks.add(duck2);
        ducks.add(duck3);
        
        //Iterate over the ArrayList
        for (int i = 0; i < ducks.size(); i++ ) {
            Duck duck = ducks.get(i);
            System.out.println("Dog name: "+duck.name+", Size: "+duck.size);
        }       
    }
    
}
