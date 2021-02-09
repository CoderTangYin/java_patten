package 模板模式;

public abstract class SoyaMild {

    // 总体调用流程
    final void make() {
        select();
        if (customerwantcondiments()) addCondiments();
        soak();
        beat();
    }

    // 选豆子
    void select() {
        System.out.println("选择黄豆");
    }

    // 加配料
    abstract void addCondiments();

    // 泡豆子
    void soak() {
        System.out.println("泡豆子哦");
    }

    void beat() {
        System.out.println("放进豆浆机搅拌");
    }

    // 模板模式钩子方法
    boolean customerwantcondiments() {
        return true;
    }
}
