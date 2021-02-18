package 装饰者模式;

public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);

        setDes("巧克力");
        setPrice(20);
    }
}
