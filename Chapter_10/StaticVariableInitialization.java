/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_10;

/**
 *
 * @author User
 */

//Fish Class
class Fish{
    //Static variable should be initialized before initializing instance and static method
    static int fishCount = 0;
    public String name;
    
    public Fish(String name){
        fishCount++;
        this.name = name;
    }
}

//Driver Class
public class StaticVariableInitialization {    
    public static void main(String[] args) {
        System.out.println(Fish.fishCount); //fishCount is now zero, bcz no instance created
        Fish hilsha = new Fish("Hilsha");   //Instance initialized
        System.out.println(Fish.fishCount); //fishCount is now 1
    }   
}
