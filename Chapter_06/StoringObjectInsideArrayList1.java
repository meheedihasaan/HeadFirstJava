/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author User
 */

class Dog{
    public String name;
    public int size;
    
    Dog(String name, int size){
        this.name = name;
        this.size = size;
    }
    
    public  void bark(){
        System.out.println(name+" is Barking");
    }
}

public class StoringObjectInsideArrayList1 {
    
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        
        Dog dog1 = new Dog("Bob", 35);
        Dog dog2 = new Dog("Tony", 42);
        Dog dog3 = new Dog("Robby", 37);
        
        //Storing 
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        
        //Sorting dogs on by their name in ascending order
        Collections.sort(dogs, new Comparator<Dog>(){
            
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.name.compareTo(o2.name);
            }
            
        });
        
        //Iterate over the ArrayList
        for (int i = 0; i < dogs.size(); i++ ) {
            Dog dog = dogs.get(i);
            System.out.println("Dog name: "+dog.name+", Size: "+dog.size);
        }       
    }
    
}
