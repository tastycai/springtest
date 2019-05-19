package lcwms.springtest.designpattern.factory;

public class FactoryTest {

    public static void main(String[] args){

        CarFactory carFactory = new BenciCarFactory();

        Car car = carFactory.createCar();

        System.out.println(car);
    }
}
