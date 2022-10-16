/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_02;

/**
 *
 * @author Acer
 */

class Movie{
    String name;
    String genre;
    int duration;
    
    void playIt(){
        System.out.println(name+" is Playing.");
    }
    
    void movieDetails(){
        System.out.println("Movie name is "+name+", Genre is "+genre+", and runtime is "+duration+" minutes.");
    }
}

public class MakingAndTestingMovieObject {
    
    public static void main(String[] args) {
        //First Instance
        Movie movie1 = new Movie();
        movie1.name = "Titanic";
        movie1.genre = "Romantic";
        movie1.duration = 186;
        movie1.playIt();
        movie1.movieDetails();
        System.out.println();
        
        //Second Instance
        Movie movie2 = new Movie();
        movie2.name = "Lord Of The Rings";
        movie2.genre = "Adventure";
        movie2.duration = 208;
        movie2.playIt();
        movie2.movieDetails();
        System.out.println();
        
        //Third Instance
        Movie movie3 = new Movie();
        movie3.name = "Don";
        movie3.genre = "Action";
        movie3.duration = 145;
        movie3.playIt();
        movie3.movieDetails();
    }
    
}
