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
public class PoolPuzzleOne {
    //a noise, annoise, an oyster
    public static void main(String [] args) {
        int x = 0;
        while (x < 2) {
            System.out.print("a ");
            if ( x < 1 ) {
                System.out.print("noise");
            }
            System.out.println();
            if (x < 1) {
                System.out.print("an");
                x++;
            }
            if ( x == 1 ) {
                System.out.println("noise");
            }
            if (x == 1) {
                System.out.print("an oyster");
            }
            System.out.println();
            x++;
        }
    }
    
}
