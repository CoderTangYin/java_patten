package 组合模式;

/**
 * 抽象类 主要描述组织的基本信息跟方法 以及提供给子类的属性跟方法
 */
public abstract class OrganizationComponent {

    private String name;
    private String des;
    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected abstract void print();

}
