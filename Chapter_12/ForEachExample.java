/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12;

import java.util.List;
import java.util.Set;

/**
 *
 * @author User
 */
public class ForEachExample {
    
    public static void main(String[] args) {
        //Create colorList using List.of()
        List<String> colorList = List.of("Blue", "Black", "Orange", "Magenta", "Sky");
        //Accessing colorList through foreach
        colorList.forEach(color->System.out.print(color+" "));
        System.out.println();
        
        //Create countrySet using Set.of();
        Set<String> countrySet= Set.of("Bangladesh", "India", "Pakistan", "Nepal");
        //Accessing countrySet through foreach
        countrySet.forEach(country->System.out.print(country+" "));
        System.out.println();
    }
    
}
