/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_02;

import java.util.Random;

/**
 *
 * @author Acer
 */

class Player{
    int num;
    void guess(){
        Random random = new Random();
        num = random.nextInt(10); //Take a random number between 0 to 9
    }
}

class GuessGame{
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;
        
        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;
        
        //Generate Random number between 0 to 9;
        int targetNumber = (int) (Math.random()*10);
        System.out.println("I'm thinking ");
        
        while(true){
            System.out.println("Number to guess is "+targetNumber);
            
            //Players guess
            p1.guess();
            p2.guess();
            p3.guess();
            
            guess1 = p1.num;
            System.out.println("Player One guessed "+guess1);
            
            guess2 = p2.num;
            System.out.println("Player Two guessed "+guess2);
            
            guess3 = p3.num;
            System.out.println("Player Three guessed "+guess3);
                    
            //Check Player's guess with targetNumber
            if(guess1 == targetNumber){
                p1IsRight = true;
            }
            if(guess2 == targetNumber){
                p2IsRight = true;
            }
            if(guess3 == targetNumber){
                p3IsRight = true;
            }
            
            //If any of three players guessed correctly then we got a winner otherwise play again.
            if(p1IsRight || p2IsRight || p3IsRight){
                System.out.println("We have a winner");
                System.out.println("Player One got it right? "+p1IsRight);
                System.out.println("Player Two got it right? "+p2IsRight);
                System.out.println("Player Three got it right? "+p3IsRight);
                System.out.println("Game is over.");
                break; //
            }
            else{
                System.out.println("Player will have to play again.");
            }   
        }
    }
}

public class GameLaucher {
    
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
    
}
