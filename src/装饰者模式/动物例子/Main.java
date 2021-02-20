package 装饰者模式.动物例子;

public class Main {

    public static void main(String[] args) {
        // 初始化被装饰对象
        ComponentAnimal componentAnimal = new ConcreteComponentDog();
        // 把被装饰对象放进装饰器 添加功能
        ComponentAnimal decorator = new ConcreteDecorator(componentAnimal);
        decorator.baseProperty();

    }
}
