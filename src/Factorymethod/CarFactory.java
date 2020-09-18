package Factorymethod;

public class CarFactory {
    public Moveable createCar(){
        System.out.println("a car create!");
        return new Car();
    }
}
