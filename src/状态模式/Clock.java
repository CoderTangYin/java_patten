package 状态模式;

public class Clock {

    public static void main(String[] args) {
        Person p = new Person();
        p.setHour(7);
        p.doM();

        p.setHour(21);
        p.doM();

        p.setHour(2);
        p.doM();

        p.setHour(7);
        p.doM();
    }
}
