/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13;

/**
 *
 * @author User
 */
public class ExceptionHandling_TryCatchFinally {
    public static void main(String[] args) {
        String test = "yes";
        try{
            System.out.println("Start Try");
            doRisky(test);
            System.out.println("End Try");
        }
        catch(ScaryException e){
            System.out.println("Scary Exception");
        }
        finally{
            System.out.println("Finally");
        }
    }
    
    public static void doRisky(String test) throws ScaryException {
        System.out.println("Start Risky");
        if("yes".equals(test)){
            throw new ScaryException();
        }
        System.out.println("End Risky");
    }
}

class ScaryException extends Exception{
    
}
