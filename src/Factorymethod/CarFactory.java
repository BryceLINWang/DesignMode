package Factorymethod;
//针对一种产品建一个工厂
public class CarFactory {
    public Moveable createCar(){
        System.out.println("a car create!");
        return new Car();
    }
}
