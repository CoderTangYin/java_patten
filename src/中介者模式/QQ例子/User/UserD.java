package 中介者模式.QQ例子.User;

public class UserD implements User {
    @Override
    public void showMessage(String msg) {
        System.out.print("D"+msg+"\n");

    }
}
