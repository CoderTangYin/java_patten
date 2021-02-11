package 访问者模式.歌手打分;

public class Client {

    public static void main(String[] args) {

        ObjectStruct objectStruct = new ObjectStruct();
        // 添加评委
        objectStruct.attache(new Man());
        objectStruct.attache(new Woman());


        Success success = new Success();
        Fail fail = new Fail();

        objectStruct.display(success);
        objectStruct.display(fail);

    }
}
