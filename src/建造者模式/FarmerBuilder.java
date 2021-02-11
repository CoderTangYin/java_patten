package 建造者模式;

/**
 * 乡村风 装修团队
 */
public class FarmerBuilder  implements HouseBuilder{

    House house = new House();

    @Override
    public void maekFloor() {
        System.out.println("乡村风格- 地板");
        house.floor = "乡村风格- 地板";
    }

    @Override
    public void makeWall() {
        System.out.println("乡村风格- 墙");
        house.wall = "乡村风格- 墙";
    }

    @Override
    public void makeCeil() {
        System.out.println("乡村风格- 天花板");
        house.ceil = "乡村风格- 天花板";
    }

    @Override
    public House getHouse() {
        return house;
    }
}
