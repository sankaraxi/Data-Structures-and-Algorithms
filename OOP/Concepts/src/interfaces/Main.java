package interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//
//        car.start();
//        car.accelerate();
//        car.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
        car.startMusic();
    }
}
