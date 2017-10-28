package patterns.creational.abstractfactory.transport.implAircraft;

import patterns.creational.abstractfactory.transport.interfaces.Aircraft;

public class Boeing747 implements Aircraft {

    public void flight() {
        System.out.println("Boeing747 flight");
    }
}
