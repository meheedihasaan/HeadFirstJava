/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author User
 */

//Song Class
class Song{
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timePlayed;
    
    public Song(String title, String artist, String genre, int year, int timePlayed){
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timePlayed = timePlayed;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    @Override
    public String toString() {
        return "{Title : " + title + ", Artist : " + artist + ", Genre : " + genre + ", Year : " + year + ", Time Played : " + timePlayed +".}\n";
    }
}

//Class MockSongs
class MockSongs{
    public static List<Song> getSongs(){
        return List.of(
            new Song("Alone", "Alan Walker", "Rock", 2014, 134),
            new Song("Sorry", "Justin Bieber", "Rock", 2015, 287),
            new Song("Love me like you do", "Ellie Goulding", "Soft Rock", 2017, 290),
            new Song("Let me down slowly", "Alex Benzamin", "Melody", 2021, 346),
            new Song("Hundred years", "Cristrina Perry", "Soft Rock", 2019, 218),
            new Song("Baby", "Justin Bieber", "Rock", 2014, 456),
            new Song("Faded", "Alan Walker", "Soft Rock", 2017, 379),
            new Song("Hundred years", "Kia", "Melody", 2020, 186)
        );
    }
}

//Driver Class
public class JukeboxStream_Filtering {
    public static void main(String[] args) {
        new JukeboxStream_Filtering().go();
    }
    
    public void go(){
        //Filtering songs with genre = Rock
        List<Song> rock = MockSongs.getSongs().stream()
                            .filter(song-> song.getGenre().equals("Rock")) //Single parameter lambda
                            .collect(Collectors.toList());
        System.out.println("Rock songs are: \n"+ rock);
        System.out.println();
        
        //Filtering songs with genre contains Rock : (Rock, Soft Rock, ..... Rock)
        List<Song> rockSongs = MockSongs.getSongs().stream()
                            .filter(song-> song.getGenre().contains("Rock"))
                            .collect(Collectors.toList());
        System.out.println("All rock songs are: \n"+ rockSongs);
        System.out.println();
        
        //Filtering songs where title starting with 'L'
        List<Song> songsL = MockSongs.getSongs().stream()
                            .filter(song-> song.getTitle().startsWith("L"))
                            .collect(Collectors.toList());
        System.out.println("Songs starting with 'L' are: \n"+ songsL); 
        System.out.println();
        
        //Boolean operation
        boolean flag = MockSongs.getSongs().stream()
                        .anyMatch(song-> song.getTitle().equals("Faded"));
        System.out.println("Does Faded song exist in SongList: "+flag);
        System.out.println();
    }
}
