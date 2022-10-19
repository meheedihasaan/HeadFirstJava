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
public class BeTheJVM {
    
    public static void main(String[] args) {
        BeTheJVM jvm = new BeTheJVM();
        jvm.go();
    }
    
    void go(){
        int value = 7;
        for(int i = 1; i < 8; i++){
            value++;
            if(i > 4){
                System.out.println(++value);
            }
            if(value > 14){
                System.out.println("i = "+i);
                break;
            }
        }
    }
    
}
