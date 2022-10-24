/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_08;

/**
 *
 * @author User
 */


//Abstract class can contain both abstract and non-abstract method
abstract class Employee{
    public int age;
    
    public void setSize(int age){
        this.age = age;
    }
    
    public int getSize(){
        return age;
    }
    
    abstract void details();   
}

public class AbstractClass {
    
    public static void main(String[] args) {
        //This program will show an error.Because abstract class can not be instantiated.
        //Dog dog = new Dog();  
//        dog.setSize(30);
//        dog.getSize();
    }
    
}
