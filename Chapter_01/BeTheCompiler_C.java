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
public class BeTheCompiler_C {
    
    /* In this example, there was not given any main method and then the code didn't run.
     * I have added a main method and put all the statement inside it. Now it is compiling.
     */
    public static void main(String[] args) {
        int x = 5;
        while(x > 1){
            x = x-1;
            if(x < 3){
                System.out.println("small x");
            }
        }
    }
    
}
