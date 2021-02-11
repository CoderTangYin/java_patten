package 命令模式;

public class Invoke {

    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public Invoke() {

        // 初始化所以的按钮命令 默认都为空命令
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 给对应编号的按钮设计命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    // 点击按钮执行开命令
    public void btnClickOn(int no) {
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    // 点击按钮执行关闭命令
    public void btnClickOff(int no) {
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    // 点击按钮执行撤销命令
    public void btnClickUndo() {
        undoCommand.undo();
    }
}
