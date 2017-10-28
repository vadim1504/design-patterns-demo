package patterns.creational.abstractfactory.impl;

import patterns.creational.abstractfactory.interfaces.TransportFactory;
import patterns.creational.abstractfactory.transport.impl.car.Porsche;
import patterns.creational.abstractfactory.transport.implAircraft.Boeing747;
import patterns.creational.abstractfactory.transport.interfaces.Aircraft;
import patterns.creational.abstractfactory.transport.interfaces.Car;

public class USAFactory implements TransportFactory {

    public Car createCar() {
        return new Porsche();
    }

    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
