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

class StreamingSong{
    String title;
    String artist;
    int duration;
    
    void play(){
        System.out.println("Plyaing song");
    }
    
    void printDetails(){
        System.out.println("This is "+title+" by "+artist);
    }
}

public class BeTheCompiler_A {
    public static void main(String[] args) {
        //Instantiate StreamingSong class
        StreamingSong song = new StreamingSong();
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}
