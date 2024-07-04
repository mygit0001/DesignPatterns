package org.example.cars;
import org.example.cars.CarType;
import org.example.components.Engine;
import org.example.components.GPSNavigator;
import org.example.components.Transmission;
import org.example.components.TripComputer;


public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;


    public Car(CarType type, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType=type;
        this.seats = seats;
        this.engine=engine;
        this.transmission=transmission;
        this.tripComputer=tripComputer;
        this.gpsNavigator=gpsNavigator;
    }

    public CarType getCarType() {
        return this.carType;
    }

    public double getFuel() {
        return this.fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return this.seats;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Transmission getTransmission() {
        return this.transmission;
    }

    public TripComputer getTripComputer() {
        return this.tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return this.gpsNavigator;
    }
}
