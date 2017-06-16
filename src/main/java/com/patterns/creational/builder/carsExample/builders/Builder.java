package com.patterns.creational.builder.carsExample.builders;

import com.patterns.creational.builder.carsExample.cars.Type;
import com.patterns.creational.builder.carsExample.components.Engine;
import com.patterns.creational.builder.carsExample.components.GPSNavigator;
import com.patterns.creational.builder.carsExample.components.Transmission;
import com.patterns.creational.builder.carsExample.components.TripComputer;

public interface Builder {

    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
