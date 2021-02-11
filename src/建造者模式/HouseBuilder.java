package 建造者模式;

public interface HouseBuilder {
    void maekFloor();
    void makeWall();
    void makeCeil();
    House getHouse();
}
