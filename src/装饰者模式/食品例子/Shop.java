package 装饰者模式.食品例子;

public class Shop {

    public static void main(String[] args) {
        Drink longBlack = new LongBlack();

        longBlack = new Milk(longBlack);
        longBlack = new Chocolate(longBlack);

        System.out.println(longBlack.getDes());


    }
}
