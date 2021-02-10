package 组合模式;

public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    // 这里不用写add remove 因为这个是叶子节点
    @Override
    protected void print() {

    }
}
