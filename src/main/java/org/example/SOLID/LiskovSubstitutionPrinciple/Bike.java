package org.example.SOLID.LiskovSubstitutionPrinciple;

public interface Bike {
    void startEngine();
    void accelerate();
}

class Bicycle implements Bike{
    @Override
    public void startEngine() {
        throw new AssertionError("No Engine Found");
    }

    @Override
    public void accelerate() {

    }
}

class MotorCycle implements Bike{

    boolean isEngineOn;

    int speed;
    @Override
    public void accelerate() {
        speed = speed + 10;
    }

    @Override
    public void startEngine() {
        isEngineOn = true;
    }
}

//When interface is instantiated via Motorcycle and then changed to Bicycle , it throws error. Thus principle not satisfied.
