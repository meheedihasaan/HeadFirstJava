/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09;

/**
 *
 * @author User
 */

//Super Class
class Father{
    //Non-Argumented Constructor
    public Father(){
        System.out.println("Father class is running.");
    }
}

//Sub Class
class Son extends Father{
    //Argumented Constructor
    public Son(){
        System.out.println("Son class is running");
    }
}

//Driver class
public class ConstructorChain {
    
    public static void main(String[] args) {
        //If a subclass inherites super class and we instantiate sub class
        //Then at first super class constructor will be run, then sub class's constructor will be run
        Son son = new Son();
    }
    
}
