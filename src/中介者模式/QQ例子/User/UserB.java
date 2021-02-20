package 中介者模式.QQ例子.User;

public class UserB implements User{
    @Override
    public void showMessage(String msg) {
        System.out.print("B"+msg+"\n");
    }
}
