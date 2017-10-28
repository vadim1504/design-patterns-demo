package patterns.creational.abstractfactory.impl;

import patterns.creational.abstractfactory.interfaces.TransportFactory;
import patterns.creational.abstractfactory.transport.impl.car.Niva;
import patterns.creational.abstractfactory.transport.implAircraft.TU134;
import patterns.creational.abstractfactory.transport.interfaces.Aircraft;
import patterns.creational.abstractfactory.transport.interfaces.Car;

public class RussianFactory implements TransportFactory {

    public Car createCar() {
        return new Niva();
    }

    public Aircraft createAircraft() {
        return new TU134();
    }
}
