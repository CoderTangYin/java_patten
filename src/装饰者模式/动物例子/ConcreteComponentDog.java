package 装饰者模式.动物例子;

public class ConcreteComponentDog implements ComponentAnimal {


    @Override
    public void baseProperty() {
        System.out.println("动物的基本能力");
    }

    @Override
    public String getName() {
        return "多多";
    }

}
