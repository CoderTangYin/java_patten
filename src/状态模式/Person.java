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
        state.doSm(this);
        state = new WakeUpState();

    }
}
