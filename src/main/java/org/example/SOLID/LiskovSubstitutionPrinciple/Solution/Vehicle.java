package org.example.SOLID.LiskovSubstitutionPrinciple.Solution;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    public Integer numberOfWheels(){
        return 2;
    }
}
class Bicycle extends Vehicle{

}

class EngineVehicle extends Vehicle{
    public Boolean hasEngine(){
        return true;
    }
}

class Car extends EngineVehicle {
    @Override
    public Integer numberOfWheels(){
        return 4;
    }
}

class Demo{
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Bicycle());
        vehicleList.add(new Car());
        for(Vehicle v : vehicleList)
            System.out.println(v.numberOfWheels().toString());

        List<EngineVehicle> ev = new ArrayList<>();
        ev.add(new Car());
        for(EngineVehicle e : ev){
            System.out.println(e.numberOfWheels().toString());
        }

            //Compile Time Eror
//        for(Vehicle v : vehicleList)
//            System.out.println(v.hasEngine());


            //Compile Time error
//        List<EngineVehicle> v = new ArrayList<>();
//        v.add(new Bicycle());
//



    }
}
