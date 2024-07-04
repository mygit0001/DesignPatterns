package org.example.director;

import org.example.builders.Builder;
import org.example.cars.CarType;
import org.example.components.Engine;
import org.example.components.GPSNavigator;
import org.example.components.Transmission;
import org.example.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setEngine(new Engine(3.0,0));
        builder.setGPSNavigator(new GPSNavigator());
        builder.setSeats(2);
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
    }

    public void constructCityCar(Builder builder){
        builder.setCarType(CarType.CITY_CAR);
        builder.setEngine(new Engine(1.2,0));
        builder.setGPSNavigator(new GPSNavigator());
        builder.setSeats(4);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
    }

    public void constructSUV(Builder builder){
        builder.setCarType(CarType.SUV);
        builder.setEngine(new Engine(2.5,0));
        builder.setGPSNavigator(new GPSNavigator());
        builder.setSeats(7);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
    }


}
