package 建造者模式;

public class Main {

    public static void main(String[] args) {

       Main.wanda();
       System.out.println("___________");
       Main.hengda();

    }

    private static void wanda() {
        Director director = new Director(new FarmerBuilder());
        director.makeHouse();
    }

    private static void hengda() {
        Director director = new Director(new CityBuilder());
        director.makeHouse();
    }
}
