/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_08;

/**
 *
 * @author User
 */

interface Fruit{
    public String details();
}

class Mango implements Fruit{
    public String name;
    public int weight;
    
    public Mango(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public String details() {
        return "Name : "+name+", "+weight+".";
    }
    
}

public class InterfaceExample {
    public static void main(String[] args) {
        Mango mango = new Mango("Fazli", 15);
        System.out.println(mango.details());
    }
}
