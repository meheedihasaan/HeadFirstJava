/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_05;

/**
 *
 * @author Acer
 */
public class CodeMagnets {
    
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            if(i == 1){
                i++;
            }
            for (int j = 4; j > 2; j--) {
                System.out.println(i+" "+j);
            }            
        }
    }
    
}
