/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_10;

/**
 *
 * @author User
 */

//Super Class
class StaticSuper{
    //Will be shown first
    static{
        System.out.println("Super class static block.");
    }
    
    //Will be shown fourth
    public StaticSuper(){
        System.out.println("Super constructor.");
    }
}

public class StaticTest extends StaticSuper {
    static int rand;
    //Will be shown second
    static{
        rand = (int)(Math.random() * 6);
        System.out.println("Static block "+rand);
    }
    
    //Will be shown fifth
    StaticTest(){
        System.out.println("Constructor");
    }
    
    public static void main(String[] args) {
        //Will be shown third
        System.out.println("in main");
        
        StaticTest st = new StaticTest();
    }
}
