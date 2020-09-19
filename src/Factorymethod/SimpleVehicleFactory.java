package Factorymethod;

/**
 * 简单工厂
 * 可扩展性并不好
 */
public class SimpleVehicleFactory {
    public Car createCar(){
        //before processing
        return new Car();
    }
    public Broom createBroom(){
        return new Broom();
    }
}
