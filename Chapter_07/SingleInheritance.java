/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_07;

/**
 *
 * @author User
 */

//Super Class
class Book{
    public void printBook(){
        System.out.println("Class Book");
    }
}

//Sub Class
class Novel extends Book{
    public void printNovel(){
        System.out.println("Class Novel");
    }
}

//Driver Class
public class SingleInheritance {
    
    public static void main(String[] args) {
        Book b = new Book();
        b.printBook();
        System.out.println();
        
        Novel n = new Novel();
        n.printNovel();
        n.printBook();
    }
    
}
