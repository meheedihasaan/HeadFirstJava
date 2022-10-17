/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_03;

/**
 *
 * @author Acer
 */
public class TestArray {
    
    public static void main(String[] args) {
        String[] islands = new String[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozume1";
        
        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        
        int y = 0;
        int ref;        
        while(y < 4){
            ref = index[y];
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
    
}
