/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_03;

/**
 *
 * @author Acer
 */
public class Dog {
    
    String name;
    
    public static void main(String[] args) {
        //Create a Dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";
        
        //Create a Dog array and put some dogs in it
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        
        //Access the Dogs using the array object
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        
        //Then what is myDogs[2] name?
        System.out.print("Last dog's name is ");
        System.out.println(myDogs[2].name);
        
        //Loop through the array and tell the dog to bark
        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
        
    }
    
    public void bark() {
        System.out.println(name+" says Ruff!");
    }
    
    public void eat(){
        
    }
    
    public void chaseCat(){
        
    }
    
}
