package org.example.DesignPatterns.StrategyDP;

public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}

class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}

class GoodsVehicle extends Vehicle{

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}