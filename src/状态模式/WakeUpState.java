package 状态模式;

public class WakeUpState extends State {

    @Override
    public void doSm(Person p) {
        if (p.getHour() == 7) {
            System.out.println("上班赚钱");
        } else {
            p.setState(new GotoBedState());
            p.doM();
        }
    }
}
