import Factories.VehicleFactoryImpl.BikeFactory;
import Factories.VehicleFactoryImpl.CarFactory;
import Factories.VehicleFactoryImpl.TruckFactory;
import Factories.VehicleFactory;
import Vehicles.Vehicle;

public class Main {
    public static void main(String[] args){
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory bikeFactory = new BikeFactory();
        VehicleFactory truckFactory = new TruckFactory();
        Vehicle car = carFactory.createVehicle();
        Vehicle bike = bikeFactory.createVehicle();
        Vehicle truck = truckFactory.createVehicle();
        System.out.println(car.getType()); //Car
        System.out.println(bike.getType()); //Bike
        System.out.println(truck.getType()); //Truck
    }
}
