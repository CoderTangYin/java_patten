package 桥接模式.汽车.CarType;

import 桥接模式.汽车.CarBrand.CarBrand;
import 桥接模式.汽车.Engine.Engine;

/**
 * 车的抽象类
 *
 * 1 发动机
 * 2 车的品牌
 * 3 车的基本功能
 *
 */
public abstract class Car {

    // 车的发动机
    private Engine engine;
    // 车的品牌
    private CarBrand carBrand;

    public Car(Engine engine, CarBrand carBrand) {
        this.engine = engine;
        this.carBrand = carBrand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public abstract void installEngine();
    public abstract void start();
    public abstract void stop();


}
