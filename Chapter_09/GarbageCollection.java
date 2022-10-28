/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_09;

/**
 *
 * @author User
 */

class Language{
    public String name;
    public String country;
    
    //Constructor
    public Language(String name, String country){
        this.name = name;
        this.country = country;
    }
    
    public String details(){
        return "Language Name: "+name+", Country: "+country+".";
    }
}

public class GarbageCollection {
    public static void main(String[] args) {
        Language L1 = new Language("Bangla", "Bangladesh");
        System.out.println(L1.details());
        
        Language L2;
        L2 = new Language("English", "UK");
        System.out.println(L2.details());
        
        Language L3 = L1;
        System.out.println(L3.details());
        
        L2 = null;  //Object L2 is now garbage
    }
}
