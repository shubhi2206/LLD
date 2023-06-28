package org.example.DesignPatterns.DecoratorDP;

public class Demo {
    public static void main(String[] args) {
        BasePizza basePizza = new Mushroom(new Extracheese(new Farmhouse()));
        System.out.println(basePizza.cost());

        
    }
}
