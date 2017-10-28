package patterns.creational.abstractfactory.transport.impl.car;

import patterns.creational.abstractfactory.transport.interfaces.Car;

public class Porsche implements Car {

    public void drive() {
        System.out.println("Porsche drive");
    }

    public void stop() {
        System.out.println("Porsche stopped");
    }
}
