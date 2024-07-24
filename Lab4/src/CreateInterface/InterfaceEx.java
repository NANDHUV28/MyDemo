package CreateInterface;

import java.util.Scanner;

interface Vehicle{
    void start();
    void stop();
    double getFuelLevel();
}
//Passenger Carrier
interface PassengerCarrier extends Vehicle{
    void addPassenger(int numPassengers);
    void removePassenger(int removePassenger);
}
//CargoCarrier
interface CargoCarrier extends Vehicle{
    void addCargo(double weight);
    void removeCargo(double removeCargo);
}
//vehicle base class
class VehicleBase implements Vehicle{
    double fuelLevel;

    public VehicleBase(double fuelLevel){
        this.fuelLevel = fuelLevel;
    }
    @Override
    public void start() {
        System.out.println("Vehicle Started");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle Stopped");
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }
}
//car class
class Car extends VehicleBase implements PassengerCarrier, CargoCarrier{
    int PassengersCount = 0;
    double CargoWeight = 0;

    public Car(double fuelLevel) {
        super(fuelLevel);
    }

    @Override
    public void addPassenger(int numPassengers){
        PassengersCount=numPassengers;
        System.out.println("Passengers Added " + numPassengers);
    }
    @Override
    public void removePassenger(int removePassenger){
        PassengersCount=removePassenger;
        System.out.println("Passengers Removed " + removePassenger);
    }
    @Override
    public void addCargo(double weight){
        CargoWeight=weight;
        System.out.println("Cargo Added " + weight);
    }
    @Override
    public void removeCargo(double removeCargo){
        CargoWeight=removeCargo;
        System.out.println("Cargo Removed " + removeCargo);
    }

}
public class InterfaceEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of passengers to be added: ");
        int numPassengers = sc.nextInt();
        System.out.println("Enter the weight to be added: ");
        double weight = sc.nextDouble();
        System.out.println("Enter the number of passengers to be removed: ");
        int remPassengers = sc.nextInt();
        System.out.println("Enter the number of Cargo to be removed: ");
        int remCargo = sc.nextInt();
        System.out.println("Enter the fuel level: ");
        double fuelLevel = sc.nextDouble();
        //create a car object
        Car car=new Car(fuelLevel);
        //Create a reference variable of type vehicle
        Vehicle vehicle=car;
        //Call methods using the interface reference variable
        vehicle.start();
        System.out.println("Fuel Level: "+fuelLevel);
        vehicle.stop();
//        vehicle.fuelLevel();
        //Cast the reference variable to access specialized methods
        if(vehicle instanceof PassengerCarrier){
            PassengerCarrier carrier=(PassengerCarrier)vehicle;
            carrier.addPassenger(numPassengers);
            carrier.removePassenger(remPassengers);
        }
        if(vehicle instanceof CargoCarrier){
            CargoCarrier carrier=(CargoCarrier)vehicle;
            carrier.addCargo(weight);
            carrier.removeCargo(remCargo);
        }
        sc.close();
    }

}
