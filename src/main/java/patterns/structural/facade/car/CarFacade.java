package patterns.structural.facade.car;

import patterns.structural.facade.car.parts.Door;
import patterns.structural.facade.car.parts.Wheel;

public class CarFacade {

    private Door door = new Door();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        wheel.turn();
    }
}
