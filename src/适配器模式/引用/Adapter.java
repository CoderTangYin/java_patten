package 适配器模式.引用;

public class Adapter {

    private Power power;
    public Adapter(Power power) {
        this.power = power;
    }

    public void level7() {
        this.power.level9();
        System.out.println("9转成7");
    }
}
