/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_03;

/**
 *
 * @author Acer
 */

class Books {
    String title;
    String author;
}

public class BeTheCompiler_A {
    
    public static void main(String[] args) {
        //Create myBooks array and put some books into it
        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        
        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[0].author = "Bob";
        myBooks[1].title = "The Java Gatsby";
        myBooks[1].author = "Sue";
        myBooks[2].title = "The Java Cookbook";
        myBooks[2].author = "Tan";
        
        while(x < 3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x+1;
        }
    }
    
}
