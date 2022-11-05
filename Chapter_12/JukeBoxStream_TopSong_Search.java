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
class Song3{
    private final String title;
    private final String artist;
    private final String genre;
    private final int year;
    private final int timePlayed;
    
    public Song3(String title, String artist, String genre, int year, int timePlayed){
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
class MockSongs3{
    public static List<Song3> getSongs(){
        return List.of(
            new Song3("Alone", "Alan Walker", "Rock", 2014, 134),
            new Song3("Sorry", "Justin Bieber", "Rock", 2015, 287),
            new Song3("Love me like you do", "Ellie Goulding", "Soft Rock", 2017, 290),
            new Song3("Let me down slowly", "Alex Benzamin", "Melody", 2021, 346),
            new Song3("Hundred years", "Cristina Perry", "Soft Rock", 2019, 218),
            new Song3("Baby", "Justin Bieber", "Rock", 2014, 456),
            new Song3("Faded", "Alan Walker", "Soft Rock", 2017, 379),
            new Song3("Hundred years", "Kia", "Melody", 2020, 186)
        );
    }
}

//Driver Class
public class JukeBoxStream_TopSong_Search {
    public static void main(String[] args) {
        SongSearch songSearch = new SongSearch();
        songSearch.printTopFiveSongs();
        
        songSearch.search("Justin Bieber");
        songSearch.search("Cristina Perry");
    }
}

//Search CLass
class SongSearch{
    private final List<Song3> songs = MockSongs3.getSongs();
    
    public void printTopFiveSongs(){
        List<String> topSongs = songs.stream()
                                .sorted((song1, song2)-> song2.getTimePlayed()-song1.getTimePlayed())
                                .map(song-> song.getTitle())
                                .limit(5)
                                .collect(Collectors.toList());
        System.out.println("5 most played songs : "+topSongs);
    }
    
    public void search(String artist){
        Optional<Song3> result = songs.stream()
                            .filter(song-> song.getArtist().equals(artist))
                            .findFirst();
        if(result.isPresent()){
            System.out.println("Song of "+artist+" is: "+result.get().getTitle());
        }
        else{
            System.out.println("No song found by "+artist);
        }
    }
}