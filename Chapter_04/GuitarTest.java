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

class ElectricGuitar{
    //Instance Variable
    String brand;
    int numOfPickups;
    boolean rockstarUsesIt;
    
    //Getters and Setters with various return type
    String getBrand(){
        return brand;
    }
    
    void setBrand(String aBrand){
        brand = aBrand;
    }
    
    int getNumOfPickups(){
        return numOfPickups;
    }
    
    void setNumOfPickups(int num){
        numOfPickups = num;
    }
    
    boolean getRockstarUsesIt(){
        return rockstarUsesIt;
    }
    
    void setRockstarUsesIt(boolean yesOrNo){
        rockstarUsesIt = yesOrNo;
    }
    
    String details(){
        return "Guitar Brand is: "+brand+".\nNumber of Pickups: "+numOfPickups+".\nRockstar uses it? - "+rockstarUsesIt+".";
    }
}

public class GuitarTest {
    
    public static void main(String[] args) {
        ElectricGuitar one = new ElectricGuitar();
        one.setBrand("Jackson");
        one.setNumOfPickups(6);
        one.setRockstarUsesIt(true);
        System.out.println(one.details());
    }
    
}
