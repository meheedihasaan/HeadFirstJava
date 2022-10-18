/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_04;

/**
 *
 * @author Acer
 */

class PoorDog {
    private int size;
    private String name;
    
    public void setSize(int size){
        this.size = size;
    }
    
    public int getSize(){
        return size;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}

public class InstanceVariableTest {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        one.setSize(40);
        one.setName("Bob");
        System.out.println("Dog size is "+one.getSize());
        System.out.println("Dog name is "+one.getName());
    }
}
