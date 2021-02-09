package 桥接模式;

public class Client {
    public static void main(String[] args) {
        // 或者折叠手机（样式+品牌）


        Client.miBrand();
        System.out.println("——————————————————————————————————————————");
        Client.vivoBrand();

    }

    public static void miBrand() {
        // 小米的折叠
        Phone miPhone = new FoldedPhone(new MiPhone());
        Phone vivoPhone = new UpRightPhone(new VivoPhone());

        miPhone.open();
        miPhone.call();
        miPhone.close();

        vivoPhone.open();
        vivoPhone.call();
        vivoPhone.close();
    }

    public static void vivoBrand() {
        // vivo的折叠
        Phone miPhone = new FoldedPhone(new VivoPhone());
        Phone vivoPhone = new UpRightPhone(new VivoPhone());

        miPhone.open();
        miPhone.call();
        miPhone.close();

        vivoPhone.open();
        vivoPhone.call();
        vivoPhone.close();

    }

}
