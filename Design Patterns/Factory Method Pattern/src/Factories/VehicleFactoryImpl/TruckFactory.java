package Factories.VehicleFactoryImpl;

import Factories.VehicleFactory;
import Vehicles.Vehicle;
import Vehicles.VehicleImpl.Truck;

public class TruckFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(){
        return new Truck();
    }
}
