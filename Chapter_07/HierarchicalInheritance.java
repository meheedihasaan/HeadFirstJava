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
class Person{
    public String name;
    public int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String details(){
        return "Name: "+name+", Age: "+age;
    }
}

//Sub Class-1
class Teacher extends Person{
    public String subject;
    
    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }
    
    @Override
    public String details(){
        return super.details()+", Subject: "+subject+".";
    }
}

//Sub Class-2
class Student extends Person{
    public int studentId;
    
    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }
    
    @Override
    public String details(){
        return super.toString()+", Student Id: "+studentId+".";
    }
}

//Driver Class
public class HierarchicalInheritance {
    
    public static void main(String[] args) {
        Teacher t = new Teacher("Md Sazzadur Rahman", 35, "English");
        System.out.println(t.details());
        
        Student s = new Student("Md Mehedi Hasan", 19, 111941);
        System.out.println(s.details());
    }
    
}
