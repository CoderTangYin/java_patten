package 建造者模式;

public class CityBuilder implements HouseBuilder {

    House house = new House();

    @Override
    public void maekFloor() {
        System.out.println("城市风格- 地板");
        house.floor = "城市风格- 地板";
    }

    @Override
    public void makeWall() {
        System.out.println("城市风格- 墙");
        house.wall = "城市风格- 墙";
    }

    @Override
    public void makeCeil() {
        System.out.println("城市风格- 天花板");
        house.ceil = "城市风格- 天花板";
    }

    @Override
    public House getHouse() {
        return house;
    }
}
