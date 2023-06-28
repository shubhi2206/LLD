package org.example.SOLID.InterfaceSegmentedPrinciple;

public interface RestaurantEmployee {
    void washDishes();
    void serveCustomers();
    void cookFood();
}

class Waiter implements RestaurantEmployee{

    @Override
    public void washDishes() {
        //Not required
    }

    @Override
    public void serveCustomers() {
        System.out.println("Serving Customers");
    }

    @Override
    public void cookFood() {
        //Not required
    }
}

//Here methods that are not required are also being implemented. Thus principle is not followed.
//Break down interfaces into multiple interfaces.
interface WaiterInterface{
    void takeOrder();
    void serveCustomers();
}

interface ChefInterface{
    void decideMenu();
    void cookFood();
}
