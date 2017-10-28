package patterns.structural.facade;

import patterns.structural.facade.parts.Door;
import patterns.structural.facade.parts.Wheel;

public class CarFacade {

    private Door door = new Door();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        wheel.turn();
    }
}
