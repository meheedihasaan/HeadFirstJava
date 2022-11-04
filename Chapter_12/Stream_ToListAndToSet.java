/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author User
 */
public class Stream_ToListAndToSet {
    public static void main(String[] args) {
        List<String> movie = List.of("Titanic", "Avatar", "Ironman", "Troy", "Avatar", "Intersteller", "Avengers");
        
        //Creating List
        List<String> movieList = movie.stream()
                                .sorted((m1, m2)-> m1.length()-m2.length()) //Sorted by title length
                                .distinct() //Only takes the distinct movies
                                .limit(4) //Takes first 4 movies after sorting
                                .collect(Collectors.toList());
        
        System.out.println("Movie List: "+movieList);
        System.out.println();
        
        //Creating unmodifiable List (Can't be updated later)
        List<String> movieList1 = movie.stream()
                                .sorted((m1, m2)-> m1.length()-m2.length()) //Sorted by title length
                                .distinct() //Only takes the distinct movies
                                .limit(4) //Takes first 4 movies after sorting
                                .collect(Collectors.toUnmodifiableList());
        
        //movieList1.add("Spiderman"); //This line will throw error as we can't update unmodifiable list
        System.out.println("Unmodifiable Movie List: "+movieList1);
        System.out.println();
        
        //Creating Set (Stores only Distinct element)
        Set<String> movieSet = movie.stream()
                              .sorted((m1, m2)-> m1.compareTo(m2)) //Sorted in alphabetic order
                              .limit(4) //Takes first 4 movies after sorting
                              .collect(Collectors.toSet()); //Takes only distinct movies among 4 movies
        
        System.out.println("Movie Set: "+movieSet);
        System.out.println();
        
        
        //Creating Unmodifiable(Can't be updated later) Set (Stores only Distinct element)
        Set<String> movieSet1 = movie.stream()
                              .sorted((m1, m2)-> m1.compareTo(m2)) //Sorted in alphabetic order
                              .limit(4) //Takes first 4 movies after sorting
                              .collect(Collectors.toUnmodifiableSet()); //Takes only distinct movies among 4 movies
        
        //movieSet1.add("Braveheart"); //This line will throw error as we can't update unmodifiable set
        System.out.println("Unmodifiable Movie Set: "+movieSet1);
        System.out.println();
    }
}
