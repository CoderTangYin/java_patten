package 工厂模式.多态工厂;

public class FruitFactory {

    /**
     *  简单工厂违背了开放封闭原则
     *
     *  在这里如果外界加一下水果 工厂中就要添加对应的方法
     *
     **/



    public Fruit getApple() {
        return new Apple();
    }

    public Fruit getPear() {
        return new Pear();
    }
}
