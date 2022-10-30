/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_10;

/**
 *
 * @author User
 */

//Hen Class
class Hen{
    //henCount is static. So henCount value will be used in every Hen instance
    static int henCount = 0;
    public Hen(){
        henCount++;
    }
    
    public int getCount(){
        return henCount;
    }
}

//Driver Class
public class StaticVariable {
    public static void main(String[] args) {
        //henCount is static variable. So it follows 'one value per class' rule
        
        //henCount is 1 in hen1 instance
        Hen hen1 = new Hen();
        System.out.println("Number of Hen: "+hen1.getCount());
        
        //henCount is one, but increased 1 in hen2 instance. So it is now 2.
        Hen hen2 = new Hen();
        System.out.println("Number of Hen: "+hen2.getCount());
        
        //henCount is two, but increased 1 in hen3 instance. So it is now 3.
        Hen hen3 = new Hen();
        System.out.println("Number of Hen: "+hen3.getCount());
    }
}
