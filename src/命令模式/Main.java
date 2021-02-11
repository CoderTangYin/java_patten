package 命令模式;

public class Main {
    public static void main(String[] args) {

        // 命令接受者
        LightReceiver lightReceiver = new LightReceiver();

        // 把命令传递给命令接受者
        LightTurnOn lightTurnOn = new LightTurnOn(lightReceiver);
        LightTurnOff lightTurnOff = new LightTurnOff(lightReceiver);

        // 命令调用者
        Invoke remoteController = new Invoke();
        remoteController.setCommand(0,lightTurnOn,lightTurnOff);

        // 命令调用者调用命令
        remoteController.btnClickOn(0);
        remoteController.btnClickOff(0);
        remoteController.btnClickUndo();
    }
}
