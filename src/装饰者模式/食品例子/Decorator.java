package 装饰者模式.食品例子;

public class Decorator extends Drink {

    Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // 自己的价格 + drink价格
        return super.getPrice() + drink.getPrice();
    }

    @Override
    public String getDes() {
        return "配料名字：" + super.getDes() + " 配料价格：" + super.getPrice() + " 咖啡名字：" + drink.getDes();

    }
}
