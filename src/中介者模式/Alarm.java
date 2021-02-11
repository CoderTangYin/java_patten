package 中介者模式;

public class Alarm extends Colleague{

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        // TODO Auto-generated constructor stub
        //在创建 Alarm 同事对象时，将自己放入到 ConcreteMediator 对象中[集合]
        mediator.Register(name, this);
    }

    public void SendAlarm(int stateChange) {
        SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        // TODO Auto-generated method stub
        //调用的中介者对象的 getMessage
        this.GetMediator().GetMessage(stateChange, this.name);
    }
}
