package 命令模式;

/**
 * 空命令 用于初始化使用 调用的时候不做任何事情 可以省去对
 * 空命令的判断
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
