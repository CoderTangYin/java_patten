package 访问者模式.歌手打分;

public class Success extends Action {


    @Override
    public void getManResult(Man man) {
        System.out.println("男性很喜欢");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女性很喜欢");
    }
}
