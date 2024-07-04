package org.example;

import org.example.builders.CarBuilder;
import org.example.builders.CarManualBuilder;
import org.example.cars.Car;
import org.example.cars.Manual;
import org.example.director.Director;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Director director=new Director();
        CarBuilder carBuilder=new CarBuilder();
        director.constructCityCar(carBuilder);

        Car car=carBuilder.getResult();
        System.out.println("Car built: "+car.getCarType());

        CarManualBuilder carManualBuilder=new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        Manual manual=carManualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + manual.print());
    }
}