package 策略模式;

public class User {
    public static void main(String[] args) {
        Context context = new Context(new MD5());
        context.encrpyt();

        Context context1 = new Context(new Sha());
        context1.encrpyt();
    }
}
