package 桥接模式;

public class Client {
    public static void main(String[] args) {
        // 或者折叠手机（样式+品牌）


        Client.miBrand();
        System.out.println("——————————————————————————————————————————");
        Client.vivoBrand();


        /**
         * 手机是个抽象的概念 任何手机都有相同的功能  在这个之下就会有折叠手机 滑盖
         * 手机 相应的就会有对应的品牌
         *
         */

    }

    public static void miBrand() {
        // 小米的折叠
        Phone miPhone = new FoldedPhone(new MiPhone());
        Phone MiPhoneUp = new UpRightPhone(new MiPhone());

        miPhone.open();
        miPhone.call();
        miPhone.close();

        MiPhoneUp.open();
        MiPhoneUp.call();
        MiPhoneUp.close();
    }

    public static void vivoBrand() {
        // vivo的折叠
        Phone vivoPhone = new FoldedPhone(new VivoPhone());
        Phone vivoPhoneUp = new UpRightPhone(new VivoPhone());

        vivoPhone.open();
        vivoPhone.call();
        vivoPhone.close();

        vivoPhoneUp.open();
        vivoPhoneUp.call();
        vivoPhoneUp.close();

    }

}
