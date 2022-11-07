/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13;

/**
 *
 * @author User
 */

//Driver Class
public class ExceptionHandling_TryCatch {
    public static void main(String[] args) {
        String test = "yes";
        try{
            System.out.println("Start Try"); 
            doRisky(test);
            System.out.println("End Try");
        }
        catch(ScaryException1 e){
            System.out.println("Scary Exception");
        }
    }
    
    public static void doRisky(String test) throws ScaryException1 {
        System.out.println("Start Risky");
        if("yes".equalsIgnoreCase(test)){
            throw new ScaryException1();
        }
        System.out.println("End Risky");
    }
}

//ScaryException1 Class
class ScaryException1 extends Exception {
    
}
