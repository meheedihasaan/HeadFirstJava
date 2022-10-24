/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_08;

/**
 *
 * @author User
 */

//Abstract Super Class
abstract class Animal{
    public String name;
    public int size;
    
    public Animal(String name, int size){
        this.name = name;
        this.size = size;
    }
    
    //Abstract method
    abstract public String details();
}

//Sub Class-2
class Dog extends Animal{
    public String food;
    public Dog(String name, int size, String food){
        super(name, size);
        this.food = food;
    }
    
    //Override Abstract Method
    @Override
    public String details(){
        return "Dog Name: "+super.name+", Size: "+super.size+", Food: "+food+".";
    }
}

//Sub Class-2
class Cat extends Animal{
    public String food;
    public Cat(String name, int size, String food){
        super(name, size);
        this.food = food;
    }
    
    //Overrride Abstract Method
    @Override
    public String details(){
        return "Cat Name: "+super.name+", Size: "+super.size+", Food: "+food+".";
    }
}

//Class For Custom ArrayList Based on Animal class
class MyArrayList{
    //Declare Array of Animal class Type
    Animal[] animals = new Animal[4];
    private int nextIndex = 0;
    
    //Method for adding element
    public void add(Animal a){
        animals[nextIndex] = a;
        System.out.println("Animal "+a.name+" added at "+nextIndex);
        nextIndex++;
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        //Instantiale MyArrayList
        MyArrayList list = new MyArrayList();
        
        //Instantiate both Dog and Cat Class
        Dog dog1 = new Dog("Bob", 36, "Fish");
        Dog dog2 = new Dog("Tony", 40, "Meat");
        Cat cat1 = new Cat("Mini", 22, "Banana");
        Cat cat2 = new Cat("Illy", 25, "Milk");
        
        //Add element into MyArrayList
        list.add(dog1);
        list.add(cat1);
        list.add(dog2);
        list.add(cat2);
    }
}
