package 桥接模式.汽车.CarType;

import 桥接模式.汽车.CarBrand.CarBrand;
import 桥接模式.汽车.Engine.Engine;

/**
 * 跑车
 */
public class SportsCar extends Car{


    public SportsCar(Engine engine, CarBrand carBrand) {
        super(engine, carBrand);
    }

    @Override
    public void installEngine() {
       Engine engine = super.getEngine();
       engine.installEngine();
    }

    @Override
    public void start() {
        System.out.println("跑车打火");
        CarBrand carBrand = super.getCarBrand();
        carBrand.start();
    }

    @Override
    public void stop() {
        System.out.println("跑车熄火");
        CarBrand carBrand = super.getCarBrand();
        carBrand.stop();
    }
}
