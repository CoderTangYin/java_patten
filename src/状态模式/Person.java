package 状态模式;

public class Person {

    private int hour;
    private State state;

    public Person() {
        state = new WakeUpState();
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void doM() {
        // 因为上边的初始化是从WakeUpState开始的 后续的执行按这个链执行结束
        state.doSm(this);
        // 整个链条执行结束了 再回到最初的状态
        state = new WakeUpState();

    }
}
