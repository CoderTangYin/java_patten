package 模板模式;

public class Client {

    public static void main(String[] args) {

        SoyaMild redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        SoyaMild peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        SoyaMild pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
