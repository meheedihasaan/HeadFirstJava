/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_04;

/**
 *
 * @author Acer
 */

//Page Number: 282

public class PoolPuzzle {
    public static void main(String[] args) {
        Pool[] pools = new Pool[6];
        int number = 1;
        int i = 0;
        while(i < 6){
            pools[i] = new Pool();
            pools[i].intValue = number;
            number = number*10;
            i = i + 1;
        }
        int result = 0;
        i = 6;
        while(i > 0){
            i = i-1;
            result = result + pools[i].doStuff(i);
        }
        System.out.println("result "+result);
    }
}

class Pool {
    int intValue;
    public int doStuff(int index){
        if(intValue > 100){
            return intValue*index;
        }
        else{
            return intValue * (5-index);
        }
    }
}
