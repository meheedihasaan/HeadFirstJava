/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07;

/**
 *
 * @author User
 */

//Super Class
class Grandfather{
    public void printGrandfather(){
        System.out.println("Class Grandfather");
    }
}

//Intermediatory Class
class Father extends Grandfather{
    public void printFather(){
        System.out.println("Class Father");
    }
}

//Sub Class
class Son extends Father{
    public void printSon(){
        System.out.println("Class Son");
    }
}

public class MultiLevelInheritance {
    
    public static void main(String[] args) {
        Grandfather gf = new Grandfather();
        gf.printGrandfather();
        System.out.println();
        
        Father f = new Father();
        f.printFather();
        f.printGrandfather();
        System.out.println();
        
        Son s = new Son();
        s.printSon();
        s.printFather();
        s.printGrandfather();
    }
    
}
