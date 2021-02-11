package 命令模式;

public class LightTurnOff implements Command{

    private LightReceiver lightReceiver;

    public LightTurnOff(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.turnOff();
    }

    @Override
    public void undo() {
        lightReceiver.turnOn();
    }
}
