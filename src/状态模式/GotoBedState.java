package 状态模式;

public class GotoBedState extends State{

    @Override
    public void doSm(Person p) {
        if (p.getHour() == 21) {
            System.out.println("撩妹子");
        } else {
            p.setState(new SleepStata());
            p.doM();
        }
    }
}
