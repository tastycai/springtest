package lcwms.springtest.designpattern.factory;

public class BenciCarFactory implements CarFactory {
    @Override
    public Car createCar() {

        return new BenciCar();
    }
}
