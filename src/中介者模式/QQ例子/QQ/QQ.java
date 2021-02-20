package 中介者模式.QQ例子.QQ;

import 中介者模式.QQ例子.User.User;

public interface QQ {
    void setMessage(User from, User to, String msg);
    void addUser(User user);
    void setAllMessage(User from,String msg);
}
