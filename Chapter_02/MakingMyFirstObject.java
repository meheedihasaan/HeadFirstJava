/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_02;

/**
 *
 * @author Acer
 */

class Dog{
    int size;
    String breed;
    String name;
    
    void bark(){
        System.out.println("Ruff! Ruff!");
    }
}

public class MakingMyFirstObject {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.size = 30;
        dog.bark();
    }
}
