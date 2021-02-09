package 适配器模式.引用;

public class User {

    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Power());
        adapter.level7();
    }
}
