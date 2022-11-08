/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13;

/**
 *
 * @author User
 */

class MyEx extends Exception {}

public class ExTestDrive {
    public static void main(String[] args) {
        String test = "yes";
        try{
            System.out.print("t");
            doRisky(test);
            System.out.print("o");
        }
        catch(MyEx e){
            System.out.print("a");
        }
        finally{
            System.out.print("ws");
        }
    }
    
    public static void doRisky(String t) throws MyEx {
        System.out.print("h");
        if("yes".equals(t)){
            throw new MyEx();
        }
        System.out.print("r");
    }
}
