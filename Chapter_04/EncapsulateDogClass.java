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

//Page Number : 261

class GoodDog {
    //Make the instance variable private so that other class can't directly acess it
    private int size;
    
    //Make the getter and setter public
    public int getSize(){
        return size;
    }
    
    public void setSize(int s){
        size = s;
    }
    
    void bark(){
        if(size > 60){
            System.out.println("Woof! Woof!");
        }
        else if(size > 14){
            System.out.println("Ruff! Ruff");
        }
        else{
            System.out.println("Yip! Yip!");
        }
    }
}

public class EncapsulateDogClass {
    
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(40);
        GoodDog two = new GoodDog();
        two.setSize(70);
        
        System.out.println("Dog one barks: "+one.getSize());
        System.out.println("Dog two barks: "+two.getSize());
        one.bark();
        two.bark();
    }
    
}
