package lcwms.springtest.designpattern.factory;

public class BaomaCarFactory implements CarFactory {
    @Override
    public Car createCar() {

        return new BaomaCar();
    }
}
