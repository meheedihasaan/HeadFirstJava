/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ArrayList_String {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dhaka");
        list.add("Barisal");
        list.add("Sylhet");
        list.add("Rangpur");
        list.add("Rajshahi");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    
}
