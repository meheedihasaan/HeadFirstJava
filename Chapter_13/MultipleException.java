/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_13;

/**
 *
 * @author User
 */

//Laundry Class
class Laundry{
    public void doLaundry(String test) throws ShirtException, PantException {
        System.out.println("Start Shirt Laundry");
        if(test.equals("shirt")){
            throw new ShirtException();
        }
        System.out.println("End Shirt Laundry");
        
        System.out.println("Start Pant Laundry");
        if(test.equals("pant")){
            throw new PantException();
        }
        System.out.println("End Pant Laundry");
    }
}

//Driver Class
public class MultipleException {
    public static void main(String[] args) {
        Laundry l = new Laundry();
        String test = "shirt";
        try{
            System.out.println("Start Try");
            l.doLaundry(test);
            System.out.println("End Try");
        }
        catch(ShirtException s){
            System.out.println("Shirt Exception");
        }
        catch(PantException p){
            System.out.println("Pant Exception");
        }
    }
}

//ShirtException Class
class ShirtException extends Exception {
    
}

//PantException Class
class PantException extends Exception {
    
}
