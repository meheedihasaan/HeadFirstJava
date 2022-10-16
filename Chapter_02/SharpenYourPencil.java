/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_02;

/**
 *
 * @author Acer
 */

class Television {
    String model;
    int width;
    int price;
    
    void onTelevision(){
        System.out.println("Television is on...");
    }
    
    void showDetails(){
        System.out.println("Television model is "+model+", Display width "+width+", and Price "+price+" taka");
    }
}

public class SharpenYourPencil {
    
    public static void main(String[] args) {
        Television tv = new Television();
        tv.model = "Sony M2";
        tv.width = 21;
        tv.price = 15000;
        
        tv.onTelevision();
        tv.showDetails();
    }
    
}
