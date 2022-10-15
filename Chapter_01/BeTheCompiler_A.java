/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_01;

/**
 *
 * @author Acer
 */
public class BeTheCompiler_A {
    
    public static void main(String[] args) {
        int x = 1;
        while(x < 10){
            x = x+1;  //I have added 1 to x instead of substracted 1 from x.
            if(x < 3){
                System.out.println("small x");
            }
        }
    }
    
}
