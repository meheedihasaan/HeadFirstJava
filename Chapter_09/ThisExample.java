/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09;

/**
 *
 * @author User
 */

//Football Class
class Football {
    public String name;
    public int radius;
    public int weight;
    
    //First Constructor
    public Football(int weight){
        this.weight = weight;
    }
    
    //Second Constructor
    public Football(String name, int radius, int weight){
        //Passing Argument to the 1st Constructor
        this(weight);
        this.name = name;
        this.radius = radius;
    }
    
    public String details(){
        return("Football name: "+name+", Radius: "+radius+" cm, Weight: "+weight+" gm.");
    }
}

//Driver Class
public class ThisExample {
    public static void main(String[] args) {
        Football f = new Football("Brazuka", 28, 450);
        System.out.println(f.details());;
    }
}
