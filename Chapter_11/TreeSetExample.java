/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_11;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author User
 */
public class TreeSetExample {
    public static void main(String[] args) {
        new TreeSetExample().go();
    }
    
    public void go(){
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix Your Body");
        Book b3 = new Book("Finding Emo");
        
        //books set will be sorted according to title using Lambda Expression
        //Set<Book> books = new TreeSet<>((book1, book2)-> book1.title.compareTo(book2.title));
       
        //books set will be sorted according to title using Class
        Set<Book> books = new TreeSet<>(new BookComparator());
        books.add(b1);
        books.add(b2);
        books.add(b3);
        
        //books sorted according to title
        System.out.println(books.toString());
    }
}

//Book Class
class Book{
    public String title;
    public Book(String title){
        this.title = title;
    }
    
    @Override
    public String toString(){
        return title;
    }
}

//Comparator
class BookComparator implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.title.compareTo(o2.title);
    }    
}
