/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_12;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author User
 */
public class CoffeOrder {
    public static void main(String[] args) {
        List<String> coffees = List.of("Cappuccino", "Americano", "Espressso", "Cortado", "Mocha", "Cappuccino", "Flatg White", "Latte");
        List<String> cofeesEndingInO = coffees.stream()
                                        .filter(s->s.endsWith("o"))
                                        .sorted()
                                        .distinct()
                                        .collect(Collectors.toList());
        System.out.println(cofeesEndingInO);
    }
}
