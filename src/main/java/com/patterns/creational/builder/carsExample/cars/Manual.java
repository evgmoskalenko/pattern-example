package com.patterns.creational.builder.carsExample.cars;

import com.patterns.creational.builder.carsExample.components.Engine;
import com.patterns.creational.builder.carsExample.components.GPSNavigator;
import com.patterns.creational.builder.carsExample.components.Transmission;
import com.patterns.creational.builder.carsExample.components.TripComputer;

/**
 * Руководство автомобиля — это второй продукт. Заметьте, что руководство и сам
 * автомобиль не имеют общего родительского класса. По сути, они независимы.
 */
public class Manual {

    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(Type type, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        StringBuilder info = new StringBuilder();
        info.append("Type of car: " + type + "\n");
        info.append("Count of seats: " + seats + "\n");
        info.append("Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n");
        info.append("Transmission: " + transmission + "\n");
        info.append("Trip Computer: Trip Computer" + "\n");
        info.append("GPS Navigator: GPS Navigator" + "\n");
        return info.toString();
    }

}
