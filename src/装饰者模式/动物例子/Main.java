package 装饰者模式.动物例子;

public class Main {

    public static void main(String[] args) {
        ComponentAnimal componentAnimal = new ConcreteComponentDog();
        ComponentAnimal decorator = new ConcreteDecorator(componentAnimal);
        decorator.baseProperty();

    }
}
