package patterns.creational.factorymethod;

public class CarSelector {

    public Car getCar(RoadType type){
        Car car = null;
        switch (type){
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
            case LAWN:
                car = new NewGeep();
                break;
        }
        return car;
    }
}
