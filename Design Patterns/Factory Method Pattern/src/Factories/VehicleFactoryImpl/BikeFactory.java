package Factories.VehicleFactoryImpl;

import Factories.VehicleFactory;
import Vehicles.Vehicle;
import Vehicles.VehicleImpl.Bike;

public class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}