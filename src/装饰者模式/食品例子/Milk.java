package 装饰者模式.食品例子;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(15);
    }
}
