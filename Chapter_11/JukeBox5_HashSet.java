/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author User
 */

//Songs Class
class Songs5 implements Comparable<Songs5>{
    private String title;
    private String artist;
    private int bpm;
    
    public Songs5(String title, String artist, int bpm){
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
    
    //For avoiding duplicate song title
    @Override
    public boolean equals(Object song){
        Songs5 other = (Songs5) song;
        return this.title.equals(other.title);
    }
    
    @Override
    public int hashCode(){
        return title.hashCode();
    }
    
    @Override
    public int compareTo(Songs5 s){
        return this.title.compareTo(s.getTitle());
    }
}

//MockSongs Class
class MockSongs5{
    public static List<Songs5> getSongString(){
        List<Songs5> songs = new ArrayList<>();
        songs.add(new Songs5("My heart will go on", "Celine Dion", 128));
        songs.add(new Songs5("Hundred years", "Cristina Perry", 356));
        songs.add(new Songs5("Cold Water", "Justin Bieber", 128));
        songs.add(new Songs5("Hundred years", "Taylor Swift", 128));
        
        return songs;
    }
}

//JukeBox Class
public class JukeBox5_HashSet {
    public static void main(String[] args) {
        new JukeBox5_HashSet().go();
    }
    
    public void go(){
        List<Songs5> songList = MockSongs5.getSongString();
        
        //Storing songList inside songSet
        Set<Songs5> songSet = new HashSet<>(songList);
        //Iterating over the songList
        for (Songs5 song : songSet) {
            System.out.println("Title: "+song.getTitle()+", Artist: "+song.getArtist()+", BPM: "+song.getBpm());
        }
    }
}
