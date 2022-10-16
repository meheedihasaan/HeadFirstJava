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

class DrumKit{
    boolean topHat = true;
    boolean snare = true;
    
    void playTopHat(){
        System.out.println("ding ding da-ding");
    }
    
    void playSnare(){
        System.out.println("bang bang ba-bang");
    }
}

public class DrumKitTest {
    
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();
        if(d.snare == true){
            d.playSnare();
        }
    }
    
}
