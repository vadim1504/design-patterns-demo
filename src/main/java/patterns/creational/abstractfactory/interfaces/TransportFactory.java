package patterns.creational.abstractfactory.interfaces;

import patterns.creational.abstractfactory.transport.interfaces.Aircraft;
import patterns.creational.abstractfactory.transport.interfaces.Car;

public interface TransportFactory {

    Car createCar();

    Aircraft createAircraft();
}
