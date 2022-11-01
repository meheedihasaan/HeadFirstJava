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

//Songs Class
class Songs2 implements Comparable<Songs2>{
    private String title;
    private String artist;
    private int bpm;
    
    public Songs2(String title, String artist, int bpm){
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public int getBpm(){
        return bpm;
    }

    //Method for sorting according to title
    public int compareTo(Songs2 song) {
        return title.compareTo(song.getTitle());
    }
}

//MockSong Class
class MockSongs2{
    public static List<Songs2> getSongString(){
        List<Songs2> songs = new ArrayList<>();
        songs.add(new Songs2("My heart will go on", "Celine Dion", 128));
        songs.add(new Songs2("Hundred years", "Cristina Perry", 356));
        songs.add(new Songs2("Cold Water", "Justin Bieber", 128));
        
        return songs;
    }
}

//Driver Class
public class JukeBox2_Comparable {
    public static void main(String[] args) {
        new JukeBox2_Comparable().go();
    }
    
    public void go(){
        List<Songs2> songList = MockSongs2.getSongString();
        Collections.sort(songList);
        
        //Iterating over the songList
        for (int i = 0; i < songList.size(); i++) {
            System.out.println("Title: "+songList.get(i).getTitle()+", Artist: "+songList.get(i).getArtist()+", BPM: "+songList.get(i).getBpm());
        }
    }
}
