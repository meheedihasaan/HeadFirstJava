/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_10;

/**
 *
 * @author User
 */

//Bird Class
class Bird{  
    //This private constructor stops compiler to create a Bird class instance
    private Bird(){
        
    }
    
    public static String details(String name, int weight){
        return "Bird name: "+name+", Weight: "+weight+" gm.";
    }
}

//Driver Class
public class StaticMethod {
    public static void main(String[] args) {
        //Static method should be called by its class referance.
        System.out.println(Bird.details("Doel", 250));
    }
}
