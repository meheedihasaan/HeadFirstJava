/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_01;

import java.util.Random;

/**
 *
 * @author Acer
 */
public class RandomGenerator {
    
    public static void main(String[] args) {
        //Create Three String Array
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled","strongly typed"};        
        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloudnative", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};        
        String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline", "servicemesh", "architecture", "perspective", "design", "orientation"};
    
        //Find out how many words in each Array
        int length1 = wordListOne.length;
        int length2 = wordListTwo.length;
        int length3 = wordListThree.length;
        
        //Generate Three Random Numbers
        Random random = new Random();
        int ran1 = random.nextInt(length1);
        int ran2 = random.nextInt(length2);
        int ran3 = random.nextInt(length3);
        
        //Build a phrase
        String phrase = wordListOne[ran1]+" "+wordListTwo[ran2]+" "+wordListThree[ran3];
        
        //Print Out Phrase
        System.out.println(phrase);
    }
}
