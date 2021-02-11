package 建造者模式;

/**
 * 包工头（大包，开布加迪，用麻袋数钱天天做SPA的）
 */
public class Director {

    // 小包（开宝马5系 给大包点烟，提溜麻袋的在后边跟着的）
    private HouseBuilder builder;

    public Director(HouseBuilder builder) {
        this.builder = builder;
    }

    // 吃盒饭的苦逼民工搬砖
    public void makeHouse() {
        builder.maekFloor();
        builder.makeWall();
        builder.makeCeil();
    }

    /**
     * 整体的调用流程就是
     * 1.当官的找到开发商大包来谈钱 几几开 怎么分
     * 2.大包把手底下小包叫到一起吃饭喝酒 聊承包的事 顺道做做SPA
     * 3.小包开着宝马5系 回村显摆嘚瑟 找村里的年轻壮劳力出来搬砖
     */
}
