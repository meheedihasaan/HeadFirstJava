/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_08;

/**
 *
 * @author User
 */

class Dog{
    String name;
    int size;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setSize(int size){
        this.size = size;
    }
    
    public int size(){
        return size;
    }    
}

class Tiger{
    String name;
    int size;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setSize(int size){
        this.size = size;
    }
    
    public int size(){
        return size;
    }    
}

public class ObjectClassTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getClass());
        System.out.println(dog.hashCode());
        System.out.println(dog.toString());
        
        Tiger tiger = new Tiger();
        if(tiger.equals(dog)){
            System.out.println("Tiger and Dog are equal.");
        }
        else{
            System.out.println("Tiger and Dog are not equal.");
        }
    }
}
