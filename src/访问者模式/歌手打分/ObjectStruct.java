package 访问者模式.歌手打分;

import java.util.LinkedList;
import java.util.List;

public class ObjectStruct {

    // 存储所有的人
    private List<Person> list = new LinkedList<>();

    // 添加一个评分的人
    public void attache(Person person) {
        list.add(person);
    }

    // 移除一个评分的人
    public void detach(Person person) {
        list.remove(person);
    }

    public void display(Action action) {
        for (Person p :
                list) {
            p.accept(action);
        }
    }
}
