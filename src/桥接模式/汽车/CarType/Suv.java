package 桥接模式.汽车.CarType;

import 桥接模式.汽车.CarBrand.CarBrand;
import 桥接模式.汽车.Engine.Engine;

public class Suv extends Car {

    public Suv(Engine engine, CarBrand carBrand) {
        super(engine, carBrand);
    }

    @Override
    public void installEngine() {
        Engine engine = super.getEngine();
        engine.installEngine();
    }

    @Override
    public void start() {
        Engine engine = super.getEngine();
        engine.fire();
        CarBrand carBrand = super.getCarBrand();
        carBrand.start();
    }

    @Override
    public void stop() {
        Engine engine = super.getEngine();
        engine.stopFire();
        CarBrand carBrand = super.getCarBrand();
        carBrand.stop();
    }
}
