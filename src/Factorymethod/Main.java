package Factorymethod;
//工厂模式
//灵活控制生产过程
public class Main {
    public static void main(String[] args) {
//        Car c=new Car();
////        c.go();
        Moveable m=new CarFactory().createCar();
        m.go();
    }
}
