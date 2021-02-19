package 桥接模式.汽车;

import 桥接模式.汽车.CarBrand.Audi;
import 桥接模式.汽车.CarBrand.BMW;
import 桥接模式.汽车.CarType.Car;
import 桥接模式.汽车.CarType.SportsCar;
import 桥接模式.汽车.CarType.Suv;
import 桥接模式.汽车.Engine.Engine2_0T;
import 桥接模式.汽车.Engine.Engine3_0T;

public class Driver {

    public static void main(String[] args) {

        Car carSport = new SportsCar(new Engine2_0T(), new Audi());
        carSport.installEngine();
        carSport.start();
        carSport.stop();


        Car carSuv = new Suv(new Engine3_0T(), new BMW());
        carSuv.installEngine();
        carSuv.start();
        carSuv.stop();

    }

}
