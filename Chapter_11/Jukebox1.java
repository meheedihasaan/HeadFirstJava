/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */

//MockSongs class
class MockSongs1{
    public static List<String> getSongString(){
        List<String> songs = new ArrayList<>();
        songs.add("My heart will go on");
        songs.add("Hundred years");
        songs.add("Cold Water");
         
        return songs;
    }
}

//Driver Class
public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();
    }
    
    public void go(){
        List<String> songList = MockSongs1.getSongString();
        //Sort in Alphabetic Order
        Collections.sort(songList);
        System.out.println(songList);
    }
}
