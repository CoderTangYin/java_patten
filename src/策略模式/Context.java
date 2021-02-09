package 策略模式;

/**
 * 策略外部的调用封装类
 */
public class Context {

    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void encrpyt() {
        this.strategy.encrypt();
    }
}
