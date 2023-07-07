package practice.DecoratorDP;

public class Demo {
    public static void main(String[] args) {
        Coffee coffee = new Creamer(new Milk(new IcedCoffee()));
        System.out.println(coffee.cost());

        Coffee coffee1 = new Creamer(new Decaf());
        System.out.println(coffee1.cost());
    }
}
