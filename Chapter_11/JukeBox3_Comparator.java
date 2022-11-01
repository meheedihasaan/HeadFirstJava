/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author User
 */

//Songs Class
class Songs3{
    private String title;
    private String artist;
    private int bpm;
    
    public Songs3(String title, String artist, int bpm){
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
}

//MockSongs Class
class MockSongs3{
    public static List<Songs3> getSongString(){
        List<Songs3> songs = new ArrayList<>();
        songs.add(new Songs3("My heart will go on", "Celine Dion", 128));
        songs.add(new Songs3("Hundred years", "Cristina Perry", 356));
        songs.add(new Songs3("Cold Water", "Justin Bieber", 128));
        
        return songs;
    }
}

//Implementing Comparator Interface
class ArtistCompare implements Comparator<Songs3>{
    //Sort Songs according to their artist
    @Override
    public int compare(Songs3 s1, Songs3 s2){
        return s1.getArtist().compareTo(s2.getArtist());
    }
}

//Driver Class
public class JukeBox3_Comparator {
    public static void main(String[] args) {
        new JukeBox3_Comparator().go();
    }
    
    public void go(){
        List<Songs3> songList = MockSongs3.getSongString();
        ArtistCompare artistCompare = new ArtistCompare();
        //Collections.sort(songList, artistCompare);  //Method - 1
        songList.sort(artistCompare);  //Method - 2
        
        //Iterating over the songList
        for (int i = 0; i < songList.size(); i++) {
            System.out.println("Title: "+songList.get(i).getTitle()+", Artist: "+songList.get(i).getArtist()+", BPM: "+songList.get(i).getBpm());
        }
    }
}

