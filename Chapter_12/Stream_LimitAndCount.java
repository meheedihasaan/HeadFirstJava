/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12;

import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author User
 */
public class Stream_LimitAndCount {
    public static void main(String[] args) {
        List<String> movieList = List.of("Titanic", "Avatar", "Inception", "Revenant");
        
        //Added movieList into movieStream
        Stream<String> movieStream = movieList.stream();
        
        //Maximum 3 movies will be added into limit Stream
        Stream<String> limit = movieStream.limit(3);
        
        //count() returns the current size of Stream
        long size = limit.count();
        System.out.println(size);
    }
}
