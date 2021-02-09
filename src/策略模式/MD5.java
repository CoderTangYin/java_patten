package 策略模式;

/**
 * 算法的对应具体实现
 */
public class MD5 implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("md5");
    }
}
