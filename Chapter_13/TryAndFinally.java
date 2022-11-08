/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13;

/**
 *
 * @author User
 */
public class TryAndFinally {
    public static void main(String[] args) {
        String test = "no";
        try{
            System.out.println("Start Try");
            doRisky(test);
            System.out.println("End Try");
        }
        finally{
            System.out.println("Finally");
        }
    }
    
    public static void doRisky(String test) {
        System.out.println("Risky");
    }
}

