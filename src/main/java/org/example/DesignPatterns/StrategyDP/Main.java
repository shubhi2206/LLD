package org.example.DesignPatterns.StrategyDP;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
        vehicle = new SportsVehicle();
        vehicle.drive();

    }
}
