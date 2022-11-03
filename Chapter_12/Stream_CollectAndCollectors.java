/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author User
 */
public class Stream_CollectAndCollectors {
    public static void main(String[] args) {
        List<String> bandList = List.of("Artcell", "Warfaze", "Shironamhin", "Black", "Ark");
        
        //Add bandList into bandStream
        Stream<String> bandStream = bandList.stream();
        
        //3 band from bandStream added into limit Stream
        Stream<String> limit = bandStream.limit(3);
        
        //Added limit Stream into resultList 
        List<String> resultList = limit.collect(Collectors.toList());
        
        System.out.println(resultList);
    }
}
