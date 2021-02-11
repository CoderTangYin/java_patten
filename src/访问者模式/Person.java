package 访问者模式;

public abstract class Person {

    // 传过来一个action供人去选择
    public abstract void accept(Action action);
}
