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
public class Stream_CollectAndCollectorsTogether {
    public static void main(String[] args) {
        List<String> songList = List.of("Sorry", "Faded", "Alone", "Lilly");
        
        //Added songList into a stream then took 3 element and collect them into resultList
        List<String> resultList = songList.stream().limit(3).collect(Collectors.toList());
        System.out.println(resultList);
    }
}
