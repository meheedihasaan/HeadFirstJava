/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author User
 */

//Song Class
class Song2{
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timePlayed;
    
    public Song2(String title, String artist, String genre, int year, int timePlayed){
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
class MockSongs2{
    public static List<Song2> getSongs(){
        return List.of(
            new Song2("Alone", "Alan Walker", "Rock", 2014, 134),
            new Song2("Sorry", "Justin Bieber", "Rock", 2015, 287),
            new Song2("Love me like you do", "Ellie Goulding", "Soft Rock", 2017, 290),
            new Song2("Let me down slowly", "Alex Benzamin", "Melody", 2021, 346),
            new Song2("Hundred years", "Cristrina Perry", "Soft Rock", 2019, 218),
            new Song2("Baby", "Justin Bieber", "Rock", 2014, 456),
            new Song2("Hundred years", "Charlie Puth", "Melody", 2020, 186),
            new Song2("Faded", "Alan Walker", "Soft Rock", 2017, 379),
            new Song2("Hundred years", "Kia", "Melody", 2020, 186)
        );
    }
}

//Driver Class
public class JukeboxStream_Optional {
    public static void main(String[] args) {
        new JukeboxStream_Optional().go();
    }
    
    public void go(){
        Optional<Song2> optional = MockSongs2.getSongs().stream()
                                  .filter(song-> song.getYear() == 2017)
                                  .findFirst();
        if(optional.isPresent()){
            System.out.println("Song which played first in 2017 is: "+optional.get().getTitle());
        }
        else{
            System.out.println("No song found");
        }
    }
}
