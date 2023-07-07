package practice.DecoratorDP;

public abstract class CoffeeTopper extends Coffee {
}

class Creamer extends CoffeeTopper{

    Coffee coffee;
    public Creamer(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    int cost() {
        return coffee.cost() + 20;
    }
}

class Milk extends CoffeeTopper{

    Coffee coffee;
    public Milk(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    int cost() {
        return coffee.cost() + 30;
    }
}
