/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_08;

/**
 *
 * @author User
 */

class Football{
    public String name;
    public int size;
    
    public Football(String name, int size){
        this.name = name;
        this.size = size;
    }
    
    public String showDetails(){
        return "Name: "+name+", Size: "+size+".";
    }
}

class FootballArrayList{
    Object footballs[] = new Object[3];
    private int index = 0;
    
    public void add(Object o){
        footballs[index] = o;
        System.out.println("Element added at index "+index);
        index++;
    }
    
    public Object get(int index){
        return footballs[index];
    }
}

public class DownCasting {
    public static void main(String[] args) {
        //Instantiate MyArrayList Class
        FootballArrayList list = new FootballArrayList();
        
        //Create 3 Football object and Add them into list
        Football f1 = new Football("Jabulani", 28);
        Football f2 = new Football("Brazuka", 29);
        Football f3 = new Football("Telstar", 28);
        
        list.add(f1);
        list.add(f2);
        list.add(f3);
        
        System.out.println();
        
        //Iterate Over The list
        for (int i = 0; i < 3; i++) {
            //This is Downcasting. Bcz Football reference refers to Object type object
            //When Sub class reference refers to Super class object, then it's called down casting
            Football f = (Football) list.get(i);
            System.out.println(f.showDetails());
        }
    }
}
