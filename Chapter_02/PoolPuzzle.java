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
public class PoolPuzzle {
    
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while(x < 2){
            e1.hello();
            System.out.println("helloooo... ");
            if(x == 0){
                e2.count = e2.count+1;
            }
            if(x == 0){
                e2.count = e2.count+1;
            }
            x = x+1;
        }
        System.out.println(e2.count);
    }
    
}

class Echo{
    int count = 8;
    void hello(){
        System.out.println("helloooo... ");
    }
}
