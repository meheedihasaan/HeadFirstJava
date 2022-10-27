/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09;

/**
 *
 * @author User
 */

//Orange Class
class Orange{
    public String vitamin;
    public int weight;
    
    //Argumented Constructor
    public Orange(String vitamin, int weight){
        this.vitamin = vitamin;
        this.weight = weight;
        System.out.println("Vitamin: "+vitamin+", Weight: "+weight+" gm.");
    }
}

//Driver Class
public class ArgumentedConstructor {
    
    public static void main(String[] args) {
        Orange orange = new Orange("C", 450);
    }
    
}
