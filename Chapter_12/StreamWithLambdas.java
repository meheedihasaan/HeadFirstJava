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
public class StreamWithLambdas {
    public static void main(String[] args) {
        List<String> songList = List.of("Faded", "Alone", "Sorry", "Lilly", "Sorry", "Alone", "Faded");
        List<String> resultList = songList.stream()
                        .sorted((song1, song2)->song1.compareTo(song2)) //Sorted in ascending order
                        .distinct()  //Takes only distinct song
                        .limit(4)
                        .collect(Collectors.toList());
        System.out.println(resultList);
    }
}
