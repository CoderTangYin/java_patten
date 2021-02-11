package 命令模式;

public class LightTurnOn implements Command{

    private LightReceiver lightReceiver;


    public LightTurnOn(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.turnOn();
    }

    @Override
    public void undo() {
        lightReceiver.turnOff();
    }
}
