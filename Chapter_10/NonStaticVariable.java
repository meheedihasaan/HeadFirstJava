/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_10;

/**
 *
 * @author User
 */

//Duck Class
class Duck{
    int duckCount;
    public Duck(){
        duckCount++;
    }
}

//Driver Class
public class NonStaticVariable {
    public static void main(String[] args) {
        //All the instance's duckCount is 1. Because duckCount is non-static variable.
        //So,It follows 'one value per instance' rule.
        Duck duck1 = new Duck();
        System.out.println("Number of Duck: "+duck1.duckCount);
        
        Duck duck2 = new Duck();
        System.out.println("Number of Duck: "+duck2.duckCount);
        
        Duck duck3 = new Duck();
        System.out.println("Number of Duck: "+duck3.duckCount);
    }
}
