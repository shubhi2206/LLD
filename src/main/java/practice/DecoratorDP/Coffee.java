package practice.DecoratorDP;

public abstract class Coffee {
    abstract int cost();
}

class Decaf extends Coffee{

    @Override
    public int cost() {
        return 100;
    }
}

class Cappucino extends Coffee{

    @Override
    int cost() {
        return 150;
    }
}

class IcedCoffee extends Coffee{

    @Override
    int cost() {
        return 200;
    }
}
