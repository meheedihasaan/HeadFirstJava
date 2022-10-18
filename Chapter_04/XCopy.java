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

//Page Number: 277

public class XCopy {
    
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig+" "+y);
    }
    
    int go(int arg){
        arg = arg*2;
        return arg;
    }
    
}
