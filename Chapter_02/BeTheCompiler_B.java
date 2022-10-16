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

class Episode{
    int seriesNumber;
    int episodeNumber;
    
    void play(){
        System.out.println("Playing episode...");
    }
    
    void skipIntro(){
        System.out.println("Skipping intro...");
    }
    
    void skipToNext(){
        System.out.println("Loading next episode...");
    }
}

public class BeTheCompiler_B {
    
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.play();
        episode.skipIntro();
    }
    
}
