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
class Songs4{
    public String title;
    public String artist;
    public int bpm;
    
    public Songs4(String title, String artist, int bpm){
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
class MockSongs4{
    public static List<Songs4> getSongString(){
        List<Songs4> songs = new ArrayList<>();
        songs.add(new Songs4("My heart will go on", "Celine Dion", 128));
        songs.add(new Songs4("Hundred years", "Cristina Perry", 356));
        songs.add(new Songs4("Cold Water", "Justin Bieber", 128));
        
        return songs;
    }
}

//Driver class
public class JukeBox4_Lambda {
    public static void main(String[] args) {
        new JukeBox4_Lambda().go();
    }
    
    public void go(){
        List<Songs4> songList = MockSongs4.getSongString();
        
        //Sort songList according to title using Lambda Expression
        //songList.sort((a, b)-> a.getTitle().compareTo(b.getTitle())); //Method - 1
        Collections.sort(songList, (song1, song2)-> song1.getTitle().compareTo(song2.getTitle())); //Method - 2
        
        //Iterating over the songList
        System.out.println("Sorting according to title: ");
        for (int i = 0; i < songList.size(); i++) {
            System.out.println("Title: "+songList.get(i).getTitle()+", Artist: "+songList.get(i).getArtist()+", BPM: "+songList.get(i).getBpm());
        }
        System.out.println();
        
        //Sort songList according artist using Lambda Expression
        //Collections.sort(songList, (song1, song2)-> song1.getArtist().compareTo(song2.getArtist())); //Method - 1
        songList.sort((song1, song2)-> song1.getArtist().compareTo(song2.getArtist())); //Method - 1
        
        //Iterating over the songList
        System.out.println("Sorting according to artist: ");
        for (int i = 0; i < songList.size(); i++) {
            System.out.println("Title: "+songList.get(i).getTitle()+", Artist: "+songList.get(i).getArtist()+", BPM: "+songList.get(i).getBpm());
        }
    }    
}
