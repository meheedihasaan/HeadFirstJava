/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author User
 */
public class Stream_NotChangeTheOriginalCollection {
    public static void main(String[] args) {
        List<String> songList = List.of("Sorry", "Alone", "Lilly", "Faded");
        //Stream Pipeline
        List<String> resultList = songList.stream() //Creating Stream
                                        .sorted() //Sorting Stream
                                        .limit(3) //Taking three songs
                                        .collect(Collectors.toList()); //Collect songs into resultList
        System.out.println("SongList: "+songList);
        System.out.println("ResultList: "+resultList);
    }
}
