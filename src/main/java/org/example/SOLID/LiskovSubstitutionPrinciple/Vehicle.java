package org.example.SOLID.LiskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    public Boolean startEngine(){
        return true;
    }
    public Integer numberOfWheels(){
        return 2;
    };
}

class MotorCycle extends Vehicle{

}

class Car extends Vehicle{
    @Override
    public Integer numberOfWheels(){
        return 4;
    }
}

class Bicycle extends Vehicle{
    @Override
    public Boolean startEngine(){
        return null;
    }
}

class Demo{
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Bicycle());
        vehicleList.add(new Car());
        for(Vehicle v : vehicleList){
            System.out.println(v.startEngine().toString());
        }
    }
    //Output
//    Exception in thread "main" java.lang.NullPointerException
//    at org.example.SOLID.LiskovSubstitutionPrinciple.Demo.main(Vehicle.java:39)
}


//When interface is instantiated via Motorcycle and then changed to Bicycle , it throws error. Thus principle not satisfied.
