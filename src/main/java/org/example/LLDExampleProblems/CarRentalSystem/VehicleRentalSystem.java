package org.example.LLDExampleProblems.CarRentalSystem;

import java.util.List;

public class VehicleRentalSystem {
    List<User> users;
    List<Store> stores;

    public VehicleRentalSystem(List<User> users, List<Store> stores) {
        this.users = users;
        this.stores = stores;
    }

    public Store getStore(Location location){
        return stores.get(0);
    }

    //Add users, remove users -- All Crud Operations
}
