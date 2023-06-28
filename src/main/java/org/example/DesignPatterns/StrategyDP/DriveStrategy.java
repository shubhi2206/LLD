package org.example.DesignPatterns.StrategyDP;

public interface DriveStrategy {
    void drive();
}

class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}

class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
