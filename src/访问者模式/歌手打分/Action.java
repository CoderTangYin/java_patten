package 访问者模式.歌手打分;

public abstract class Action {

    // 得到男性的评价
    public abstract void getManResult(Man man);

    // 得到女性的评价
    public abstract void getWomanResult(Woman woman);
}
