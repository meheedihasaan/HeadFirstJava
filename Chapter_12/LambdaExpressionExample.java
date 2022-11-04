/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<String> movieList = new ArrayList<>();
        movieList.add("Titanic");
        movieList.add("Avatar");
        movieList.add("Troy");
        movieList.add("Intersteller");
        
        //Multiline Lambda to sort the movieList in ascending order according to their name length
        //We must use return in multiline lambda
        Collections.sort(movieList, (movie1, movie2)->{
            int a = movie1.length();
            int b = movie2.length();
            return a - b;            
        });
        System.out.println("Movie List in asc order according to their name length: \n"+ movieList);
        System.out.println();
        
        //Multiline Lambda to sort the movieList in ascending(alphabetical) order.
        //We must use return in multiline lambda
        Collections.sort(movieList, (movie1, movie2)->{
            return movie1.compareTo(movie2);
        });
        System.out.println("Movie List in alphabetical order: \n"+ movieList);
        System.out.println();
        
        //Single Line Lambda to sort the movieList in descending order according to their name length
        movieList.sort((m1, m2)-> m2.length() - m1.length());
        System.out.println("Movie List in desc order according to their name length: \n"+ movieList);
        System.out.println();
    }
}
