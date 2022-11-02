/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author User
 */

//Movies Class
class Movies{
    public String title;
    
    public Movies(String title){
        this.title = title;
    }
    
    @Override
    public String toString(){
        return title;
    }
}

//Driver Class
public class TestTreeSet {
    public static void main(String[] args) {
        new TestTreeSet().go();
    }
    
    public void go(){
        List<Movies> movieList = new ArrayList<>();
        movieList.add(new Movies("Titanic"));
        movieList.add(new Movies("Troy"));
        movieList.add(new Movies("Avatar"));
        movieList.add(new Movies("Ironman"));
        
        //Sort according to title in descendinig order
        Set<Movies> movieSet = new TreeSet<>((m1, m2)-> m2.title.compareTo(m1.title));
        
        //Storing movieList inside movieSet
        movieSet.addAll(movieList);
        
        System.out.println("Sort movieSet according to title in descending order: ");
        System.out.println(movieSet);
    }
}
