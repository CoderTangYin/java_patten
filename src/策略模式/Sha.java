package 策略模式;

/**
 * 算法的对应具体实现
 */
public class Sha implements Strategy{

    @Override
    public void encrypt() {
        System.out.println("sha");
    }
}
