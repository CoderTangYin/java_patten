package 中介者模式.QQ例子.User;

public class UserC implements User{
    @Override
    public void showMessage(String msg) {
        System.out.print("C"+msg+"\n");

    }
}
