package Factories.VehicleFactoryImpl;

import Factories.VehicleFactory;
import Vehicles.Vehicle;
import Vehicles.VehicleImpl.Car;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(){
        return new Car();
    }
}
