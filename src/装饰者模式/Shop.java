package 装饰者模式;

import java.util.logging.Logger;

public class Shop {

    public static void main(String[] args) {
        Drink longBlack = new LongBlack();

        longBlack = new Milk(longBlack);
        longBlack = new Chocolate(longBlack);

        System.out.println(longBlack.getDes());


    }
}
