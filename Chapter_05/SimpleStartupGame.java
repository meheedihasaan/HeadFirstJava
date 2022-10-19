/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_05;

import java.util.Scanner;

/**
 *
 * @author Acer
 */

//Startup Class
class SimpleStartup{
    //Encapsulated Instance Variable
    private int[] locationCells;
    private int numOfHints = 0;
    
    //LocationCells Setter
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    
    //Method for cheching user's guess
    public String checkYourself(int guess){
        String result = "miss";
        for (int cell : locationCells) {
            if(guess == cell){
                result = "hit";
                numOfHints++;
                break;
            }
        }
        if(numOfHints == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}

//Helper Class to take user input
class GameHelper{
    public int getUserInput(String prompt){
        System.out.println(prompt+" : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

//Laucher Class
public class SimpleStartupGame {
    
    public static void main(String[] args) {
        int numOfGuesses = 0;
        
        //Instantiate the Helper class and SimpleStartup Class
        GameHelper helper = new GameHelper();
        SimpleStartup theStartup = new SimpleStartup();
        
        int randomNum = (int) (Math.random() * 5);
        int locations[] = {randomNum, randomNum+1, randomNum+2};
        theStartup.setLocationCells(locations);
        
        boolean isAlive = true;
        while(isAlive){
            int guess = helper.getUserInput("Enter a Number");
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("Yout took "+numOfGuesses+" guesses.");
            }
        }
    }
    
}
