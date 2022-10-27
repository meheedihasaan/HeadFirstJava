/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09;

/**
 *
 * @author User
 */

//Banana Class
class Banana{
    public String vitamin;
    public int weight;
    
    //Non-argumented Constructor
    public Banana(){
        System.out.println("Banana class is starting...");
    }
    
    //Argumented Constructor
    public Banana(String vitamin, int weight){
        this.vitamin = vitamin;
        this.weight = weight;
        System.out.println("Vitamin: "+vitamin+", Weight: "+weight+" gm.");
    }
}

//Driver Class
public class ConstructorOverloading {
    
    public static void main(String[] args) {
        Banana banana1 = new Banana();
        Banana banana2 = new Banana("A", 100);
    }
    
}
