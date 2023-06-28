package org.example.DesignPatterns.DecoratorDP;

public abstract class BasePizza {
    public abstract int cost();
}

class Farmhouse extends BasePizza{

    @Override
    public int cost() {
        return 200;
    }
}

class VeggieDelight extends BasePizza{

    @Override
    public int cost() {
        return 150;
    }
}

class Margerita extends BasePizza{

    @Override
    public int cost() {
        return 100;
    }
}
