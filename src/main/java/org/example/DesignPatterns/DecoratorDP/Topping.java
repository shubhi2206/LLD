package org.example.DesignPatterns.DecoratorDP;

public abstract class Topping extends BasePizza {

}

class Extracheese extends Topping{

    BasePizza basePizza;

    public Extracheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}

class Mushroom extends Topping{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
