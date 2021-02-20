package 中介者模式.QQ例子;

import 中介者模式.QQ例子.QQ.QQManager;
import 中介者模式.QQ例子.User.UserA;
import 中介者模式.QQ例子.User.UserB;
import 中介者模式.QQ例子.User.UserC;
import 中介者模式.QQ例子.User.UserD;

public class Test {

    public static void main(String[] args) {

        UserA a = new UserA();
        UserB b = new UserB();
        UserC c = new UserC();
        UserD d = new UserD();
        
        QQManager manager = new QQManager();
        manager.addUser(a);
        manager.addUser(b);
        manager.addUser(c);
        manager.addUser(d);

        manager.setMessage(a,b,"你好");
        manager.setMessage(d,a,"干嘛呢？");
        manager.setAllMessage(a,"大家上班啦！");
    }
}
